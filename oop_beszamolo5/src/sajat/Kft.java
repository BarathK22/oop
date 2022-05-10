package sajat;

public class Kft extends Szervezet {

	private long arbevetel;
	private int alkletszam;
	private final int jegyzettoke = 3000000;

	public Kft(String nev, String szekhely, tevkor tevekenysegikor, long arbevetel, int alkletszam) {
		super(nev, szekhely, tevekenysegikor);
		this.arbevetel = arbevetel;
		this.alkletszam = alkletszam;
	}

	public Kft(String nev, String szekhely, tevkor tevekenysegikor) {
		super(nev, szekhely, tevekenysegikor);
		this.arbevetel = 1000000;
		this.alkletszam = (int) (Math.random() * 10) + 1;
	}

	@Override
	public String toString() {
		return "Kft [arbevetel=" + arbevetel + ", alkletszam=" + alkletszam + ", jegyzettoke=" + jegyzettoke + "]"
				+ super.toString()+ " Vagyon: " +vagyonCalculator(jegyzettoke,arbevetel);
	}


	public long getArbevetel() {
		return arbevetel;
	}

	public void setArbevetel(long arbevetel) {
		this.arbevetel = arbevetel;
	}

	public int getAlkletszam() {
		return alkletszam;
	}

	public void setAlkletszam(int alkletszam) {
		this.alkletszam = alkletszam;
	}

	@Override
	public double adoCalc(double adokulcs) {
		double befizetendoado = 0;
		if(super.getSzekhely()== "Budapest") {
			befizetendoado= (super.getAdokulcs()*arbevetel)*1.1;
		}else {
			befizetendoado = super.getAdokulcs()*arbevetel;
		}
		
		return befizetendoado;
	}
	
	private long vagyonCalculator(int jegyzettoke, long arbevetel) {
		long vagyon = 0;
		vagyon = jegyzettoke + arbevetel - (long)adoCalc(super.getAdokulcs());

		return vagyon;

	}

}
