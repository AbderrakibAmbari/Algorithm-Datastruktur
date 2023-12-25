package p2.alternativ;

public class Knoten {
	private int daten;
	private Knoten naechster;
	
	


	public Knoten(int daten, Knoten naechster) {
		
		this.daten = daten;
		this.naechster = naechster;
	}

	public int getDaten() {
		return daten;
	}
	public Knoten getNaechster() {
		return naechster;
	}
	public void setNaechster(Knoten naechster) {
		this.naechster = naechster;
	}
	
	
}
