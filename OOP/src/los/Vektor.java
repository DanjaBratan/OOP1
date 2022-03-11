package los;

public class Vektor {

	int x;
	int y;
	int z;
	
	public Vektor() { //Konstruktor 0
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	
	public Vektor(int x) { //Konstruktor 1
		this.x = x;
		this.y = 0;
		this.z = 0;
	}
	//-------------------------------------///	
	
	
	public static Vektor addierung(Vektor a, Vektor b){ //kann ohne Objekt arbeiten
	
		Vektor ergebnis = new Vektor();
		
		ergebnis.x = a.x + b.x; 
		ergebnis.y = a.y + b.y;
		ergebnis.z = a.z + b.z;
		
		return ergebnis;
	}

	public Vektor subtraktion(Vektor a){ //muss mit Objekt aufgerufen werden
		
		Vektor ergebnis = new Vektor();
		
		ergebnis.x = a.x - this.x; 
		ergebnis.y = a.y - this.y;
		ergebnis.z = a.z - this.z;
		
		return ergebnis;
	}
	
	public String toString() { //verarbeitung zum String
		
		return "x = " + this.x + "y = " + this.y + "z = " + this.z;
	}
	
}
