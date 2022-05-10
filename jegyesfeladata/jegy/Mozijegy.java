package jegy;

import java.time.LocalDate;
import java.util.Arrays;

public class Mozijegy extends Jegy {
	private String filmcim;
	private int alapar;
	private int[] hely = new int[3];
	
	
	
	public Mozijegy(LocalDate datum, Kedvezmeny kedvezmeny, String filmcim, int[] hely) {
		super(datum, kedvezmeny);
		this.filmcim = filmcim;
		this.alapar = (int)(Math.random()*1001)+1;
		this.hely = hely;
		hetfoi();
	}



	public Mozijegy(String filmcim, int[] hely) {
		super(LocalDate.now(), Kedvezmeny.TELJESARU);
		this.filmcim = filmcim;
		this.hely = hely;
		hetfoi();
	}



	public String getFilmcim() {
		return filmcim;
	}



	public void setFilmcim(String filmcim) {
		this.filmcim = filmcim;
	}



	public int getAlapar() {
		return alapar;
	}



	public void setAlapar(int alapar) {
		this.alapar = alapar;
	}



	public int[] getHely() {
		return hely;
	}



	public void setHely(int[] hely) {
		this.hely = hely;
	}
	
	
	private void hetfoi() {
		if(super.getDatum().getDayOfWeek().name()=="MONDAY") {
			super.setKedvezmeny(Kedvezmeny.HETFO);
		}
	}



	@Override
	public int jegyar(Kedvezmeny kedvezmeny) {
		if(kedvezmeny == Kedvezmeny.DIAK) {
			return (int)(this.alapar*0.5);
		}
		if(kedvezmeny == Kedvezmeny.HETFO) {
			return (int)(this.alapar*0.75);
		}
		return alapar;
	}



	@Override
	public String toString() {
		return "Mozijegy [filmcim=" + filmcim + ", alapar=" + alapar + ", hely=" + Arrays.toString(hely) + "]"+super.toString()+"jegyar: "+jegyar(super.getKedvezmeny());
	}
	
	
	
	

	
	
	
	
}
