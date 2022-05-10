package fut;

import java.time.LocalDate;
import java.util.Scanner;

import jegy.Kedvezmeny;
import jegy.Mozijegy;

public class Fut {
	public static void main(String[] args) {
		Mozijegy[] mozijegy = new Mozijegy[3];
		Scanner datum = new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		
		mozijegy[0]=new Mozijegy(datumolvas(),Kedvezmeny.DIAK,string.nextLine(),beolvas());

		mozijegy[2]=new Mozijegy(datumolvas(),Kedvezmeny.DIAK,string.nextLine(),beolvas());
		

		mozijegy[3]=new Mozijegy(string.nextLine(),beolvas());
		
		datum.close();
		string.close();
	}
	
	
	private static int[] beolvas() {
		Scanner sc = new Scanner(System.in);
		int[] tomb = new int[3];
		boolean ok= false;
		do {
			System.out.println("Adja meg a terem szamat: ");
			tomb[0] = sc.nextInt();

			System.out.println("Adja meg a sor szamat: ");
			tomb[1] = sc.nextInt();
			

			System.out.println("Adja meg a szek szamat: ");
			tomb[2] = sc.nextInt();
			
			if(tomb[0]<=10&&tomb[0]>=1&&tomb[1]<=10&&tomb[1]>=1&&tomb[2]<=10&&tomb[2]>=1) {
				ok=true;
			}
			
		}while(!ok);
		return tomb;
	}
	private static LocalDate datumolvas() {
		Scanner sc = new Scanner(System.in);
		int ev = sc.nextInt();
		int honap = sc.nextInt();
		int nap = sc.nextInt();
		return(LocalDate.of(ev, honap, nap));
	}
	
	private static void listaz(Mozijegy[] tomb) {
		for (Mozijegy mozijegy : tomb) {
			mozijegy.toString();
		}
	}
	
	private static int szamol(Mozijegy[] tomb) {
		int db =0;
		for(int i =0;i<tomb.length;i++) {
			boolean ok=true;
			if(i!=0) {
				for(int j=0;j<i;j++) {
					if(tomb[i]==tomb[j]) {
						ok=false;
					}
				}
			}
			if(ok) {
				db+=1;
			}
			
		}
		return db;
	}
	
}
