package listContact;

import java.util.List;

/**
 * Интерфейс для определения функции хранилища данных о контактах
 */
public interface ItemDAO {
    //добавляем предмет - возвращает ID добавленного предмета
    public Long addItem(Item item);
    // редактирование предмета
    public void updateItem(Item item);
    //удаление контакта по ID
    public void deleteItem(Long itemID);
    //получение предмета
    public Item getItem(Long itemID);
    //получение списка предметов
    public List<Item> findItem();
}
