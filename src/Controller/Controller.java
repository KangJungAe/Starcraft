package Controller;

import Model.Firebet;
import Model.Marine;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine marine = new Marine();
		Firebet firebet = new Firebet();
		
		marine.inform();
		marine.attack(firebet);

	}

}
