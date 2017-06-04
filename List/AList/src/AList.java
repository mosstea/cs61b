/** Array based list.
 * @author lanqingy
 * @version 06/04/17
 */
public class AList<Type> {
    private Type[] items;
    private int size;

    public AList() {
        items = (Type[]) new Object[3];
        size = 0;
    }

    private void resize(int capacity) {
        Type[] temp = (Type[]) new Object[capacity];
        System.arraycopy(items, 0, temp, 0, size);
        items = temp;
    }

    public void addLast(Type x) {
        if (size == items.length) {
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    public Type getLast() {
        return items[size - 1];
    }

    public Type get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public Type removeLast() {
        Type last = getLast();
        items[size - 1] = null; // avoid loitering when using generics
        size -= 1;
        return last;
    }
}