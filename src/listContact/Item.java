package listContact;

public class Item {
    //ID предмета
    private Long itemID;
    //название предмета
    private String nameItem;
    //что за предмет
    private String sortItem;
    //количество предметов
    private String sumItem;
    //email
    private String description;

    public Item(String nameItem, String sortItem, String sumItem, String description) {
        this.nameItem = nameItem;
        this.sortItem = sortItem;
        this.sumItem = sumItem;
        this.description = description;
    }

    public Item(Long itemID, String nameItem, String sortItem, String sumItem, String description) {
        this.itemID = itemID;
        this.nameItem = nameItem;
        this.sortItem = sortItem;
        this.sumItem = sumItem;
        this.description = description;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getSortItem() {
        return sortItem;
    }

    public void setSortItem(String sortItem) {
        this.sortItem = sortItem;
    }

    public String getSumItem() {

        return sumItem;
    }

    public void setSumItem(String sumItem) {
        this.sumItem = sumItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", nameItem = " + nameItem +
                ", sortItem = " + sortItem + ", sumItem = " + sumItem + ", description = " + description ;
    }
}
