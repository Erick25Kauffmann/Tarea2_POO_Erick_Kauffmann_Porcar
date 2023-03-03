package Tarea2Game;

public class Ficha {
	public int numFicha = 0;
	public int posicion = 0;
	public Dado dado;
	
	public Ficha(int pNumFicha) {
		this.numFicha = pNumFicha;
		this.posicion = 0;
		this.dado = new Dado(6);
	}
	
	public void avanzar() {
		int pasos = dado.lanzar();
		this.posicion = this.posicion + pasos;
		System.out.println("Jugador: " + numFicha);
		System.out.println("Dado: " + dado.resultado);
		System.out.println("Posicion: " + posicion);
		System.out.println("_____________________________");

	}

}

