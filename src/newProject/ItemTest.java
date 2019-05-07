package newProject;

import java.util.List;

public class ItemTest {
    public static void main(String[] args){
        ItemManager im = new ItemManager();

        Item i1 = new Item("порох", "ресурс",
                43, "ингредеент для приготовление патрон");

        Item i2 = new Item("Ебнутая булава", "оружие",
                1, "деревянная булава с металическим кольцом");

        Item i3 = new Item("кашка", "еда",
                3, "старая добрая каша которую не очень любят дети");

        System.out.println("ADD ITEM ===============");
        Long iId1 = im.addItem(i1);
        Long iId2 = im.addItem(i2);
        Long iId3 = im.addItem(i3);
        Long iId4 = im.addItem(i1);
        List<Item> result1 = im.findItem();
        for(Item i : result1){
            System.out.println(i);
        }

        System.out.println("UPDATE ITEM ==============");
        Item itemUp = new Item(iId2, "Amo 45", "боеприпасы",
                60, "пули под 45 калибр");
        im.updateItem(itemUp);
        List<Item> result2 = im.findItem();
        for(Item i : result2){
            System.out.println(i);
        }

        System.out.println("DELETE ITEM =============");
        im.deleteItea(iId1);
        List<Item> result3 = im.findItem();
        for(Item i : result3){
            System.out.println(i);
        }

        System.out.println("GET ITEM =============");
        Item item = im.getItem(iId3);
        System.out.println(item);


    }
}
