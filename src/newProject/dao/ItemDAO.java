package newProject.dao;

import newProject.Item;

import java.util.List;

public interface ItemDAO {
    //добавление предмета - возврвщвет ИД предмета
    public Long addItem(Item item);
    //обновление контакта
    public void updateItem(Item item);
    // удаление предмета по его ID
    public void deleteItem(Long itemId);
    // получить предмет
    public Item getItem(Long itemId);
    //получить список предметов
    public List<Item> findItem();
}