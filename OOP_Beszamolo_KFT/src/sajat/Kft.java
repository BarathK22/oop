package sajat;

public class Kft extends Szervezet {

	private long arbevetel;
	private int alkalmazottletszam;
	private final long jegyzettoke = 3000000;

	public Kft(String nev, String szekhely, Tevkor tevekenysegikor, long arbevetel, int alkalmazottletszam) {
		super(nev, szekhely, tevekenysegikor);
		this.arbevetel = arbevetel;
		this.alkalmazottletszam = alkalmazottletszam;
	}

	public Kft(String nev, String szekhely, Tevkor tevekenysegikor) {
		super(nev, szekhely, tevekenysegikor);
		this.alkalmazottletszam = (int) (Math.random() * 10) + 1;
		this.arbevetel = 1000000;
	}

	@Override
	public String toString() {
		return "Kft [arbevetel=" + arbevetel + ", alkalmazottletszam=" + alkalmazottletszam + ", jegyzettoke="
				+ jegyzettoke + "]" + super.toString() + "Vagyon: " + vagyonSzamito();
	}

	@Override
	public double adoSzamito(double adokulcs) {
		double ado = 0;
		if (super.getSzekhely() == "Budapest") {
			ado = (adokulcs * arbevetel) * 1.1;
		} else {
			ado = adokulcs * arbevetel;
		}
		return ado;
	}

	public long vagyonSzamito() {
		long vagyon = 0;
		vagyon = jegyzettoke + arbevetel - (long) adoSzamito(super.getAdokulcs());

		return vagyon;
	}

}
