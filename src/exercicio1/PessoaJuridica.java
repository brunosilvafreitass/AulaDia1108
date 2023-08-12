package exercicio1;

public class PessoaJuridica extends Pessoa{	

	private String cnpj;

	public PessoaJuridica(String nome, String telefone, String email, String endereco, double valordesconto,
			String cnpj) {
		super(nome, telefone, email, endereco, valordesconto);
		this.cnpj = cnpj;
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Cnpj: " + cnpj);
	}
}
