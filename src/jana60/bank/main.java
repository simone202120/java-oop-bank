package jana60.bank;

public class main {
	public static void main(String[] args) {
		Conto c = new Conto("simone",56432);
		
		System.out.println(c);
		
		c.addMoney(2300);
		System.out.println(c);
		
		c.getMoney(2400);
		System.out.println(c);
		
		c.addMoney(2300);
		System.out.println(c);
		
		
	}
}
