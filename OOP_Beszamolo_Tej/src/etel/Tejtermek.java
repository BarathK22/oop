package etel;

import java.time.LocalDate;

public class Tejtermek {
	
	private int egysegar;
	private String gyarto;
	private LocalDate gyartasido;
	private LocalDate lejaratiido;
	public Tejtermek(int egysegar, String gyarto, LocalDate gyartasido, LocalDate lejaratiido) {
		super();
		this.egysegar = egysegar;
		this.gyarto = gyarto;
		this.gyartasido = gyartasido;
		this.lejaratiido = lejaratiido;
	}
	@Override
	public String toString() {
		return "Tejtermek [egysegar=" + egysegar + ", gyarto=" + gyarto + ", gyartasido=" + gyartasido
				+ ", lejaratiido=" + lejaratiido + "]";
	}
	public int getEgysegar() {
		return egysegar;
	}
	public void setEgysegar(int egysegar) {
		this.egysegar = egysegar;
	}
	public String getGyarto() {
		return gyarto;
	}
	public void setGyarto(String gyarto) {
		this.gyarto = gyarto;
	}
	public LocalDate getGyartasido() {
		return gyartasido;
	}
	public void setGyartasido(LocalDate gyartasido) {
		this.gyartasido = gyartasido;
	}
	public LocalDate getLejaratiido() {
		return lejaratiido;
	}
	public void setLejaratiido(LocalDate lejaratiido) {
		this.lejaratiido = lejaratiido;
	}
	
	
	public boolean ihatoE() {
		boolean ihato = false;
		if(this.lejaratiido.isBefore(LocalDate.now())){
			ihato = true;
		}else {
			ihato = false;
		}
		
		return ihato;
	}

}
