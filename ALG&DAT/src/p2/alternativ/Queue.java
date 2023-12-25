package p2.alternativ;

public class Queue {
	private Knoten vorderste;
	private Knoten letzte;

	public Queue() {
		this.vorderste = null;
		this.letzte = null;
	}

	public void enqueue(int element) {
		Knoten neu = new Knoten(element, null);
		if (isEmpty()) {
			vorderste = neu;
			letzte = neu;
		} else {
			letzte.setNaechster(neu);
			letzte = neu;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		int entfernstesElement = vorderste.getDaten();
		vorderste = vorderste.getNaechster();
		return entfernstesElement;
		
	}

	public boolean isEmpty() {
		return vorderste == null;
	}
	
	public int front() {
		if(isEmpty()) {
			return -1;
		}
		return vorderste.getDaten();
	}
}
