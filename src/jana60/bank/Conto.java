package jana60.bank;

public class Conto {
	
	private int numeroConto;
	private int saldo;
	private String nome;
	
	public Conto ( String nome, int numeroConto ) {
		
		this.numeroConto=numeroConto;
		this.nome=nome;
		this.saldo=0;
	}
	
	public int getsaldo () {
		return saldo;
	}
	
	public int getnumeroConto() {
		return numeroConto;
	}

	public void addMoney (int deposito) {
		saldo += deposito;
	}
	public int getMoney (int prelievo) {
		 if (saldo-prelievo>0) {
			return saldo-=prelievo;
		}else
		return 0;
	}
	
	@Override
	public String toString() {
		
		return "nome: " + nome
				+ "\nnumero di conto " +  numeroConto
				+ "\nsaldo " + saldo;
				
	}
	
}
