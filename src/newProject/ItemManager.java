package newProject;

import newProject.dao.ItemDAO;
import newProject.dao.ItemDAOFactory;

import java.util.List;

/**
 * класс для реализации функций над списком предметов в инветаре
 */
public class ItemManager {
    private ItemDAO dao;

    public ItemManager(){
        dao = ItemDAOFactory.getItemDAO();
    }
    //добавляем предмета - возвращает id добавленного предмета
    public long addItem(Item item){
        return dao.addItem(item);
    }
    //редактирование предмета
    public void updateItem(Item item){
        dao.updateItem(item);
    }
    //удаление предмета по id
    public void deleteItea(Long itemId){
        dao.deleteItem(itemId);
    }
    //получение предмета по id
    public Item getItem(Long itemId){
        return dao.getItem(itemId);
    }
    //получить список предметов
    public List<Item> findItem(){
        return dao.findItem();
    }
}
