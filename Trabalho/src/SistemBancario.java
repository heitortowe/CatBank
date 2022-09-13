
public class SistemBancario {
	private String nome;
	private String endereco;
	private String cpf;
	private String profissao;
	private double renda;
	private int numero;
	private int agencia;
	private double saldo;
	private String cnpj;
	
	public SistemBancario() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.saldo = renda;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void Depositar(double valor) {
			this.saldo += valor;
			System.out.println("Deposito concluido!! \n Você depositou R$" + valor);
	}
		
	public void transferir(double valor) {
		if(valor > this.saldo ) {
			System.out.println("Não foi possivel transferir!! \n Quantia acima do dinheiro na sua conta");
		} else {
			saldo -= valor;
			System.out.println("Transferência concluida!! \n Você transferiu R$" + valor);
		}
		
	}
	

	
	
	
	
}
