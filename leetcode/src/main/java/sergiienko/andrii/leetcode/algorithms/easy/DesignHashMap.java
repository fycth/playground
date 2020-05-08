package sergiienko.andrii.leetcode.algorithms.easy;

import java.lang.reflect.Array;

public class DesignHashMap {
  private final int DEFAULT_CAPACITY = 10;
  private int size = 0;
  private MapEntry[] array = (MapEntry[]) Array.newInstance(MapEntry.class, DEFAULT_CAPACITY);

  public DesignHashMap() {
  }

  public void put(int key, int value) {
    if (size >= array.length * 0.8) {
      MapEntry[] arrayOld = array;
      array = (MapEntry[]) Array.newInstance(MapEntry.class, (int) (array.length * 1.5));
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
        if (mapEntry.key == key) {
          mapEntry.value = value;
          break;
        }
        if (mapEntry.next == null) {
          mapEntry.next = newMapEntry;
          break;
        }
        if (mapEntry.next.key > key) {
          newMapEntry.next = mapEntry.next;
          mapEntry.next = newMapEntry;
          break;
        }
        mapEntry = mapEntry.next;
      }
    }
  }

  public int get(int key) {
    int hash = calculateHash(key);
    MapEntry mapEntry = array[hash];
    while (mapEntry != null) {
      if (mapEntry.key == key) break;
      mapEntry = mapEntry.next;
    }
    return mapEntry == null ? -1 : mapEntry.value;
  }

  public void remove(int key) {
    int hash = calculateHash(key);
    MapEntry mapEntry = array[hash];
    if (mapEntry == null) return;
    if (mapEntry.key == key) {
      mapEntry = mapEntry.next;
      array[hash] = mapEntry;
      return;
    }
    while (mapEntry.next != null) {
      if (mapEntry.next.key == key) {
        mapEntry.next = mapEntry.next.next;
        return;
      }
      mapEntry = mapEntry.next;
    }
  }

  private int calculateHash(Integer key) {
    return Math.abs(key.hashCode()) % array.length;
  }

  public class MapEntry {
    private final int key;
    private int value;
    private MapEntry next;

    MapEntry(int key, int value, MapEntry next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }
}
