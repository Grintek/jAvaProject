package newProject.dao;

import newProject.Item;

import java.util.ArrayList;
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
            oldItem.getItemName(item.getItemName());
            oldItem.getItemType(item.getItemType());
            oldItem.getItemNumber(item.getItemNumber());
            oldItem.getItemDescription(item.getItemDescription());
        }
    }

    @Override
    public void deleteItem(Long itemId) {

    }

    @Override
    public Item getItem(Long itemId) {
        return null;
    }

    @Override
    public List<Item> findItem() {
        return null;
    }

    private Long generateItemId(){
        Long itemId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getItem(itemId) != null){
            itemId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return itemId;
    }
}
