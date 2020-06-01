package nakupniKosik;

import java.util.ArrayList;

public class SeznamZbozi implements SimpleList<Zbozi> {
	ArrayList<Zbozi> seznam = new ArrayList<Zbozi>();
	
	@Override
	public void add(Zbozi a) {
		seznam.add(a);

	}

	@Override
	public Zbozi remove(int i) {
		// TODO Auto-generated method stub
		return seznam.remove(i);
	}

	@Override
	public Zbozi get(int i) {
		// TODO Auto-generated method stub
		return seznam.get(i);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return seznam.size();
	}

	public int find(String nazev) {
		for(int i=0; i<seznam.size(); i++) {
			 Zbozi polozka = seznam.get(i);
			 if (polozka.getNazev().equalsIgnoreCase(nazev)) {
				return i;
			}
		}
		return -1;		
	}
}
