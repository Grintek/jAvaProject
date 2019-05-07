package listContact;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ItemSimpleDAO implements ItemDAO {

    private final List<Item> items = new ArrayList<>();

    //добавляем в конструкторе предметы
    public ItemSimpleDAO(){
        addItem(new Item("club", "weapon", "1", "деревяная палка, может больно ударить"));
        addItem(new Item("Kunai", "weapon", "1", "метательный нож как у нинзя"));
        addItem(new Item("phosphorus", "material", "54", "нужен для производства"));
    }
    @Override
    public Long addItem(Item item) {
        Long id = generateItemID();
        item.setItemID(id);
        items.add(item);
        return id;
    }

    @Override
    public void updateItem(Item item) {
        Item oldItem = getItem(item.getItemID());
        if(oldItem != null){
            oldItem.setNameItem(item.getNameItem());
            oldItem.setSortItem(item.getSortItem());
            oldItem.setSumItem(item.getSumItem());
            oldItem.setDescription(item.getDescription());
        }
    }

    @Override
    public void deleteItem(Long itemID) {
        for(Iterator<Item> it = items.iterator(); it.hasNext();){
            Item cnt = it.next();
            if(cnt.getItemID().equals(itemID)){
                it.remove();
            }
        }
    }

    @Override
    public Item getItem(Long itemID) {
        for(Item item : items){
            if(item.getItemID().equals(itemID)){
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Item> findItem() {
        return items;
    }

    private Long generateItemID(){
        Long itemID = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getItem(itemID) != null){
            itemID = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return itemID;
    }
}
