package listItem.view;

import listItem.controller.Item;
import listItem.controller.ItemManager;
import listItem.model.ItemModel;
import listItem.view.EditItemDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ItemFrame extends JFrame implements ActionListener {
    //текст кнопок
    private static final String LOAD = "LOAD";
    private static final String ADD = "ADD";
    private static final String EDIT = "EDIT";
    private static final String DELETE = "DELETE";

    private final ItemManager itemManager = new ItemManager();
    private final JTable itemTable = new JTable();

    //в конструкторе созданидм нужный элемент
    public ItemFrame(){
        //выставляем свойство которое позволяет выставить только одну строку в табл
        itemTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        //используем layout manager
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gdc = new GridBagConstraints();
        //каждый элемент является последним в строке
        gdc.gridwidth = GridBagConstraints.REMAINDER;
        // элемент раздвигается на всю ячейку
        gdc.fill = GridBagConstraints.BOTH;
        //но имеет границы - слева, сверху и справа по 5. Снизу - 0
        gdc.insets = new Insets(5, 5, 0, 5);

        //создаем модель для кнопок
        JPanel btnPanel = new JPanel();
        // устанавливаем у него layout
        btnPanel.setLayout(gridbag);
        // Создаем кнопки
        btnPanel.add(createButton(gridbag, gdc, "Обновить", LOAD));
        btnPanel.add(createButton(gridbag, gdc, "Добавить", ADD));
        btnPanel.add(createButton(gridbag, gdc, "Исправить", EDIT));
        btnPanel.add(createButton(gridbag, gdc, "Удалить", DELETE));

        // создаем панель для левой колонки с кнопками
        JPanel left = new JPanel();
        //выставляем BorderLayout
        left.setLayout(new BorderLayout());
        // кладем панель с кнопками в верхнюю часть
        left.add(btnPanel, BorderLayout.NORTH);
        // кладем панель для левой колонки на форму слева
        add(left, BorderLayout.WEST);

        // кладем панель со скролингом, внутри которой наша таблица
        //теперь таблица может скролится
        add(new JScrollPane(itemTable), BorderLayout.CENTER);

        //выставляем координаты формы
        setBounds(100, 200, 900, 400);
        //при закрытие формы заканчивам работу приложения
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Загружаем предмет
        loadItem();
    }

    //метод создает кнопку с заданными характеристиками  - загаловками и действий
    private JButton createButton(GridBagLayout gridbag, GridBagConstraints gdc, String title, String action){
        //создаем с заголовком из title
        JButton button = new JButton(title);
        //действие будет определятся при обработке и будем знать какую кнопку мы нажали
        button.setActionCommand(action);
        //обработчиком событий от кнопки является сама форма
        button.addActionListener(this);
        // Выставляем свойства для размещения
        gridbag.setConstraints(button, gdc);
        return button;
    }

    @Override
    //обработка нажатий кнопок
    public void actionPerformed(ActionEvent e) {
        //получаем команду - ActionCommand
        String action = e.getActionCommand();
        //В зависимости от команды выполняем действия
        switch (action){
            //перегрузка данных
            case LOAD:
                loadItem();
                break;
                //Добавление записи
            case ADD:
                addItem();
                break;
                //Исправление записи
            case EDIT:
                editItem();
                break;
                //удаление
            case DELETE:
                deleteItem();
                break;
        }
    }



    //редактирование предмета
    private void editItem() {
        //получаем выделенную строку
        int sr = itemTable.getSelectedRow();
        //если строка выделена - можно ее редактировать
        if(sr != -1){
            //получаем ID контактов
            Long id = Long.parseLong(itemTable.getModel().getValueAt(sr, 0).toString());
            // получаем данные предметов по его ID
            Item item = itemManager.getItem(id);
            // создаем диалог для ввода данных и передаем туда предмет
            EditItemDialog eid = new EditItemDialog(item);
            // Обрабатываем закрытие диалога
            saveItem(eid);
        }else{
            //если строка не выделена сообщаем об этом
            JOptionPane.showMessageDialog(this, "Вы должны выделить строку для редактирования");
        }
    }
    //удаление контакта
    private void deleteItem() {
        // получаем выделенную скобку
        int sr = itemTable.getSelectedRow();
        if( sr != -1){
            //получаем ID item
            Long id = Long.parseLong(itemTable.getModel().getValueAt(sr, 0 ).toString());
            //удаляем
            itemManager.deleteItem(id);
            //перегружаем список
            loadItem();
        }else{
            JOptionPane.showMessageDialog(this, "Вы должны выделить строку для удоления");
        }
    }
    // Общий метод для добавления и изменения
    private void saveItem(EditItemDialog eid) {
        //если мы нажали кнопку SAVE
        if(eid.isSave()){
            //получаем предмет из диалогового окна
            Item itm = eid.getItem();
            if (itm.getItemID() != null){
                //Если ID у предмета есть то мы его обновляем
                itemManager.updateItem(itm);
            }else{
                //если у предмета нет ID значит он новый и мы его добавляем
                itemManager.addItem(itm);
            }
            loadItem();
        }
    }

    private void addItem() {
        //Создаем диалог для ввода данных
        EditItemDialog eid = new EditItemDialog();
        // обрабатываем закрытие диалога
        saveItem(eid);
    }

    //загружаем список контактов
    private void loadItem(){
        // обращаемся к классу для загрузки списка предметов
        List<Item> items = itemManager.findItem();
        //Создаем модель, который передает полученный список
        ItemModel im = new ItemModel(items);
        // передаем нашу модель таблице - и она может отображать
        itemTable.setModel(im);

    }
}
