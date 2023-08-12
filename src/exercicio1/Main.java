package exercicio1;

public class Main {
	
	public static void main(String[] args) {
        PessoaFisica pessoa_1Fisica = new PessoaFisica("Bruno", "169999999999", "teste@teste", "teste 500", 100, "12345678900");

        PessoaJuridica pessoa_2Juridica = new PessoaJuridica("jao", "169999999999", "jao@gmail", "rua mariana j 123", 100, "04098234000178");

        pessoa_1Fisica.CalcularDesconto(0.1);
        pessoa_1Fisica.imprimir();
        System.out.println("------------------");
        pessoa_2Juridica.CalcularDesconto(0.2);
        pessoa_2Juridica.imprimir();
    }

}
