package p33;

import java.util.ArrayList;

public class MyHashTableWithChaining<K,V> {
	
	private ArrayList<HashNode<K,V>> bucketArray;
	private int numBuckets;
	private int size;
	
	public MyHashTableWithChaining(int capacity) {
		bucketArray=new ArrayList<>();
		numBuckets =capacity;
		size=0;
		
		for(int i=0;i<numBuckets;i++) {
			bucketArray.add(null);
		}
	}
	public int size() {return size;}
	public boolean isEmpty() {return size()==0;}

}
