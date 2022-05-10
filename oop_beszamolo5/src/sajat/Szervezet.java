package sajat;

public abstract class Szervezet {

	private String nev;
	private String szekhely;
	private tevkor tevekenysegikor;
	private double adokulcs;
	
	public Szervezet(String nev, String szekhely, tevkor tevekenysegikor) {
		super();
		this.nev = nev;
		this.szekhely = szekhely;
		this.tevekenysegikor = tevekenysegikor;
		if(this.tevekenysegikor==tevkor.OKTATAS) {
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
	public tevkor getTevekenysegikor() {
		return tevekenysegikor;
	}
	public void setTevekenysegikor(tevkor tevekenysegikor) {
		this.tevekenysegikor = tevekenysegikor;
	}
	public double getAdokulcs() {
		return adokulcs;
	}
	public void setAdokulcs(double adokulcs) {
		if(this.tevekenysegikor==tevkor.OKTATAS) {
			this.adokulcs = 0.1;
		}else {
			this.adokulcs = 0.2;
		}
	}
	
	public abstract double adoCalc (double adokulcs);
	
	
	
}
