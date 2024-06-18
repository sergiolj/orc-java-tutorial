package javaTutorial;

public class CaloiBicycle implements BicycleNew{
	int cadencia=0;
	int velocidade=0;
	int marcha=1;

	@Override
	public void mudarCadencia(int novoValor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarMarcha(int novoValor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarVelocidadeMais(int novoValor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarVelocidadeMenos(int novoValor) {
		// TODO Auto-generated method stub
		
	}
	void mostraEstado() {
		System.out.println("/ Cadencia: "+cadencia+
				"/ Velocidade: "+velocidade+"/ Marcha: "+
				marcha);
	}

}
