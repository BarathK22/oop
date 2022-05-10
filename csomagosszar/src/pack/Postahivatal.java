package pack;

import pack.Csomag;

public class Postahivatal {
	
	Csomag[] Tomb;
	private int csomagok_szama;

	public Postahivatal(int raktarKapacitas) 
	{
		super();
		Tomb = new Csomag[raktarKapacitas];
		this.csomagok_szama = 0;
	}
	
	public void csomagfelvetel(Csomag csomag)
	{
		csomag.setStatusz(Statusz.POSTAN);
		
		for (int i = 0; i < Tomb.length; i++) 
		{
			Tomb[i].setStatusz(csomag.getStatusz()); //!.!.!
		}
		
	}
	
	public void Kilistazas(Csomag[] Tomb)
	{
		for (Csomag csomag : Tomb) 
		{
			System.out.println(csomag.toString());
		}
	}
	
	public void kezbesites(Csomag csomag)
	{
		int r = 0;
		
		for (int i = 0; i < Tomb.length; i++) 
		{
			r = (int) (Math.random()*2) + 1;
			
			if (r == 1) 
			{
				csomag.setStatusz(Statusz.ERTESITVE);
			}
			else if(r == 2)
			{
				csomag.setStatusz(Statusz.KEZBESITVE);
			}
			
			//Tomb[i].setStatusz(Statusz.KEZBESITVE);
		}
	}
	
	
}
