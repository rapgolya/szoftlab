package szoftlab4;

import java.util.ArrayList;

import javax.swing.plaf.SliderUI;




public class Controller {
	Jatekter jatekter;
	ArrayList<Aktiv> aktiv;
	
	public Controller(Jatekter ter){		// A Controller konstruktora
		jatekter = ter;
		aktiv = new ArrayList<Aktiv>();
	}
	
	public void indit(){			//P�lya kiv�laszt�sa, j�t�kos felruh�z�sa var�zser�vel
		
		int palyaSzam =0;
		jatekter.betolt(palyaSzam);
		jatekter.felhasznalo.varazserotKap(100);
		startTick();
		
		
		
	}
	
	public void startTick(){	//Tick ind�t�sa
	
		for(Aktiv elem: aktiv){
			elem.tick();
		}
		
		try {
			wait(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void meghaltam(int ertek){	// A j�t�kos var�zser�t kap
	
		
		jatekter.felhasznalo.varazserotKap(ertek);
		

	}
	
	public void addAktiv(Aktiv a ){
		aktiv.add(a);
	}
	
	//F�ggv�ny, aminek megh�v�s�val jelezhetj�k a j�t�k v�g�t. True-t kell neki �tadni, ha a j�t�kos nyert, 
	//false-ot ha a j�t�kos vesztett.
	public void endgame(boolean nyerte){
		
	}



}
