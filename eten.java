package list;

import java.util.ArrayList;
import java.util.List;



public class eten {
	boolean lekker;
	int calorieŽn;

	public void lekker(boolean lekker) {

	}

	public void vet(boolean lekker, int calorieŽn) {
		
	}

	List<String> eten = new ArrayList<String>();

	public static void main(String[] args) {
		eten voedsel = new eten();
		voedsel.eten.add("chips");
		voedsel.eten.add("patatten");
		voedsel.eten.add("fruit");
		voedsel.eten.add("groenten");
		System.out.println(voedsel.eten);
		
	}
}
