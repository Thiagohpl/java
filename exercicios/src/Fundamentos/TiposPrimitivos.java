package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
	// Informações de Funcionarios
	
	// Tipos Numéricos inteiros
	int id = 56789;
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 542;
	long pontosAcumulados = 3_123_765_484L;
	
	// Tipos numéricos reais
	float salario = 11_445.44F;
	double vendasAcumuladas = 2_999_436_475.01;
	
	// Tipo booleano
	boolean estaDeFerias = true; // false
	
	// Tipo caractere
	char status = 'A'; // ativo
	
	//Dias de Empresa
	System.out.println(anosDeEmpresa * 365);
	
	// Numéros de viagem
	System.out.println(numeroDeVoos / 2);
	
	// Pontos por real
	System.out.println(pontosAcumulados / vendasAcumuladas);
		
	System.out.println(id + ": ganha -->" + salario);
	System.out.println("Ferias? " + estaDeFerias);
	System.out.println("Status?:" + status);	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
