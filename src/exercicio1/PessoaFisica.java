package exercicio1;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	public PessoaFisica(String nome, String telefone, String email, String endereco, double valordesconto, String cpf) {
		super(nome, telefone, email, endereco, valordesconto);
		this.cpf = cpf;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Cpf: " + cpf);
	}
}

