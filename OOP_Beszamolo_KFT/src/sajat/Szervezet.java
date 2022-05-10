package sajat;

public abstract class Szervezet {



	private String nev;
	private String szekhely;
	private Tevkor tevekenysegikor;
	private double adokulcs;
	public Szervezet(String nev, String szekhely, Tevkor tevekenysegikor) {
		super();
		this.nev = nev;
		this.szekhely = szekhely;
		this.tevekenysegikor = tevekenysegikor;
		if(this.tevekenysegikor == Tevkor.OKTATAS) {
			this.adokulcs = 0.1;
		}else {
			this.adokulcs = 0.2;
		}
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getSzekhely() {
		return szekhely;
	}
	public void setSzekhely(String szekhely) {
		this.szekhely = szekhely;
	}
	public Tevkor getTevekenysegikor() {
		return tevekenysegikor;
	}
	public void setTevekenysegikor(Tevkor tevekenysegikor) {
		this.tevekenysegikor = tevekenysegikor;
	}
	public double getAdokulcs() {
		return adokulcs;
	}
	public void setAdokulcs(double adokulcs) {
		if(this.tevekenysegikor == Tevkor.OKTATAS) {
			this.adokulcs = 0.1;
		}else {
			this.adokulcs = 0.2;
	}
	
	}
	@Override
	public String toString() {
		return "Szervezet [nev=" + nev + ", szekhely=" + szekhely + ", tevekenysegikor=" + tevekenysegikor
				+ ", adokulcs=" + adokulcs + "]";
	}
	
	public abstract double adoSzamito(double adokulcs);

}
