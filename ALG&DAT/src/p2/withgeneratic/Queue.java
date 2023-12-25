package p2.withgeneratic;

public class Queue<T> {
//public class Queue {
	private Knoten<T> vorderste;
	//private Knoten vorderste;
	private Knoten<T> letzte;
	//private Knoten letzte;
	public Queue() {
		this.vorderste = null;
		this.letzte = null;
	}

	public void enqueue(T element) {
	//public void enqueue(int element) {
		Knoten<T> neu = new Knoten<>(element, null);
	//Knoten neu = new Knoten(element, null);
		if (isEmpty()) {
			vorderste = neu;
			letzte = neu;
		} else {
			letzte.setNaechster(neu);
			letzte = neu;
		}
	}

	public T dequeue() {
		if (isEmpty()) {
			return null;
		}
		T entferstesElment=vorderste.getDaten();
		vorderste=vorderste.getNaechster();
		return entferstesElment;
	}
	public T front() {
		return isEmpty() ? null : vorderste.getDaten();
	}

	public boolean isEmpty() {

		return vorderste == null;
	}
}
