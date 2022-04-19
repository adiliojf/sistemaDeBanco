package tecnicasDeProg;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Conta> contas = new ArrayList<>();	

	public void cadastrar(Conta conta) {
		this.contas.add(conta);
	}
	
	private Conta procurar(String numero) {
		Conta contaAchada = null;
		
		for(Conta conta: contas) {
			if(conta.numeroDaConta().equals(numero)) {
				contaAchada = conta;
				}
		}
		return contaAchada;
		
	}
	
	public void creditar(String numero, double valor) {
		Conta conta;
		conta = procurar(numero);
		
		if(conta != null) {
			conta.creditar(valor);
		}else {
			System.out.println("Conta inexistente!");
		}
	}
	
	public void debitar(String numero, double valor) {
		Conta conta;
		conta = procurar(numero);
		
		if(conta != null) {
			conta.debitar(valor);
		}else {
			System.out.println("Conta inexistente");
		}
	}
	
	public double saldo(String numero) {
		Conta conta;
		conta = procurar(numero);
		
		if(conta != null) {
			return conta.saldo();
		}else {
			return 0;
		}
	}
	
	public void transferir(String origem, String destino, double valor) {
		Conta contaOrigem;
		contaOrigem = procurar(origem);
		
		Conta contaDestino;
		contaDestino = procurar(destino);
		
		if((contaOrigem != null) && (contaDestino != null)) {
			if((valor >= 0) && (valor > contaOrigem.saldo())) {
				System.out.println("Saldo insuficiente.");
			}else if(contaOrigem != contaDestino) {
				contaOrigem.debitar(valor);
				contaDestino.creditar(valor);
			}else {
				System.out.println(
						"Não foi possível concluir sua transação. Verifique novamente. ");
			}
		}else {
			System.out.println("Não foi encontrado número da conta de origem ou destino");
		}
		
		
	}
}


















