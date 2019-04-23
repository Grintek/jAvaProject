package newProject;

public class Item {
    //id предмета
    private Long itemId;
    // название
    private String itemName;
    //тип (ресурс, броня или оруж, хлам)
    private String itemType;
    //кол-во
    private String itemNumber;
    //описание
    private String itemDescription;

    public Item(){}

    public Item(String itemName, String itemType, String itemNumber, String itemDescription) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
    }

    public Item(long itemId, String itemName, String itemType, String itemNumber, String itemDescription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID = " + itemId + ", itemName = " + itemName + ", itemType = "
                + itemType + ", itemNumber" + itemNumber + ", itemDescription = " + itemDescription + " }" ;
    }
}
