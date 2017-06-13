/**
 * Created by lanqingy on 6/13/17.
 */
public class ArrayMap<K, V> {
    private K[] keys;
    private V[] values;
    private int size;

    public ArrayMap() {
        keys = (K[]) new Object[10];
        values = (V[]) new Object[10];
    }

    public void put(K key, V value) {
        keys[size] = key;
        values[size] = value;
        size += 1;
    }

    public V get(K key) {
        int idx = 0;
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) {
                idx = i;
            }
        }
        return values[idx];
    }

    public boolean containsKey(K key) {
        for (K k: keys) {
            if (k == key) {
                return true;
            }
        }
        return false;
    }

    public K[] getKeys() {
        return keys;
    }

    public V[] getValues() {
        return values;
    }
}

