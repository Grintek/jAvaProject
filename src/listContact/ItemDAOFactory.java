package listContact;

public class ItemDAOFactory {
    public static ItemDAO getItemDAO(){
        return new ItemSimpleDAO();
    }
}
