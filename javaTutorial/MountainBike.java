package javaTutorial;

public class MountainBike extends Bicycle { //o comando extends faz com que todas as características
	// da classe Bicycle sejam herdadas pela classe MountainBike, sendo a classe Bicycle denominada
	// como superclass

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		mudarCadencia(90);
		mudarVelocidadeMais(45);
		mudarMarcha(5);
		mostraEstado();
	}

}
