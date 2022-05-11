package Teszt;

import java.time.LocalDate;
import java.util.Scanner;

import Etel.Kiszereles;
import Etel.Tej;
import Etel.Tejtermek;
import Etel.Tipus;

public class Fut {

	public static void main(String[] args) 
	{
	
		Tej[] IhatoTejek = new Tej[5];
		Beolvasas(IhatoTejek);
		Kiiras(IhatoTejek);
		Listazas(IhatoTejek);
		System.out.println("OsszEgysegar: " + OsszEgysegar(IhatoTejek));
		
		
		
	}
	
	private static void Beolvasas(Tej[] IhatoTejek)
	{
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		boolean ok = false;
		
		do
		{
			
			ok = false;
			System.out.println("Kerem az egysegarat! (150-220) ");
			input = sc.nextInt();
			
			if( (input >= 150) && (input <= 220) )
			{
				ok = true;
			}
			else
			{
				ok = false;
				System.out.println("Hibas adat! ");
			}
			
		}
		while( ok != true );
		
		int ev1 = 0;
		int ev2 = 0;
		
		System.out.println("Kerem az ev1-et: ");
		ev1 = sc.nextInt();
		System.out.println("Kerem az ev2-t: ");
		ev2 = sc.nextInt();
		
		if (ev1 > ev2) 
		{
			do
			{
				System.out.println("ev2 nagyobb, mint az ev1 :/ Adj meg egy uj ev1-et.");
				ev2 = sc.nextInt();
			}
			while(ev1 > ev2);
		}
		
		for (int i = 0; i < IhatoTejek.length; i++) 
		{
			
			IhatoTejek[i] = new Tej(input, "Gyarto", LocalDate.of(ev1, (int) (Math.random()*12)+1, (int) (Math.random()*30)+1), LocalDate.of(ev2, (int) (Math.random()*12)+1, (int) (Math.random()*30)+1), 500, Tipus.ZSIROS, Kiszereles.FELLITERES);
		}
		
	}
	private static void Kiiras(Tej[] IhatoTejek)
	{
		for (Tej tej : IhatoTejek) 
		{
			System.out.println(tej.toString());
		}
	}
	
	private static void Listazas(Tej[] IhatoTejek)
	{
		System.out.println("\n\n\tListazas: ");
		
		for (Tej tej : IhatoTejek) 
		{
			if (tej.getKiszereles() == Kiszereles.POHARAS && tej.getTipus() == Tipus.ZSIROS) 
			{
				System.out.println(tej.toString());
			}
		}
	}
	private static int OsszEgysegar(Tej[] IhatoTejek)
	{
		int ossz = 0;
		
		for (int i = 0; i < IhatoTejek.length; i++) 
		{
			ossz += IhatoTejek[i].getEgysegar();
		}
		
		return ossz;
	}

}
