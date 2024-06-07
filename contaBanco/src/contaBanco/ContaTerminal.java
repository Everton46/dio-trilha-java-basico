package contaBanco;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main (String[] args) {
		//criando o objeto scanner
		try {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
		System.out.println("Por favor,digite o numero da Conta!");
		int numero = scanner.nextInt();
		
     	System.out.println("Por favor, digite o numero da Agencia!");
     	String agencia = scanner.next();
        
     	System.out.println("Digite seu Nome!");
     	String nome = scanner.next();

        System.out.println("Digite sua saldo!");
        float saldo = scanner.nextFloat();
        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco,");
        
        System.out.print("sua agencia e " + (String)agencia + " conta " + numero +","+" seu saldo " + saldo + 
        " ja esta disponivel para saque!");
		}
		catch(InputMismatchException e) {
			System.err.println("O campo Saldo da conta precisa ser usado com '.' ex: 0.00");
		}
		
		
		
	}
}
