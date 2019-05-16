package listItem.model;

import listItem.controller.Item;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ItemModel extends AbstractTableModel {
    //список заголовков для колонок таблицы
    private static final String[] header = {"ID", "Name", "Sort", "Sum", "Описание"};

    //здесь хранится список контактов, который отображается в таблице
    private final List<Item> items;

    public ItemModel(List<Item> items) {
        this.items = items;
    }

    @Override
    //получение количество строк - размер коллекции
    public int getRowCount() {
        return items.size();
    }

    @Override
    // получаем количество столбцов
    public int getColumnCount() {
        return header.length;
    }
    //получение заголовок колонки
    public String getColumnName(int col){
        return header[col];
    }

    @Override
    //получаем обьект для отабражения в канкретной ячейке таблицы
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item item = items.get(rowIndex);
        //В зависимости от номера колонки возвращаем то или иное поле контакта
        switch (columnIndex){
            case 0:
                return item.getItemID().toString();
            case 1:
                return item.getNameItem();
            case 2:
                return item.getSortItem();
            case 3:
                return item.getSumItem();
            default:
                return item.getDescription();

        }

    }
}
