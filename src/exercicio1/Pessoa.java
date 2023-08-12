package exercicio1;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private double valordesconto;
	
	public Pessoa(String nome, String telefone, String email, String endereco, double valordesconto) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.valordesconto = valordesconto;
	}
	
	public void CalcularDesconto(double percetualdesconto ) {
		this.valordesconto = percetualdesconto * valordesconto;		
	}
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor desconto: " + this.valordesconto);
	}

}
