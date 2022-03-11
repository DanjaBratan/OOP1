package los;

public class HeyOOP1 {

	public static void main(String[] args) {
		
		Vektor v1 = new Vektor();
		v1.x = 10;
		v1.y = 5;
		v1.z = 6;
		
		Vektor v2 = new Vektor(11);
		v1.y = 51;
		v1.z = 16;
		
		
		Vektor v3 = Vektor.addierung(v1, v2);
		System.out.println(v3.toString());
		
		v3 = v2.subtraktion(v1); //v1-v2= v3
		System.out.println(v3.toString());
		
	}

}
