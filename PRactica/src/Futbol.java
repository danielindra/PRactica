import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


//Generar un programa que contenga 3 clases y 1 interfaz. 
//  Se dio inicio a La liga y la empresa que se encarga de la misma necesita contar con un programa que pueda informar las transferencias de jugadore a otros equipos. Para ello, cuentan
//  con un TXT que tiene la lista de equipos y sus respectivos jugadores. En este mercado de pases surgieron las siguientes modificaciones:
// David Villa del Barcelona al Real Madrid
// Leo Messi del Barcelona al Valencia
// Cristiano Ronaldo del Real Madrid al Betis
// Generar un TXT de salida que informe las modificaciones correspondientes y reemplazarlos en el archivo de salida. 
// El formato del TXT debera ser el siguiente:
// nombreEquipo1:
// nombreJugador1 
// nombreJugador2
// nombreJugador3
/*
 * Crear una clase que contenga atributos del jugador
 * Crear una clase que contenga atributos del equipo
 * Crear una clase que contenga atributos de main, donde se debe ejecutar el metodo abstracto heredado de la interfaz
 *  Crear una interfaz que contenga un metodo abstracto que se llame asignaJugador
 * ENTREGABLE:
 * TXT
 * El proyecto */

public abstract class Futbol implements AsignaJugador {
	public void AsignaJugador(Jugador jugador, Equipo equipoLlegada, Equipo equipoDestino) {
		jugador.equipo = equipoLlegada.nombre;
		Collections.replaceAll(equipoDestino.jugadores,jugador.nombre, " ");
		
		
	}

	public static void main(String[] args) {
		// Leer datos
		String nombreArchivo = "Plantilla.txt";
		String realMadrid = "REAL MADRID:";
		String barcelona = "BARCELONA:";
		String betis = "BETIS:";
		String valencia = "VALENCIA:";
		Jugador jug1 = new Jugador();
		Jugador jug2 = new Jugador();
		Jugador jug3 = new Jugador();
		Jugador jug4 = new Jugador();
		Jugador jug5 = new Jugador();
		Jugador jug6 = new Jugador();
		Jugador jug7 = new Jugador();
		Jugador jug8 = new Jugador();
		Jugador jug9 = new Jugador();
		Jugador jug10 = new Jugador();
		Jugador jug11 = new Jugador();
		Jugador jug12 = new Jugador();
		Jugador jug13 = new Jugador();
		Jugador jug14 = new Jugador();
		Jugador jug15 = new Jugador();
		Jugador jug16 = new Jugador();
		Jugador jug17 = new Jugador();
		Jugador jug18 = new Jugador();
		
		Equipo barcelonaE = new Equipo();
		Equipo realMadridE = new Equipo();
		Equipo betisE = new Equipo();
		Equipo valenciaE = new Equipo();
		
		barcelonaE.nombre = "Barcelona";
		realMadridE.nombre = "Real Madrid";
		betisE.nombre = "Betis";
		valenciaE.nombre = "Valencia";

		
		
		BufferedReader br = null;
		try {
			br = new BufferedReader (new FileReader (nombreArchivo));
			String texto = br.readLine();
			System.out.println(texto);
			if(barcelona.equals(texto)) {
				
					texto = br.readLine();
					jug1.nombre = texto;
					//System.out.println(texto);
					texto = br.readLine();
					jug2.nombre = texto;
					texto = br.readLine();
					jug3.nombre = texto;
					texto = br.readLine();
					jug4.nombre = texto;
					texto = br.readLine();
					jug5.nombre = texto;
					//System.out.println(texto);
					texto = br.readLine();
					

					jug1.equipo = "Barcelona";
					jug2.equipo = "Barcelona";
					jug3.equipo = "Barcelona";
					jug4.equipo = "Barcelona";
					jug5.equipo = "Barcelona";
					barcelonaE.jugadores.add("Barcelona1");
					barcelonaE.jugadores.add("Barcelona2");
					barcelonaE.jugadores.add("Barcelona3");
					barcelonaE.jugadores.remove("Barcelona2");
					System.out.println(barcelonaE.jugadores);
					//barcelonaE.jugadores = Arrays.asList(jug1.nombre, jug2.nombre, jug3.nombre, jug4.nombre, jug5.nombre);
			}
			
			texto = br.readLine();
			System.out.println(texto);
			if(realMadrid.equals(texto)) {
				
				texto = br.readLine();
				jug6.nombre = texto;
				//System.out.println(texto);
				texto = br.readLine();
				jug7.nombre = texto;
				texto = br.readLine();
				jug8.nombre = texto;
				texto = br.readLine();
				jug9.nombre = texto;
				texto = br.readLine();
				
				

				jug6.equipo = "Real Madrid";
				jug7.equipo = "Real Madrid";
				jug8.equipo = "Real Madrid";
				jug9.equipo = "Real Madrid";
				
				
				//realMadridE.jugadores = Arrays.asList(jug6.nombre, jug7.nombre, jug8.nombre, jug9.nombre);
		}
			texto = br.readLine();
			System.out.println(texto);
			if(betis.equals(texto)) {
				
				texto = br.readLine();
				jug10.nombre = texto;
				//System.out.println(texto);
				texto = br.readLine();
				jug11.nombre = texto;
				texto = br.readLine();
				jug12.nombre = texto;
				texto = br.readLine();
				jug13.nombre = texto;
				texto = br.readLine();
				jug14.nombre = texto;
				//System.out.println(texto);
				texto = br.readLine();
				
				

				jug10.equipo = "Betis";
				jug11.equipo = "Betis";
				jug12.equipo = "Betis";
				jug13.equipo = "Betis";
				jug14.equipo = "Betis";
				
				
				//betisE.jugadores = Arrays.asList(jug10.nombre, jug11.nombre, jug12.nombre, jug13.nombre, jug14.nombre);
		}
			texto = br.readLine();
			System.out.println(texto);
			if(valencia.equals(texto)) {
				
				texto = br.readLine();
				jug15.nombre = texto;
				//System.out.println(texto);
				texto = br.readLine();
				jug16.nombre = texto;
				texto = br.readLine();
				jug17.nombre = texto;
				texto = br.readLine();
				

				jug15.equipo = "Valencia";
				jug16.equipo = "Valencia";
				jug17.equipo = "Valencia";
				
				
				//valenciaE.jugadores = Arrays.asList(jug15.nombre, jug16.nombre, jug17.nombre);
		}
			
			//AsignaJugador();
			
		
		
		
			
			
			
		}catch(IOException e) {
			System.out.println("no se leyo nada");
		}
		
		
	}

	

}
