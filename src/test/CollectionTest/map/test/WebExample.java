package test.CollectionTest.map.test;

import java.util.HashMap;
import java.util.Map;

public class WebExample {
    public static void main(String[] args) {
        //создаем колекцию для хранения пользователей
        Map<String, WebSiteUser> map = new HashMap<>();
        //создаем наших пользователей
        WebSiteUser webSU1 = new WebSiteUser("asd@hew.com", "Iny", "Sutzu", "873712623");
        WebSiteUser webSU2 = new WebSiteUser("righe@aswe.com", "Kity", "Tron", "890133947");
        WebSiteUser webSU3 = new WebSiteUser("leon@nom.com", "Pushan", "Hyn", "710237476");

        //заполняем колекцию(ключ для обьектов будет email)
        map.put(webSU1.getEmail(), webSU1);
        map.put(webSU2.getEmail(), webSU2);
        map.put(webSU3.getEmail(), webSU3);

        //еще раз вставляем обьект, но с другим ключом
        map.put("emas@com.com", webSU3);

        //получить обьект по ключу
        System.out.println("получить пользователя по ключу");

        WebSiteUser user = map.get("leon@nom.com");
        System.out.println("User: " + user.getFirstName() + ":" + user.getLastName());

        //пройти по коллекции из ключей - доступ к коллекции ключей через keySet()
        System.out.println();
        System.out.println("Список пользователей по ключу");

        for(String s : map.keySet()){
            WebSiteUser u = map.get(s);
            System.out.println("User: " + s + ", " + u.getFirstName() + ":" + u.getLastName());
        }

        //пройтись по коллекции через value()
        System.out.println();
        System.out.println("список пользователей по значению");

        for (WebSiteUser s : map.values()){
            System.out.println("User: " + s.getFirstName() + ", " + s.getLastName());
        }

        //пройтись по коллекции через entrySet()
        System.out.println();
        System.out.println("список пользователь в виде пар:");

        for(Map.Entry<String, WebSiteUser> ua : map.entrySet()){
            System.out.println("User: " + ua.getKey() + ", " + ua.getValue().getFirstName() + ":" + ua.getValue().getLastName());
        }
    }
}
