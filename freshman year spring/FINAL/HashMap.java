package adt;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * This is currently just an alias for a built-in implementation of a hash-based
 * map and is therefore noncompliant with the Hash modules specification.
 * 
 * You must replace this file with your own hash-based map implementation when
 * attempting the Hash modules. However, you can continue to use this
 * noncompliant class for all non-Hash modules.
 */
public class HashMap<K, V> implements Map<K, V> {

	private int size;
	private int n;
	private double loadFactor = 3;
	private LocalEntry<K, V>[] map;

	public HashMap(K key, V value) {

	}

	public HashMap() {
		size = 0;
		n = 80000;
		map = new LocalEntry[n];
	}

	public HashMap(Map<? extends K, ? extends V> copy) {

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public boolean containsKey(Object key) {
		LocalEntry<K, V> entry = map[hash((K) key) % n];
		if (entry != null)
			return entry.get((K) key) != null;
		else
			return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public V get(Object key) {
		LocalEntry<K, V> entry = map[hash((K) key) % n];
		if (entry != null)
			return entry.get((K) key);
		else {
			return null;
		}
	}

	@Override
	public V put(K key, V value) {
		LocalEntry<K, V> entry = map[hash(key) % n];
		if (entry == null) {
			LocalEntry<K, V> newEntry = new LocalEntry<K, V>();
			newEntry.put(key, value);
			map[hash(key) % n] = newEntry;
			size++;
			//System.out.println(map[hash(key) % n]);
			return null;
		}

		if (((double) size / n) >= loadFactor) {
			resize();
		}
		V value1 = entry.put(key, value);
		if (value1 == null) {
			size++;
		}
		return value1;
	}

	@Override
	public V remove(Object key) {
		LocalEntry<K, V> entry = map[hash((K) key) % n];
		V value = null;
		if (entry != null) {
			value = entry.remove((K) key);
		}

		if (value != null) {
			size--;
		}
		return value;
	}

	public void resize() {
		LocalEntry<K, V>[] tempData = new LocalEntry[(n*2)];
		LocalEntry<K, V> entry = null;
	//	System.out.println("resize");
		int initialSize = size;
		for (int i = 0; i < n; i++) {
			if (map[i] != null) {
				entry = map[i];
				for (int j = 0; j < entry.localSize; j++) {
					//System.out.println(entry + "this is entry");
					int h = (hash(entry.getKey(j)) % (n*2));
					//System.out.println(entry.getKey(j) + "h");
					//System.out.println(tempData[h]);
					if (tempData[h] == null) {
						//System.out.println(tempData[h]);
						LocalEntry<K, V> entry1 = new LocalEntry<K, V>();
						entry1.put(entry.getKey(j), entry.getValue(j));
						//System.out.println(entry.getKey(j) + " " + entry.getValue(j) + " temp is null");
						tempData[h] = entry1;
					} else {
						//System.out.println(tempData[h]);
						tempData[h].put(entry.getKey(j), entry.getValue(j));
						//System.out.println(entry.getKey(j) + " " + entry.getValue(j) + " temp isnt null");
					}
				}
			}
			
			
		}
		n = n * 2;
		map = tempData;
		size = initialSize;
	}

	public int hash(Object key) {
		if (key instanceof String) {
			return hash((String) key);
		} else
			return key.hashCode();
	}

	public int hash(String key) {
		int hash = 1299721;
		for (int i = 0; i < key.length(); i++) {
		    hash = (hash*31) + (key.charAt(i) * (i+1));
		}
		return Math.abs(hash);
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < n; i++) {
			if (map[i] != null) {
				s += map[i].toString() + "\n";
			}
		}
		return s;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			map[i] = new LocalEntry<>();
		}

	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	class LocalEntry<K, V> {

		class Entry<K, V> {
			private K key;
			private V value;
			public Entry<K, V> next;

			public Entry(K newKey, V newValue) {
				key = newKey;
				value = newValue;
				next = null;

			}

			public Entry() {
				key = null;
				value = null;
				next = null;
			}

			public K getKey() {
				return key;
			}

			public V getValue() {
				return value;
			}

			public void setKey(K newKey) {
				key = newKey;
			}

			public void setValue(V newValue) {
				value = newValue;
			}

			public String toString() {
				String s = key + " " + value;
				return s;
			}
		}

		private Entry<K, V> head;
		private Entry<K, V> tail;
		int localSize = 0;

		public K getKey(int index) {
			Entry<K, V> current = head;
			int i = 0;
			while (current.next != null && i != index) {
				current = current.next;
				i++;
			}
			return (K) current.key;
		}

		public V getValue(int index) {
			Entry<K, V> current = head;
			int i = 0;
			while (current.next != null && i != index) {
				current = current.next;
				i++;
			}
			return (V) current.value;
		}

		public LocalEntry() {
			head = null;
			tail = null;
			localSize = 0;
		}

		public V put(K key, V value) {
			Entry<K, V> local = new Entry<K, V>(key, value);
			Entry<K, V> temp = head;

			V v = null;
			if (head == null) {
				head = local;
				tail = local;
				tail.next = null;
				head.next = null;
				localSize++;
				return null;
			} else {
				if (head.key.equals(key)) {
					v = head.value;
					head.value = value;
					return v;
				}
				while (temp.next != null) {
					if (temp.next.key.equals(key)) {
						v = temp.next.value;
						temp.next.value = value;
						return v;
					}
					temp = temp.next;
				}
				if (temp.key.equals(key)) {
					v = temp.value;
					temp.value = value;
					return v;
				}

				if (localSize == 1) {
					head.next = local;
					tail = local;
					localSize++;
					return null;
				}
				temp.next = local;
				tail = local;
				localSize++;
				return null;
			}
		}

		public V remove(Object key2) {
			Entry<K, V> temp = head;
			Entry<K, V> prev = null;
			V v = null;
			if (head == null) {
				return null;
			}
			if (head.key.equals((K) key2)) {
				v = head.value;
				head = head.next;
				localSize--;
				return v;
			}
			while (temp.next != null && !temp.next.key.equals((K) key2)) {
				prev = temp;
				temp = temp.next;
			}

			if (temp.next == null) {
				return null;
			}
			if (prev != null && temp.next != null && temp.next.key.equals((K) key2)) {
				localSize--;
				v = temp.next.value;
				temp.next = temp.next.next;
			} else if (prev == null && temp.next.key.equals((K) key2)) {
				localSize--;
				v = temp.next.value;
				temp.next = temp.next.next;
			}
			return v;
		}

		public String toString() {
			String s = "";
			Entry<K, V> temp = head;
			if (temp == null)
				s += " null ";
			while (temp != null) {
				s += temp.toString() + ", ";
				temp = temp.next;
			}

			return s;
		}

		public Entry<K, V> current(int index) {
			Entry<K, V> temp = head;

			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		}

		public V get(Object key) {
			Entry<K, V> entry = head;
			while (entry != null) {
				if (entry.getKey().equals((K) key)) {
					return entry.getValue();
				} else
					entry = entry.next;
			}
			return null;
		}
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 50; i++) {
			map.put(i + "", i + 1);
		}
		//System.out.println(map.size);
		//System.out.println(map);

		//System.out.println(" map" + map);
		//System.out.println(map.get(450+""));
	}

}
