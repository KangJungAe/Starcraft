package Controller;

import Model.Firebat_Ex;
import Model.Marine_Ex;

public class Controller_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Ctrl + o : import
		 */
		
		Marine_Ex m1 = new Marine_Ex(100,50);
		int m_Energy = m1.getM_Energy();
		//System.out.println(m1.getM_Energy());		
		m1.setM_Energy(70);
		//System.out.println(m1.getM_Energy());
		
		Marine_Ex m2 = new Marine_Ex(50,0);
		
		Firebat_Ex f1 = new Firebat_Ex(50,50);
		Firebat_Ex f2 = new Firebat_Ex(55,10);
		
		
		m1.Attack("m1",1); 
		m2.Attack("m2",0);
	
	}

}
