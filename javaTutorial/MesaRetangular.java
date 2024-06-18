package javaTutorial;

public interface MesaRetangular{
	static final int  VARIAVEL_CLASS=4; //(Static Fields)// Indica que a variável não pode ter seu valor alterado
		//Esse valor é único para cada instância, é chamado de Variável de Classe
	//Por convencao variaveis estáticas são escritas em maiusculas e separadas por undeline
	
	int variavelInstancia=2; //(Non-Static Fields); // Uma variavel não estática é uma Variável de instância, ou seja seu valor pode variar
	// de em objetos da mesma classe
	void mudaAltura(int novoValor);
	void mudaLargura(int novoValor);
	void mudaProfunudidade(int novoValor);
	void mudaCor(String novoValor);
	void mostraEstado();
	//numeroPernas=3; //não consegue alterar a variável
	static void metodoExemplo(int variavelInstancia) {
		int variavelLocal=1; // Variaveis locais sao criadas dentro de métodos
		System.out.println(variavelLocal);
	}
	byte v1=100; // -128 a 127
	short v2=10000; //-32768 a 32767
	int v3=100000; //-2^31 a (2^31)-1
	long v4=0L; //-2^63 a (2^63)-1
	float v5=0.0f; // single-precision 32-bit IEEE 754 floating point
	double v6=0.0d; // double-precision 64-bit IEEE 754 floating point
	char alpha='a'; // single 16-bit Unicode character
	boolean teste=true;
	long cpf=123_234_443_71L;
	long cartaoCredito=1232_3434_2323_8787L;
	
	int [] vetor= {100,200,
			300,400,500,600,
			700,800,900,1000};
	int [] vetorto=new int[10];
	System.arraycopy(vetor,0,vetorto,0,9);
	
}
	
