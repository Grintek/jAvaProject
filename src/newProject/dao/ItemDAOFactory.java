package newProject.dao;

/**
 * фабрика для создание экземпряров ItemDAO
 */
public class ItemDAOFactory {
    public static ItemDAO getItemDAO(){
        return new ItemSimpleDAO();
    }
}
