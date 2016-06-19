package Controller;

import Model.Firebat;
import Model.Marine;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Ctrl + o : import
		 */
		
		Marine m1 = new Marine(100,50);
		int m_Energy = m1.getM_Energy();
		//System.out.println(m1.getM_Energy());		
		m1.setM_Energy(70);
		//System.out.println(m1.getM_Energy());
		
		Marine m2 = new Marine(50,0);
		
		Firebat f1 = new Firebat(50,50);
		Firebat f2 = new Firebat(55,10);
		
		
		m1.Attack("m1",1); 
		m2.Attack("m2",0);
	
	}

}
