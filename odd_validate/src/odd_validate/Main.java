package odd_validate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float multiplier, winRate;
		int operator;
		
		System.out.println("============ WELCOME TO ODD VALIDATE ============ \n");
		System.out.println("\n");
		System.out.println("1. INICIAR SISTEMA \n");
		System.out.println("2. SAIR");
		
		operator = ler.nextInt();
		
		while(operator == 1) {
		
			System.out.println("INSIRA A ODD: ");
			multiplier = ler.nextFloat();
		
			System.out.println("INSIRA O WIN RATE DO TIME: ");
			winRate = ler.nextFloat();
		
			validate a1 = new validate(multiplier, winRate);		
		
			a1.oddValidate();
			
			System.out.println("1. REALIZAR NOVA CONSULTA");
			System.out.println("2. SAIR");
			operator = ler.nextInt();
		}
	}
}
