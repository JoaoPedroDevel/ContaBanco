package program;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	int numero = 1021;
	String agencia = "067-8";
	String nomeCliente = "MARIO ANDRADE";
	double saldo = 237.48;
	
	System.out.println("Por favor, digite o número da conta : ");
	int numeroUser = sc.nextInt();
	
	if(numeroUser == numero) {
		System.out.printf("Olá %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta de número %d. Seu saldo é de : %.2f e está disponível para saque.%n",nomeCliente,agencia,numero,saldo);
	}
	else {
		System.out.println("Usuário não encontrado!");
	}
}
}