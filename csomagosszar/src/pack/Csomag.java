package pack;

public class Csomag {
	
	private String cim;
	private double csomag_sulya;
	private int csomag_erteke;
	private int bermentesites_dija;
	private Statusz statusz;
	
	public Csomag(String cim, double csomag_sulya, int csomag_erteke) {
		super();
		this.cim = cim;
		this.csomag_sulya = csomag_sulya;
		this.csomag_erteke = csomag_erteke;
		
		this.statusz = null;
		this.bermentesites_dija = bermentesitesDija(this.csomag_sulya);
	}
	
	private int bermentesitesDija(double csomag_sulya)
	{
		if (csomag_sulya <= 2) 
		{
			return 1630;
		}
		else if( (csomag_sulya > 2) && (csomag_sulya <= 5) )
		{
			return 1850;
		}
		else if( (csomag_sulya > 5) && (csomag_sulya <= 10) )
		{
			return 1960;
		}
		
		return 2180;
	}

	public String getCim() {
		return cim;
	}

	public double getCsomag_sulya() {
		return csomag_sulya;
	}

	public int getCsomag_erteke() {
		return csomag_erteke;
	}

	public int getBermentesites_dija() {
		return bermentesites_dija;
	}

	public Statusz getStatusz() {
		return statusz;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public void setCsomag_sulya(double csomag_sulya) {
		this.csomag_sulya = csomag_sulya;
	}

	public void setCsomag_erteke(int csomag_erteke) {
		this.csomag_erteke = csomag_erteke;
	}

	public void setBermentesites_dija(int bermentesites_dija) {
		this.bermentesites_dija = bermentesites_dija;
	}

	public void setStatusz(Statusz statusz) {
		this.statusz = statusz;
	}

	@Override
	public String toString() {
		return "Csomag [cim=" + cim + ", csomag_sulya=" + csomag_sulya + ", csomag_erteke=" + csomag_erteke
				+ ", bermentesites_dija=" + bermentesites_dija + ", statusz=" + statusz + "]";
	}
	
}
