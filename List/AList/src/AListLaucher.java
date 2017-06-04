/**
 * Created by lanqingy on 6/4/17.
 */
public class AListLaucher {

    public static void main(String[] args) {
        AList lst = new AList();
        lst.addLast(1);
        lst.addLast(10);
        lst.addLast(20);
        System.out.println(lst.getLast());
        System.out.println(lst.get(1));
        System.out.println(lst.removeLast());
        System.out.println(lst.getLast());
        lst.addLast(30);
        System.out.println(lst.size());
        lst.addLast(40);
        System.out.println(lst.size());
        System.out.println(lst.getLast());
    }
}
