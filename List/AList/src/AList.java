/** Array based list.
 * @author lanqingy
 * @version 06/04/17
 */
public class AList {
    int[] items;
    int size;

    public AList() {
        items = new int[100];
        size = 0;
    }

    public void addLast(int x) {
        items[size] = x;
        size += 1;
    }

    public int getLast() {
        return items[size - 1];
    }

    public int get(int i ) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public int removeLast() {
        int last = getLast();
        size -= 1;
        return last;
    }

}
