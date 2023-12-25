package p2.alternativ;

public class Stack {
	private Knoten letzte;

	public Stack() {
		this.letzte = null;
	}

	public void push(int element) {
		Knoten neu = new Knoten(element, letzte);
		letzte = neu;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			int entferntesElement = letzte.getDaten();
			letzte = letzte.getNaechster();
			return entferntesElement;
		}
	}
	public int top() {
		if(isEmpty()) {
			return -1;
		}
		return letzte.getDaten();
	}

	public boolean isEmpty() {
		return letzte == null;
	}

}
