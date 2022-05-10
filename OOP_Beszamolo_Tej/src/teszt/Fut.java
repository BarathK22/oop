package teszt;

import java.time.LocalDate;
import java.util.Scanner;

import etel.Kiszerel;
import etel.Tej;
import etel.Type;

public class Fut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Tej[] ihatoTejek = new Tej[3];
		for (int i = 0; i < 2; i++) {
			ihatoTejek[i] = new Tej(beolvas(), sc.nextLine(),
					LocalDate.of(sc2.nextInt(), (int) (Math.random() * 12) + 1, (int) (Math.random() * 30) + 1),
					LocalDate.of(sc2.nextInt(), (int) (Math.random() * 12) + 1, (int) (Math.random() * 30) + 1),
					Type.ZSIROS, Kiszerel.LITERES);
		}
		for (int i = 2; i < 3; i++) {
			ihatoTejek[i] = new Tej(beolvas(), sc.nextLine(),
					LocalDate.of(sc2.nextInt(), (int) (Math.random() * 12) + 1, (int) (Math.random() * 30) + 1),
					LocalDate.of(sc2.nextInt(), (int) (Math.random() * 12) + 1, (int) (Math.random() * 30) + 1),
					Type.ZSIROS, Kiszerel.POHARAS);
		}
		sc.close();
		sc2.close();
		for (int i = 0; i < ihatoTejek.length; i++) {
			System.out.println(ihatoTejek[i].toString());
		}
		System.out.println("Iható tejek: \n");
		listazo(ihatoTejek);
		System.out.println("Egységárak: " + egysegaraksum(ihatoTejek));
	}

	public static int beolvas() {
		Scanner sc = new Scanner(System.in);
		int vissza = 0;
		boolean ok = false;
		do {
			System.out.println("Add meg az egységárat 150 és 220 között:");
			vissza = sc.nextInt();
			if (vissza > 150 && vissza < 220) {
				ok = true;
			}

		} while (!ok);
		
		return vissza;
	}

	public static void listazo(Tej[] ihatoTejek) {
		for (int i = 0; i < ihatoTejek.length; i++) {
			if (ihatoTejek[i].getTipus() == Type.ZSIROS && ihatoTejek[i].getKiszereles() == Kiszerel.POHARAS
					&& ihatoTejek[i].ihatoE()) {
				System.out.println(ihatoTejek[i].toString());

			}

		}

	}

	public static int egysegaraksum(Tej[] ihatoTejek) {
		int sum = 0;
		for (int i = 0; i < ihatoTejek.length; i++) {
			sum += ihatoTejek[i].getEgysegar();
		}

		return sum;

	}

}
