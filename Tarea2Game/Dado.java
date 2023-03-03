package Tarea2Game;

public class Dado {
	public int caras = 0;
	public int resultado = 0;
	
	public Dado(int pCaras) {
		this.caras = pCaras;
	}	
	
	public int lanzar() {
		int result = (int)(Math.random()*caras+1);
		this.resultado = result;
		return resultado;
	}
		
}

