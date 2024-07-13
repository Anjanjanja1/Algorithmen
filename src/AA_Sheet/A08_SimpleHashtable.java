package AA_Sheet;

import java.util.*;

class A08_SimpleHashtable {
    private final int TABLE_SIZE = 128;
    private LinkedList<Entry>[] table;

    class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public A08_SimpleHashtable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Insert: O(1) on average
    public void put(int key, int value) {
        int hash = key % TABLE_SIZE;
        LinkedList<Entry> entries = table[hash];
        for (Entry entry : entries) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        entries.add(new Entry(key, value));
    }

    // Search: O(1) on average
    public Integer get(int key) {
        int hash = key % TABLE_SIZE;
        LinkedList<Entry> entries = table[hash];
        for (Entry entry : entries) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    // Delete: O(1) on average
    public void remove(int key) {
        int hash = key % TABLE_SIZE;
        LinkedList<Entry> entries = table[hash];
        entries.removeIf(entry -> entry.key == key);
    }
}

