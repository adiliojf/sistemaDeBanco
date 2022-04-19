package tecnicasDeProg;

public class Conta {
	
	private String numeroDaConta;
	private double saldo;
	
	Conta(String numeroDaConta){
		this.numeroDaConta = numeroDaConta;
		saldo = 0;
	}
	
	public void debitar(double valor) {
		saldo = saldo - valor;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public String numeroDaConta() {
		return this.numeroDaConta;
	}
	
	public double saldo() {
		return this.saldo;
	}
}
