import java.io.IOException;

/**
 * Created by lanqingy on 6/13/17.
 */

public class ArrayMapLauncher {
    public static void main(String[] args)  {
        ArrayMap<String, Integer> shoppingList = new ArrayMap<>();
        shoppingList.put("apple", 5);
        shoppingList.put("peach", 4);
        shoppingList.put("almond milk", 1);
        System.out.println(shoppingList.get("apple"));
        System.out.println(shoppingList.containsKey("banana"));
        System.out.println(shoppingList.containsKey("peach"));


        // old-fashioned Iterator way:
//        ArrayMap.KeyIterator am = shoppingList.new KeyIterator();
//
//        while (am.hasNext()) {
//            System.out.println(am.next());
//        }

        // more concise way
        for (String item: shoppingList) {
            System.out.println(item);
        }
    }
}
