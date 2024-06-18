package javaTutorial;

public class BicycleDemo {

	public static void main(String[] args) {
		Bicycle bike1= new Bicycle();
		Bicycle bike2=new Bicycle();
		bike1.mudarVelocidadeMais(35);
		bike1.mudarMarcha(3);
		bike1.mudarCadencia(120);
		
		bike2.mudarVelocidadeMais(55);
		bike2.mudarMarcha(6);
		bike2.mudarCadencia(80);
		
		System.out.print("Bike 1 Status: ");bike1.mostraEstado();
		System.out.print("\nBike 2 Status: ");bike2.mostraEstado();

	}

}
