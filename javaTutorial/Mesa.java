package javaTutorial;

public class Mesa {
	int largura=150;
	int profundidade=80;
	int altura=70;
	String formato="retangular";
	String material="madeira";
	String cor="branco gelo";
	
	void mudaAltura(int novoValor) {
		altura = novoValor;
	}
	
	void mudaLargura(int novoValor) {
		largura=novoValor;
	}
	
	void mudaProfunudidade(int novoValor) {
		profundidade=novoValor;
	}
	
	void mudaCor(String novoValor) {
		cor = novoValor;
	}
	
	void mostraEstado() {
		System.out.println("Mesa "+formato+": "
				+largura+"x"+altura+": cor: "+cor);
	}

}
