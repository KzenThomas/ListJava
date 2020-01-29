package list;

import java.util.ArrayList;
import java.util.List;

public class Coolblue {


	List<String> aankopen = new ArrayList<String>();

	public static void main(String[] args) {
		Coolblue coolblue = new Coolblue();
		coolblue.aankopen.add("Ipad");
		coolblue.aankopen.add("Tablet");
		coolblue.aankopen.add("Wasmachine");
		coolblue.aankopen.add("Oplader");
		coolblue.aankopen.add("Laptop");
		coolblue.aankopen.add("Computer");
		coolblue.aankopen.add("Telefoon");

		
		System.out.println(coolblue.aankopen.size());
//		coolblue.aankopen.clear();

		for (int i = 0; i < coolblue.aankopen.size(); i++) {
			String CoolblueItems = coolblue.aankopen.get(i);
			System.out.println(CoolblueItems);
		}
	//	for (String CoolblueAankopen : coolblue.aankopen) {
		//	System.out.println(CoolblueAankopen);
		}

	//}

	public void AddtoAankopen(String aankopen) {
		if (aankopen.contains("Tablet")) {
			System.out.println("tablet is niet meer beschikbaar");
		} else {
			this.aankopen.add(aankopen);
		}
	}
	 
}
