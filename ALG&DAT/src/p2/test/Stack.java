package p2.test;

public class Stack {
	private Knoten oberste;
	
	public Stack() {
		this.oberste=null;
	}
	public void push(int element) {
		Knoten neu =new Knoten(element,oberste);
		oberste = neu;
			
		}
		
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int entferntesElement=oberste.getDaten();
			oberste=oberste.getNachster();
			return entferntesElement;
		}
	}
	public int top() {
		if(isEmpty()) {
			return -1;
		}
		return oberste.getDaten();
	}
	public boolean isEmpty(){
		return oberste ==null;
		
	}
}
