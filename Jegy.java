package Pack;

import java.time.LocalDate;

public abstract class Jegy {
	
	private LocalDate datum;
	private Kedvezmeny kedvezmeny;
		
	public Jegy(LocalDate datum, Kedvezmeny kedvezmeny) {
		super();
		this.datum = datum;
		this.kedvezmeny = kedvezmeny;
	}

	@Override
	public String toString() {
		return "Jegy [datum=" + datum + ", kedvezmeny=" + kedvezmeny + "]";
	}

	public LocalDate getDatum() {
		return datum;
	}

	public Kedvezmeny getKedvezmeny() {
		return kedvezmeny;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public void setKedvezmeny(Kedvezmeny kedvezmeny) {
		this.kedvezmeny = kedvezmeny;
	}
	
	public abstract int jegyarkedvezmeny();
}
