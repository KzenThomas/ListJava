package list;

public class Plane {
	String naam;
	String fabrikant;
	Motor[] aantalmotoren;
	bom[] aantalbommen;
	BrandstofTank brandstoftank;
	
	public Plane(String naam, String fabrikant, Motor[] aantalmotoren, bom[] aantalbommen, BrandstofTank brandstoftank){
		this.naam = naam;
		this.fabrikant = fabrikant;
		this.aantalmotoren = aantalmotoren;
		this.aantalbommen = aantalbommen;
		this.brandstoftank = brandstoftank;
	}
	
	public static void main(String[] args) {
		Motor[] motor1 = new Motor[1];
		motor1[0] = new Motor("F100-PW-200", 5);
		bom[] bom1 = new bom[10];
		bom1[0] = new bom(2.22, 0.273 , 227);
		BrandstofTank brandstoftank1 = new BrandstofTank("Kerosine", 183380);
		Plane plane1 = new Plane("F-16 Fighting Falcon", "General Dynamics", motor1, bom1, brandstoftank1);
	}
}

