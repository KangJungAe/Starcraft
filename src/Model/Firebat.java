package Model;

public class Firebat {
	
	public int f_Energy; 
	public int f_Attack;
	
	public Firebat(int f_Energy, int f_Attack) {
		this.f_Energy = f_Energy;
		this.f_Attack = f_Attack;
	}
	
	public void Attack(String c_Firebat, int c_Attack) {
		if (c_Attack == 1) {
			this.f_Energy = this.f_Energy + this.f_Attack;	
			System.out.println(c_Firebat + " 공격합");
			System.out.println(this.f_Energy);
			System.out.println(this.f_Attack);
		}
		else
		{	
			this.f_Energy = this.f_Energy - this.f_Attack;
			System.out.println(c_Firebat + " 공격당합");
			System.out.println(this.f_Energy);
			System.out.println(this.f_Attack);
		}
				
				
		if (this.f_Energy <= 0 || this.f_Attack <= 0) {
			System.out.println(c_Firebat + "죽음");
			System.out.println(this.f_Energy);
			System.out.println(this.f_Attack);
		}
					
	}
}
