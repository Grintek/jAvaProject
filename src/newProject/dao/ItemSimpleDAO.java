package newProject.dao;

import newProject.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemSimpleDAO implements ItemDAO {
    private List<Item> items = new ArrayList<Item>();

    @Override
    public Long addItem(Item item) {
        Long id = generateItemId();
        item.setItemId(id);
        items.add(item);
        return id;
    }

    @Override
    public void updateItem(Item item) {
        Item oldItem = getItem(item.getItemId());
        if(oldItem != null){
            oldItem.setItemName(item.getItemName());
            oldItem.setItemType(item.getItemType());
            oldItem.setItemNumber(item.getItemNumber());
            oldItem.setItemDescription(item.getItemDescription());
        }
    }

    @Override
    public void deleteItem(Long itemId) {
        for (Iterator<Item> it = items.iterator(); it.hasNext();){
            Item itn = it.next();
            if(itemId.equals(itn.getItemId())){
                it.remove();
            }
        }

    }

    @Override
    public Item getItem(Long itemId) {
        for(Item item : items){
            if(itemId.equals(item.getItemId())){
                return item;
            }
        }
        return null;

    }

    @Override
    public List<Item> findItem() {
        return items;
    }

    private Long generateItemId(){
        Long itemId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getItem(itemId) != null){
            itemId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return itemId;
    }
}
