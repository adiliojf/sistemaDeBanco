package tecnicasDeProg;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Banco bradesco = new Banco();
		bradesco.cadastrar(new Conta("30656-8"));
		bradesco.cadastrar(new Conta("48986-1"));
		
		bradesco.creditar("30656-8", 500);
		bradesco.debitar("30656-8", 300);

		
		bradesco.creditar("48986-1", 1200);
		
		System.out.println(bradesco.saldo("30656-8"));
		System.out.println(bradesco.saldo("48986-1"));
		
		
		bradesco.transferir("30656-8", "48986-1", 200);
		
		System.out.println(bradesco.saldo("30656-8"));
		System.out.println(bradesco.saldo("48986-1"));
	}
}
