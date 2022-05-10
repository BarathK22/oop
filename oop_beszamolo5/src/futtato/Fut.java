package futtato;

import java.util.Scanner;

import sajat.Kft;

import sajat.tevkor;

public class Fut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Kft[] kft = new Kft[3];
		for (int i = 0; i < kft.length; i++) {
			kft[i] = new Kft(sc.nextLine(), sc.nextLine(), tevkor.SWFEJLESZTES, arbevetelBekero(), letszamBekero());
		}
		
		tombKiir(kft);

	}
	
	private static long arbevetelBekero() {
		Scanner sc2 = new Scanner(System.in);
		long arbevetel = 0;
		boolean ok = false;
		do {
			System.out.println("Add meg az árbevételt: ");
			arbevetel = sc2.nextLong();
			if(arbevetel > 1000000) {
				ok = true;
			}
		}while(!ok);
		return arbevetel;
	}
	private static int letszamBekero() {
		Scanner sc3 = new Scanner(System.in);
		int letszam = 0;
		boolean ok = false;
		do {
			System.out.println("Add meg a létszámot: ");
			letszam = sc3.nextInt();
			if(letszam >= 1 && letszam <= 100) {
				ok = true;
			}
		}while(!ok);
		return letszam;
	}
	private static void tombKiir(Kft[] kft) {
		for (int i = 0; i < kft.length; i++) {
			System.out.println(kft[i].toString());
		}
	}
	

	

}
