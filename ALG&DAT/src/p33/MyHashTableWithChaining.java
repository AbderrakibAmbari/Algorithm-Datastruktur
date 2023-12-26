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

	public V get(K key) {
		int bucketIndex =getHashIndex(key);
		HashNode<K,V>head = bucketArray.get(bucketIndex);
		while(head !=null) {
			if(head.key.equals(key)) {
				return head.value;	
			}
			head=head.next;
		}
		return null;
	}
	
	public void add(K key,V value) {
		int bucketIndex =getHashIndex(key);
		HashNode<K,V>head = bucketArray.get(bucketIndex);
		while(head !=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head=bucketArray.get(bucketIndex);
		HashNode<K,V> newNode=new HashNode<K,V>(key,value);
		newNode.next=head;
		bucketArray.set(bucketIndex, newNode);
	}
	
	public V remove(K key ) {
		int bucketIndex=getHashIndex(key);
		HashNode<K,V>head =bucketArray.get(bucketIndex);
		HashNode<K,V> prev =null;
		while(head!=null) {
			if(head.key.equals(key)) {
				size--;
				if(prev!=null)
					prev.next=head.next;
				else
					bucketArray.set(bucketIndex, head.next);
				return head.value;
			}
			prev=head;
			head=head.next;
		}
		return null;
	}
	
	public void add(K key , V value) {
		size++;
		head=bucketArray.get(numBuckets);
		HashNode <K,V>newNode =new HashNode<K,V>(key,value);
		newNode.next=head;
		bucketArray.set(bucketIndex,newNode);
		
		if(1.0*size/numBuckets >=0.7) {
			ArrayList<HashNode<K,V>>temp=bucketArray;
			bucketArray =new ArrayList<>();
			numBuckets=2*numBuckets;
			size=0;
			for(int i=0;i<numBuckets;i++) {
				bucketArray.add(null);
			}
			for(HashNode<K,V>headNode:temp) {
				while(headNode!=null) {
					add(headNode.key,headNode.value);
					headNode=headNode.next;
				}
			}
		}
	}
}
