package fut;

import java.util.Scanner;

import pack.Postahivatal;
import pack.Statusz;
import  pack.Csomag;

public class Run {

	public static void main(String[] args) 
	{
		int input = Beolvasas();
		
		Postahivatal ph = new Postahivatal( input );
		
		
		Csomag cs;
		int db = 0;
		for (int i = 0; i < input; i++) 
		{
			
			cs = new Csomag("Miskolc" + i, (Math.random()*20)+1, (int) (Math.random()*10000)+1000);
			System.out.println(cs);
			
			ph.kezbesites(cs);
			System.out.println(cs);
			
			if (cs.getStatusz() == Statusz.ERTESITVE) 
			{
				db++;
			}
					
		}
		
		System.out.println("\n\n\tErtesitve: " + db + " db");
		
	}
	
	private static int Beolvasas()
	{
		boolean ok = false;
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do
		{
			
			ok = false;
			System.out.println("Kerek egy egesz szamot 20 es 50 kozott! ");
			input = sc.nextInt();
			
			if ( (input >= 20) && (input <= 50) ) 
			{
				ok = true;
			}
			else
			{
				System.out.println("Hibas adat! ");
				ok = false;
			}
			
		}
		while( ok != true );
		
		return input;
	}
}
