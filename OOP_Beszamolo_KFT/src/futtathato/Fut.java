package futtathato;

import java.util.Scanner;

import sajat.Kft;
import sajat.Tevkor;

public class Fut {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Kft[] kft = new Kft[3];
		for (int i = 0; i < 2; i++) {
			kft[i]= new Kft(sc.nextLine(),sc.nextLine(),Tevkor.SWFEJLESZTES,arBeolvas(),letszamBeolvas());
		}
		for (int i = 2; i < kft.length; i++) {
			kft[i] = new Kft(sc.nextLine(),sc.nextLine(),Tevkor.OKTATAS);
		}
		sc.close();
		kiir(kft);
		System.out.println(vagyonNagyobb(kft));
	}
	
	public static void kiir(Kft[] kft) {
		for (int i = 0; i < kft.length; i++) {
			System.out.println(kft[i].toString());
		}
	}

	public static Kft vagyonNagyobb(Kft[] kft) {
		Kft max = kft[0];
		for (int i = 0; i < kft.length; i++) {
			if(kft[i].vagyonSzamito() > max.vagyonSzamito() ) {
				max = kft[i];
			}
		}
		return max;
		
		
		
	}
	public static long arBeolvas() {
		Scanner sc = new Scanner(System.in);
		long vissza = 0;
		boolean ok = false;

		do {
			System.out.println("Add meg az arbevetelt(Legalabb 1.000.000)");
			vissza = sc.nextLong();
			if (vissza >= 1000000) {
				ok = true;
			}

		} while (!ok);

		return vissza;

	}
	public static int letszamBeolvas() {
		Scanner sc = new Scanner(System.in);
		int vissza = 0;
		boolean ok = false;

		do {
			System.out.println("Add meg a letszamot(1-100 kozott");
			vissza = sc.nextInt();
			if (vissza > 1 && vissza < 100) {
				ok = true;
			}

		} while (!ok);

		return vissza;

	}

}
