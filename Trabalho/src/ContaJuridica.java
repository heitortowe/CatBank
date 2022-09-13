import java.util.Scanner;

public class ContaJuridica extends SistemBancario{
	Scanner sc = new Scanner(System.in);
	
	ContaJuridica(){
		System.out.print("CNPJ: ");
		setCnpj(sc.next());
		System.out.print("Endereco: ");
		setEndereco(sc.nextLine());
		System.out.print("Nome do dono da empresa: ");
		setNome(sc.nextLine());
		System.out.print("Area de atuacao: ");
		setProfissao(sc.next());
		System.out.print("Deseja depositar quanto? ");
		Depositar(sc.nextDouble());
		System.out.print("Deseja sacar quanto? ");
		transferir(sc.nextDouble());
	}
	public static void main(String[] args) {
		new ContaJuridica();
	}
}
