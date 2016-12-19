public class HashMap {

	// We generally want to use hash tables when we want to fetch, add or remove elements in constant time 
	// Hash Tables in Java are safe and hashmaps are not 
	// Every hash function has two parts basically - Hashcode and a compressor 
	// Every object in java has a hashcode generated by the JVM , and then we use a compressor to compress the hashcode
	// Example modulo is the compressor 
	

	// creating a simple hashtable we have to do the following 
	// 1. create an array of hash entry objects 
	// 2. initiate the all the elements of the array as null 
	// 3. write the get and put functions where we have hash function implemented 
	
	private static final int TABLE_SIZE = 128;

	HashEntry[] table;

	public HashMap () {

		table = new HashEntry(TABLE_SIZE);
		for (i=0,i<TABLE_SIZE,i++) {

			table[i]== null;
		}
	}

	public int get (int key) {

		int hash = (key % TABLE_SIZE);
		while (table[hash] != null && table[hash].getKey() != key) {

			hash = (hash + 1) % TABLE_SIZE;
		}

		if (hash == null){

			return -1;
		}

		else {

			return table[hash].getValue();
		}

	}

	public int put (int key, int value) {

		int hash = (key % TABLE_SIZE);
		while (table[hash] != null && table[hash].getKey() != key) {

			hash = (hash + 1) % TABLE_SIZE;
		}
		table[hash] = new HashEntry(key, value);

	}
}