/**
 * Created by lanqingy on 6/13/17.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayMap<K, V> implements Iterable<K> {
    private K[] keys;
    private V[] values;
    private int size;

    public Iterator<K> iterator() {
        return new KeyIterator();
    }

    public class KeyIterator implements Iterator<K> {
        private int position;

        public KeyIterator() {
            position = 0;
        }
        public boolean hasNext() {
            return position < size;
        }

        public K next() {
            K next = keys[position];
            position += 1;
            return next;
        }
    }

    public ArrayMap() {
        keys = (K[]) new Object[10];
        values = (V[]) new Object[10];
    }

    private int getIndex(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void put(K key, V value) {
        int idx = getIndex(key);
        if (idx == -1) {
            keys[size] = key;
            values[size] = value;
            size += 1;
        } else {
            values[idx] = value;
        }

    }

    public V get(K key) {
        int idx = getIndex(key);
        if (idx != -1) {
            return values[idx];
        } else {
            throw new IllegalArgumentException("The key provided " + key + " is not in the map");
        }
    }

    public boolean containsKey(K key) {
        return getIndex(key) != -1;
    }

    public List<K> getKeys() {
        List<K> lst = new ArrayList<>();
        for (K k: keys) {
            lst.add(k);
        }
        return lst;
    }

    public V[] getValues() {
        return values;
    }
}

