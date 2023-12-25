package p2.withgeneratic;

public class Knoten <T>{
	private T daten ;
	private Knoten<T> naechster;
	
	public Knoten(T daten,Knoten<T> naechster) {
		this.daten=daten;
		this.setNaechster(naechster);
	}

	public T getDaten() {
		return daten;
	}

	public Knoten<T> getNaechster() {
		return naechster;
	}

	public void setNaechster(Knoten<T> naechster) {
		this.naechster = naechster;
	}
	
}
