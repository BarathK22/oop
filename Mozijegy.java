package Pack;

import java.time.LocalDate;
import java.util.Arrays;

public class Mozijegy extends Jegy {
	
	private String filmcim;
	private int alapar;
	private int[] Hely = new int[3]; //Terem, sor, szek.
	
	
	public Mozijegy(LocalDate datum, Kedvezmeny kedvezmeny, String filmcim, int[] hely) {
		super(datum, kedvezmeny);
		this.filmcim = filmcim;
		Hely = hely;
		this.alapar = (int) (Math.random()*2000)+1000;
		jegyarkedvezmeny();
	}

	public Mozijegy(String filmcim, int[] hely) {
		super(LocalDate.now(), Kedvezmeny.TELJESARU);
		this.filmcim = filmcim;
		Hely = hely;
		jegyarkedvezmeny();
	}

	public String getFilmcim() {
		return filmcim;
	}
	public int getAlapar() {
		return alapar;
	}
	public int[] getHely() {
		return Hely;
	}
	public void setFilmcim(String filmcim) {
		this.filmcim = filmcim;
	}
	public void setAlapar(int alapar) {
		this.alapar = alapar;
	}
	public void setHely(int[] hely) {
		Hely = hely;
	}
	
	public void HetfoiKedvezmeny()
	{
		
		if (super.getDatum().getDayOfWeek().name() == "MONDAY") 
		{
			super.setKedvezmeny(Kedvezmeny.HETFO);
		}
		
	}

	@Override
	public int jegyarkedvezmeny() {
		
		
		if (super.getKedvezmeny() == Kedvezmeny.DIAK) 
		{
			return (int) (this.alapar * 0.5);
		}
		else if(super.getKedvezmeny() == Kedvezmeny.HETFO)
		{
			return (int) (this.alapar * 0.75);
		}
		
		return  (int) (this.alapar * 1); //TELJESARU.

	
	}

	@Override
	public String toString() {
		return "Mozijegy [filmcim=" + filmcim + ", alapar=" + alapar + ", Hely=" + Arrays.toString(Hely)
				+ ", jegyarkedvezmeny()=" + jegyarkedvezmeny() + ", toString()=" + super.toString() + "]";
	}	
}
