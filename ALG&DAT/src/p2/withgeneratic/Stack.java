package p2.withgeneratic;

public class Stack<T> {
	private Knoten<T> oberstes;
	
	public Stack() {
		this.oberstes=null;
		
	}
	
	public void push (T element) {
		Knoten<T> neu = new Knoten<>(element,oberstes);
		oberstes=neu;
	}
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		T entferntesElement = oberstes.getDaten();
		oberstes=oberstes.getNaechster();
		return entferntesElement;
	}
	
	public T top() {
		return isEmpty()? null : oberstes.getDaten();
	}
	public boolean isEmpty() {
		return oberstes == null;
	}
}