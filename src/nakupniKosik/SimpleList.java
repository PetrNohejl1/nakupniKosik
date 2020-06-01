package nakupniKosik;

public interface SimpleList<Zbozi> {
	public void add(Zbozi a);
	public Zbozi remove(int i);
	public Zbozi get(int i);
	public int size();
}     