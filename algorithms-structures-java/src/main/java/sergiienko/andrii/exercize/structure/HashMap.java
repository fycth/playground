package sergiienko.andrii.exercize.structure;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")
public class HashMap<K extends Comparable<K>, V> {
  private int size = 0;
  private MapEntry[] array = (MapEntry[])Array.newInstance(MapEntry.class, 10);

  // todo implement re-hash when array is growing or shrinking
  public void put(K key, V value) {
    int hash = calculateHash(key);
    MapEntry newMapEntry = new MapEntry(key, value, null);
    MapEntry mapEntry = array[hash];
    if (mapEntry == null) {
      mapEntry = newMapEntry;
      array[hash] = mapEntry;
      size++;
    } else {
      while (mapEntry.next != null) {
        if (mapEntry.next.key.compareTo(key) > 0) {
          newMapEntry.next = mapEntry.next;
          mapEntry.next = newMapEntry;
          break;
        } else {
          mapEntry = mapEntry.next;
        }
      }
      if (mapEntry.next == null) {
        mapEntry.next = newMapEntry;
      }
    }
  }

  private int calculateHash(K key) {
    return key.hashCode() % array.length;
  }

  public V get(K key) {
    int hash = calculateHash(key);
    MapEntry mapEntry = array[hash];
    while (mapEntry != null) {
      if (mapEntry.key == key) break;
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
