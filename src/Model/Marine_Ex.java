package Model;

public class Marine_Ex {
	
	private int m_Energy; 
	private int m_Attack;
	
	/* 2016.06.19 2주차 
	 * 캡슐화
	 * Alt + Shift + s + r : get/set 만들기
	 * get : 조회만
	 * set : 값 변경 가능
	 */
	public int getM_Energy() {
		return m_Energy;
	}

	public void setM_Energy(int m_Energy) {
		this.m_Energy = m_Energy;
	}

	public int getM_Attack() {
		return m_Attack;
	}

	public void setM_Attack(int m_Attack) {
		this.m_Attack = m_Attack;
	}
	//
	
	//예제
	private int hp;
	private int power;
	private int shield;
	private boolean opt1;
	private boolean opt2;
	private boolean opt3;
    private int attackOpt1;
    private boolean isDead = false;
	
    
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public boolean isOpt1() {
		return opt1;
	}

	public void setOpt1(boolean opt1) {
		this.opt1 = opt1;
	}

	public boolean isOpt2() {
		return opt2;
	}

	public void setOpt2(boolean opt2) {
		this.opt2 = opt2;
	}

	public boolean isOpt3() {
		return opt3;
	}

	public void setOpt3(boolean opt3) {
		this.opt3 = opt3;
	}

	public int getAttackOpt1() {
		return attackOpt1;
	}

	public void setAttackOpt1(int attackOpt1) {
		this.attackOpt1 = attackOpt1;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	
    //속성
	public Marine_Ex(int m_Energy, int m_Attack) {
		this.m_Energy = m_Energy;
		this.m_Attack = m_Attack;
	}
	
	public void Attack(String c_Marine, int c_Attack) {
		if (c_Attack == 1) {
			this.m_Energy = this.m_Energy + this.m_Attack;	
			System.out.println(c_Marine + " 공격합");
		}
		else
		{	
			this.m_Energy = this.m_Energy - this.m_Attack;
			System.out.println(c_Marine + " 공격당합");
		}
		
		System.out.println("에너지 : " + this.m_Energy);
		System.out.println("공격력 : " + this.m_Attack);
		
				
		if (this.m_Energy <= 0 || this.m_Attack <= 0) {
			System.out.println(c_Marine + " 죽음");
			System.out.println("에너지 : " + this.m_Energy);
			System.out.println("공격력 : " + this.m_Attack);
		}
		
		
					
	}
}
