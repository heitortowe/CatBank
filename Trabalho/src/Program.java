import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		SistemBancario x = new SistemBancario();
		Scanner sc = new Scanner(System.in);
		
		int aux = 0;
		
		System.out.println("Cliente \n");
		System.out.print("Nome: ");
		x.setNome(sc.nextLine());
		System.out.print("Endereco: ");
		x.setEndereco(sc.nextLine());
		System.out.print("CPF: ");
		x.setCpf(sc.next());
		System.out.print("Profissao: ");
		x.setProfissao(sc.next());
		System.out.print("Renda: ");
		x.setRenda(sc.nextDouble());
		
		do {
			System.out.println("1. Abrir conta para pessoa física");
			System.out.println("2. Abrir conta kids");
			System.out.println("3. Abrir conta para pessoa jurídica");
			System.out.println("4. Sair");
			aux = sc.nextInt();
			if(aux == 1) {
				PessoaFisica fisica = new PessoaFisica();				
			}
			if(aux == 2) {
				ContaKids kids = new ContaKids();
			}
			if(aux == 3) {
				ContaJuridica juridica = new ContaJuridica();
			}
			if(aux == 4) {
				sc.close();
			}
		} while(aux !=4);
	}
}
