package listContact;

import java.util.List;

/**
 * Класс для реализации функций над списком контактов
 */
public class ItemManager {
    private ItemDAO dao;

    public ItemManager(){
        dao = ItemDAOFactory.getItemDAO();
    }
    //Добавление предмета - возврвщвет ID добавленного предмета
    public Long addItem(Item item){
        return dao.addItem(item);
    }
    //Редактирование предметов
    public void updateItem(Item item){
        dao.updateItem(item);
    }
    //удаление предмета по ID
    public void deleteItem(Long itemID){
        dao.deleteItem(itemID);
    }
    //получение одного контакта
    public Item getItem(Long itemID){
        return dao.getItem(itemID);
    }
    //получение списков предметов
    public List<Item> findItem(){
        return dao.findItem();
    }

}
