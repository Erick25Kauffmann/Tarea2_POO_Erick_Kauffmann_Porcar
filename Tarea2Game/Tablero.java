package Tarea2Game;

import java.util.ArrayList;

public class Tablero {
	public int casillas = 0;
	public ArrayList<Ficha> jugadores = new ArrayList<Ficha>();
	public Ficha ganador = null;
	
	public Tablero(int pCasillas, int pJugadores) {
		this.casillas = pCasillas;
		for(int cont1=1; cont1<pJugadores+1; cont1++) {
			Ficha jugador = new Ficha(cont1);
			jugadores.add(jugador);
		}
	}
	
	public void Jugar() {
		boolean play = true;
		while(play) {
			for(int cont2=0; cont2<jugadores.size(); cont2++) {
				Ficha jugadorAct = jugadores.get(cont2);
				if(jugadorAct.posicion<this.casillas) {
					jugadorAct.avanzar();
					if(jugadorAct.posicion>=this.casillas) {
						setGanador(jugadorAct);
						play = false;
						break;
					}
				}
			}
		}
		System.out.println("*******************************");
		System.out.println("GANADOR: ");
		System.out.println("Jugador: " + this.ganador.numFicha);
		System.out.println("*******************************");
	}
	
	public void setGanador(Ficha pJugador) {
		this.ganador = pJugador;
	}


}
