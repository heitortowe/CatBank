import java.util.Scanner;

public class PessoaFisica extends SistemBancario {
		Scanner sc = new Scanner(System.in);
		
		PessoaFisica(){
			System.out.print("Numero da conta: ");
			setNumero(sc.nextInt());
			System.out.print("Numero da agencia: ");
			setAgencia(sc.nextInt());
			System.out.print("Depositar");
			Depositar(sc.nextDouble());
			System.out.print("Transferir: ");
			transferir(sc.nextDouble());
			
		}
	public static void main(String[] args) {
		new PessoaFisica();
	}
	
		
	}

