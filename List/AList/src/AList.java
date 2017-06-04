/** Array based list.
 * @author lanqingy
 * @version 06/04/17
 */
public class AList {
    private int[] items;
    private int size;

    public AList() {
        items = new int[3];
        size = 0;
    }

    public void addLast(int x) {
        if (size == items.length) {
            int[] temp = new int[size + 1];
            System.arraycopy(items, 0, temp, 0, size);
            items = temp;
        }
        items[size] = x;
        size += 1;
    }

    public int getLast() {
        return items[size - 1];
    }

    public int get(int i) {
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