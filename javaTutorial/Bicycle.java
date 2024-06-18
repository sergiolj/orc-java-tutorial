package javaTutorial;
// Trabalhando com o conceito de objetos e Classes

class Bicycle{
	int cadence=0;
	int speed=0;
	int gear=1;
	
	public Bicycle (int startCadence, int startSpeed, int startGear) { // Método do tipo constructor possui o mesmo nome da classe
		gear = startGear;
		speed = startSpeed;
		cadence = startCadence;
	}
	
	public Bicycle() {//		//Posso ter mais de um construtor em uma classe e inclusive sem a necessidade de parâmatros
		gear = 1;
		speed = 10;
		cadence = 40;
	}

	Bicycle myBike=new Bicycle(30,0,6); //Cria um objeto chamado myBike com base no método construtor da classe
	Bicycle newBike=new Bicycle();
	
	void mudarCadencia( int novoValor) {
		cadence=novoValor;
	}
	void mudarMarcha(int novoValor) {
		gear=novoValor;
	}
	void mudarVelocidadeMais( int aumento) {
		speed+=aumento;
	}
	void mudarVelocidadeMenos( int diminui) {
		speed-=diminui;
	}
	void mostraEstado() {
		System.out.println("/ Cadencia: "+cadence+
				"/ Velocidade: "+speed+"/ Marcha: "+
				gear);
	}

}
