package newProject;

import newProject.dao.ItemDAO;
import newProject.dao.ItemDAOFactory;

import java.util.List;

/**
 * класс для реализации функций над списком предметов в инветаре
 */
public class IteamManager {
    private ItemDAO dao;

    IteamManager(){
        dao = ItemDAOFactory.getItemDAO();
    }
    //добавляем предмета - возвращает id добавленного предмета
    public long addIteam(Item item){
        return dao.addItem(item);
    }
    //редактирование предмета
    public void updateItem(Item item){
        dao.updateItem(item);
    }
    //удаление предмета по id
    public void deleteIteam(Long itemId){
        dao.deleteItem(itemId);
    }
    //получение предмета по id
    public Item getItem(Long itemId){
        return dao.getItem(itemId);
    }
    //получить список предметов
    public List<Item> findItam(){
        return dao.findItem();
    }
}
