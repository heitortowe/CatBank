import java.util.Scanner;

public class ContaKids extends SistemBancario {
	
	
	Scanner sc = new Scanner(System.in);
	
	ContaKids(){
		System.out.print("CPF: ");
		setCpf(sc.next());
		System.out.print("Nome da crianca: ");
		setNome(sc.nextLine());
		System.out.print("Endereco: ");
		setEndereco(sc.nextLine());
		System.out.print("Nome de um responsável: ");
		setNome(sc.nextLine());
		System.out.print("Numero da conta do responsavel: ");
		setNumero(sc.nextInt());
		System.out.println("Deseja sacar quanto? ");
		transferir(sc.nextDouble());
	}
	public static void main(String[] args) {
		new ContaKids();
	}	
}
