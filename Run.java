package Fut;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;

import Pack.Jegy;
import Pack.Kedvezmeny;
import Pack.Mozijegy;

public class Run {

	public static void main(String[] args) 
	{
		
		Mozijegy[] Tomb = new Mozijegy[2];		
		
		Beolvasas(Tomb);
		Kiiras(Tomb);
		
		System.out.println("Kulonbozo cimek: " + Statisztika(Tomb));
	}
	
	private static void Beolvasas(Mozijegy[] Tomb)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[3];
		boolean ok = false;
		
		for (int i = 0; i < 3; ) 
		{
			do
			{
				
				ok = false;
				System.out.println("\tKerem az adatokat! terem/sor/szek (1 es 10 kozott)");
				input[i] = sc.nextInt();
				
				if (input[i]  >= 1 && input[i] <= 10) 
				{
					ok = true;
					i++;
				}
				else
				{
					System.out.println("Hibas adat! ");
					ok = false;
				}
				
			}
			while( ok != true );
		}
		
		int ev = 0;
		String cim;
		for (int i = 0; i < Tomb.length; i++) 
		{
			System.out.println("Kerem a evet! ");
			ev = sc.nextInt();
			System.out.println("Kerem a cimet! ");
			cim = sc.next();
			
			Tomb[i] = new Mozijegy(LocalDate.of(ev, (int)(Math.random()*12)+1, (int)(Math.random()*30)+1), Kedvezmeny.DIAK, cim, input);
			//Tomb[i] = new Mozijegy(cim, input);
			
		}
	}
	
	private static void Kiiras(Mozijegy[] Tomb)
	{
		for (Mozijegy mozijegy : Tomb) 
		{
			System.out.println(mozijegy);
		}
	}
	
	private static int Statisztika(Mozijegy[] Tomb)
	{
		int db = 0;
		boolean ok = true;
		
		for (int i = 0; i < Tomb.length; i++) 
		{
			for (int j = 0; j < Tomb.length; j++) 
			{
				if (Tomb[i].getFilmcim() == Tomb[j].getFilmcim()) 
				{
					ok = false;
				}
			}
			
			if (ok) 
			{
				db++;
			}
			
		}
		
		return db;
	}

}
