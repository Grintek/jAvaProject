package listItem.view;

import listItem.controller.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditItemDialog extends JDialog implements ActionListener {

    // Заголовки кнопок
    private static final String SAVE = "SAVE";
    private static final String CANCEL = "CANCEL";

    //размер отступа
    private static final int PAD = 10;
    //Ширина метки
    private static final int W_L = 100;
    //Ширина поля для ввода
    private static final int W_T = 300;
    //Ширина кнопки
    private static final int W_B = 120;
    //высота элемента - общая для всех
    private static final int H_B = 25;

    //Поля для ввода Имени
    private final JTextPane txtName = new JTextPane();
    //Поля для ввода Вида предмета
    private final JTextPane txtSort = new JTextPane();
    //Поля для ввода количество предметов
    private final JTextPane txtSum = new JTextPane();
    //поля для ввода описание
    private final JTextPane txtDescription = new JTextPane();

    // Поля для хранения ID предметов, если мы собираемся редактировать
    // если это новый предмет - cjntactId == null
    private Long itemID = null;
    //Надо ли записывать изменения после закрытие диалога
    private boolean save = false;

    public EditItemDialog(){
        this(null);
    }

    public EditItemDialog(Item item){
        // убиваем layout - будем использовать абсолютные координаты
        setLayout(null);

        //выстраиваем метки и поля для ввода
        buildFields();
        // если передали предмет - заполняем поле формы
        initField(item);
        // выставляем кнопки
        buildButtons();

        // диалог в модульном режиме - только он активен
        setModal(true);
        //запрещаем изменение размеров
        setBounds(300, 300, 450, 200);
        //делаем формувидемой
        setVisible(true);

    }

    //Размещаем метки и поля ввода на форме
    private void buildFields() {
        //набор метки и поля для Имени
        JLabel ldlItemName = new JLabel("Name:");
        // выравнивание текста с правой стороны
        ldlItemName.setHorizontalAlignment(SwingConstants.RIGHT);
        //Выставляем координаты метки
        ldlItemName.setBounds(new Rectangle(PAD, 0 * H_B + PAD, W_L, H_B));
        //Кладем метку на форму
        add(ldlItemName);
        //Выставляем координаты поля
        txtName.setBounds(new Rectangle(W_L + 2 * PAD, 0 * H_B + PAD, W_T, H_B));
        //Делаем "бордюр" для поля
        txtName.setBorder(BorderFactory.createEtchedBorder());
        //кладем поле форму
        add(txtName);

        //набор метки и поля для Вида предметов
        JLabel ldlSort = new JLabel("Sort:");
        ldlSort.setHorizontalAlignment(SwingConstants.RIGHT);
        ldlSort.setBounds(new Rectangle(PAD, 1 * H_B + PAD, W_L, H_B));
        add(ldlSort);
        txtSort.setBounds(new Rectangle(W_L + 2 * PAD, 1 * H_B + PAD, W_T, H_B));
        txtSort.setBorder(BorderFactory.createEtchedBorder());
        add(txtSort);

        //набор метки и поля для количество
        JLabel ldlSum = new JLabel("Sum:");
        ldlSum.setHorizontalAlignment(SwingConstants.RIGHT);
        ldlSum.setBounds(new Rectangle(PAD, 2 * H_B + PAD, W_L, H_B));
        add(ldlSum);
        txtSum.setBounds(new Rectangle(W_L + 2 * PAD, 2 * H_B + PAD, W_T, H_B));
        txtSum.setBorder(BorderFactory.createEtchedBorder());
        add(txtSum);

        //набор метки и поля для Описания
        JLabel ldlDescription = new JLabel("Description:");
        ldlDescription.setHorizontalAlignment(SwingConstants.RIGHT);
        ldlDescription.setBounds(new Rectangle(PAD, 3 * H_B + PAD, W_L, H_B));
        add(ldlDescription);
        txtDescription.setBounds(new Rectangle(W_L + 2 * PAD, 3 * H_B + PAD, W_T, H_B));
        txtDescription.setBorder(BorderFactory.createEtchedBorder());
        add(txtDescription);
    }

    //если нам передали предмет - заполняем поля предмета
    private void initField(Item item){
        if(item != null){
            itemID = item.getItemID();
            txtName.setText(item.getNameItem());
            txtSort.setText(item.getSortItem());
            txtSum.setText(item.getSumItem());
            txtDescription.setText(item.getDescription());
        }

    }
    //размещаем кнопки на форме
    private void buildButtons(){
        JButton btnSave = new JButton("SAVE");
        btnSave.setActionCommand(SAVE);
        btnSave.addActionListener(this);
        btnSave.setBounds(new Rectangle(PAD, 5 * H_B + PAD, W_B, H_B));
        add(btnSave);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setActionCommand(CANCEL);
        btnCancel.addActionListener(this);
        btnCancel.setBounds(new Rectangle(W_B + 2 * PAD, 5 * H_B + PAD, W_B, H_B));
        add(btnCancel);

    }
    @Override
    //обработка нажатий кнопок
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        //если нажата SAVE сохраняем изменения
        save = SAVE.equals(action);
        //закрываем форму
        setVisible(false);
    }

    //надо ли сохранять изменения
    public boolean isSave(){
        return save;
    }

    //создаем контакт из заполненных полей, который можно будет записать
    public Item getItem(){
        Item item = new Item(itemID, txtName.getText(), txtSort.getText(),
                txtSum.getText(), txtDescription.getText());
        return item;
    }
}
