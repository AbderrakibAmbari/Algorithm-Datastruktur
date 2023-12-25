package p2.test;

public class Knoten {
	private int daten;
	private Knoten nachster;

	public Knoten(int daten, Knoten nachster) {
		this.daten = daten;
		this.nachster=nachster;
	}
	public int getDaten() {
		return this.daten;
	}
	public Knoten getNachster() {
		return nachster;
	}
	public void setNachster(Knoten nachster) {
		this.nachster = nachster;
	}
	
}
