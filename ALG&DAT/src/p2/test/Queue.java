package p2.test;

public class Queue {
	private Knoten vorderste;
	private Knoten letzte;

	public Queue() {
		this.letzte = null;
		this.vorderste = null;
	}

	public boolean isEmpty() {
		return vorderste == null;
	}

	public int front() {
		if (isEmpty()) {
			return -1;
		}
		return vorderste.getDaten();
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		else {
			int entferntesElement=vorderste.getDaten();
			vorderste=vorderste.getNachster();
			return entferntesElement;
		}
	}

	public void enqueue(int element) {
		Knoten neu=new Knoten(element,null);
		if (isEmpty()) {
			vorderste=neu;
			letzte=neu;
		}
		else {
			letzte.setNachster(neu);
			letzte=neu;
		}
	}
}
