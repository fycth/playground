package sergiienko.andrii.exercize.structure;

import java.lang.reflect.Array;

//todo add remove method

//todo add toString method

//todo add getKeys method

//todo add getValues method

//todo add getEntries method

@SuppressWarnings("unchecked")
public class HashMap<K extends Comparable<K>, V> {
  private final int DEFAULT_CAPACITY = 10;
  private int size = 0;
  private MapEntry[] array = (MapEntry[])Array.newInstance(MapEntry.class, DEFAULT_CAPACITY);

  // todo implement re-hash when array is growing or shrinking
  public void put(K key, V value) {
    if (size >= array.length - array.length / 2) {
      MapEntry[] arrayOld = array;
      array = (MapEntry[])Array.newInstance(MapEntry.class, (int)(array.length * 1.5));
      size = 0;
      for (MapEntry m : arrayOld) {
        while (null != m) {
          put(m.key, m.value);
          m = m.next;
        }
      }
    }
    int hash = calculateHash(key);
    MapEntry newMapEntry = new MapEntry(key, value, null);
    MapEntry mapEntry = array[hash];
    if (mapEntry == null) {
      mapEntry = newMapEntry;
      array[hash] = mapEntry;
      size++;
    } else {
      while (true) {
        if (mapEntry.key.compareTo(key) == 0) {
          mapEntry.value = value;
          break;
        }
        if (mapEntry.next == null) {
          mapEntry.next = newMapEntry;
          break;
        }
        if (mapEntry.next.key.compareTo(key) > 0) {
          newMapEntry.next = mapEntry.next;
          mapEntry.next = newMapEntry;
          break;
        }
        mapEntry = mapEntry.next;
      }
    }
  }

  private int calculateHash(K key) {
    return Math.abs(key.hashCode()) % array.length;
  }

  public V get(K key) {
    int hash = calculateHash(key);
    MapEntry mapEntry = array[hash];
    while (mapEntry != null) {
      if (mapEntry.key.compareTo(key) == 0) break;
      mapEntry = mapEntry.next;
    }
    return mapEntry == null ? null : mapEntry.value;
  }

  private class MapEntry {
    private final K key;
    private V value;
    private MapEntry next;
    MapEntry(K key, V value, MapEntry next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }
}