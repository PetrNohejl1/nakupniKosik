package nakupniKosik;

public class Main {

	public static void main(String[] args) {
	
		SeznamZbozi sklad = new SeznamZbozi();
		Zbozi zbozi = new Zbozi();
		zbozi.setNazev("toaletak");
		zbozi.setCena(10);
		zbozi.setPocetKusu(100);
		sklad.add(zbozi);
		
		zbozi = new Zbozi();
		zbozi.setNazev("mydlo");
		zbozi.setCena(20);
		zbozi.setPocetKusu(1);
		sklad.add(zbozi);
		
		for(int i=0; i<sklad.size(); i++) {
		 Zbozi polozka = sklad.get(i);
		System.out.println(polozka.toString());
		}
		
		SeznamZbozi kosik = new SeznamZbozi();		
		//chci dat do kosiku mydlo - vytahnu ho ze skladu
		int index = sklad.find("mydlo");
		if (index != -1) {
			Zbozi zboziNaSklade = sklad.get(index);
			//chci pridat do kosiku urcity pocet kusu
			int pocetKusu = 1;
			if (zboziNaSklade.getPocetKusu() >= pocetKusu) {
				zboziNaSklade.setPocetKusu(zboziNaSklade.getPocetKusu() - pocetKusu);
				Zbozi zboziDoKosiku = new Zbozi();
				zboziDoKosiku.setCena(zboziNaSklade.getCena());
				zboziDoKosiku.setNazev(zboziNaSklade.getNazev());
				zboziDoKosiku.setPocetKusu(pocetKusu);
				kosik.add(zboziDoKosiku);
			}
			else {
				System.out.println("Nelze pridat tolik kusu zbozi");
			}
		}
		else System.out.println("Zbozi neni na sklade");			

		for(int i=0; i<sklad.size(); i++) {
			 Zbozi polozka = sklad.get(i);
			System.out.println(polozka.toString());
  	    }
		
		
		index = sklad.find("mydlo");
		if (index != -1) {
			Zbozi zboziNaSklade = sklad.get(index);
			//chci pridat do kosiku urcity pocet kusu
			int pocetKusu = 1;
			if (zboziNaSklade.getPocetKusu() >= pocetKusu) {
				zboziNaSklade.setPocetKusu(zboziNaSklade.getPocetKusu() - pocetKusu);
				Zbozi zboziDoKosiku = new Zbozi();
				zboziDoKosiku.setCena(zboziNaSklade.getCena());
				zboziDoKosiku.setNazev(zboziNaSklade.getNazev());
				zboziDoKosiku.setPocetKusu(pocetKusu);
				kosik.add(zboziDoKosiku);
			}
			else {
				System.out.println("Nelze pridat tolik kusu zbozi");
			}
		}
		else System.out.println("Zbozi neni na sklade");			


		
		
		
		
		
		for(int i=0; i<sklad.size(); i++) {
			 Zbozi polozka = sklad.get(i);
			System.out.println(polozka.toString());
  	    }

		
	}

}
