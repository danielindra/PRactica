import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

/*
 * //CONSIGNA:
// Desarrollar un programa que genere N txts de salida conteniendo la siguiente información: 
// Un TXT que informe los ingredientes que son los siguientes:
    //Arroz bomba
	//1500 g
	//Pollo de corral 1
	//Conejo 0.5
	//Judía verde plana 500 g
	//Garrofó 500 g
	//Alcachofa (opcional) 500 g
	//Aceite de oliva virgen extra
	//Pimentón dulce
	//Tomate triturado
	//Azafrán
	//Romero fresco
	//Sal
	//Otro TXT que genere las instrucciones:
	// Dificultad: Media
	// Tiempo total 1 h 25 m
	// Elaboración 10 m
	// Cocción 1 h 15 m
	// Reposo 5 m
	// Estructura del programa:
	// Una clase de Ingredientes
	// Una clase de preparacion
	// Una interfaz que implemente el metodo abstracto generaSalida
	//Una vez generado el archivo txt subirlo a traves de la consola a nuestro repositorio remoto de GitHub 
	// Entregables:
	// Captura del CMD (consola)
	// LINK del Repositorio 
 * 
 */

interface generaSalida{
	public void generaSalidas(String datoEscribirIngredientes, String datoEscribirPreparacion);
}
public class comida implements generaSalida {
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		preparacion tiempos = new preparacion();
		ingredientes arroz = new ingredientes();
		ingredientes pollo = new ingredientes();
		ingredientes conejo = new ingredientes();
		ingredientes judia = new ingredientes();
		ingredientes garrofo = new ingredientes();
		ingredientes alcachofa = new ingredientes();
		ingredientes aceite = new ingredientes();
		ingredientes pimenton = new ingredientes();
		ingredientes tomate = new ingredientes();
		ingredientes asafran = new ingredientes();
		ingredientes romero = new ingredientes();
		ingredientes sal = new ingredientes();
		arroz.nombre = "Arroz bomba";
		arroz.cantidad= "1500 g";
		pollo.nombre = "Pollo de corral";
		pollo.cantidad= "1000 g";
		conejo.nombre = "conejo";
		conejo.cantidad = "500 g";
		judia.nombre = "verde plana";
		judia.cantidad = "500 g";
		garrofo.nombre = "Garrofó";
		garrofo.cantidad = "500 g";
		alcachofa.nombre = "Alcachofa";
		alcachofa.cantidad = "500 g";
		aceite.nombre = "Aceite de oliva virgen extra";
		aceite.cantidad = "100 g";
		pimenton.nombre = "Pimentón dulce";
		pimenton.cantidad = "50 g";
		tomate.nombre = "Tomate triturado";
		tomate.cantidad = "100 g";
		asafran.nombre = "Azafrán";
		asafran.cantidad = "1 g";
		romero.nombre = "Romero fresco";
		romero.cantidad = "10 g";
		sal.nombre = "sal";
		sal.cantidad = "10 g";
		tiempos.tiempoTotal = "1 h 25 m";
		tiempos.elaboracion = "10 m";
		tiempos.coccion = "1 h 15 m";
		tiempos.reposo = "5 m";

		String datoEscribirIngredientes = null;
		String datoEscribirPreparacion = null;
		datoEscribirIngredientes = "Los ingredientes son: \n" + arroz.nombre + " " + arroz.cantidad
															  + pollo.nombre + " " + pollo.cantidad
															  + conejo.nombre + " " + conejo.cantidad
															  + judia.nombre + " " + judia.cantidad
															  + garrofo.nombre + " " + garrofo.cantidad
															  + alcachofa.nombre + " " + alcachofa.cantidad
															  + aceite.nombre + " " + aceite.cantidad
															  + pimenton.nombre + " " + pimenton.cantidad
															  + tomate.nombre + " " + tomate.cantidad
															  + asafran.nombre + " " + asafran.cantidad
															  + romero.nombre + " " + romero.cantidad
															  + sal.nombre + " " + sal.cantidad;
		datoEscribirPreparacion = "Los tiempos son: \n" + "tiempo total: " + tiempos.tiempoTotal
														+ "\n Tiempos de elaboración: "+ tiempos.elaboracion
														+ "\n tiempo de cocción" + tiempos.coccion
														+ "\n tiempo de reposo" + tiempos.reposo; 

		
		
        generaSalidas(datoEscribirIngredientes, datoEscribirPreparacion);
       
        
	}
	
public void generaSalidas(String datoEscribirIngredientes, String datoEscribirPreparacion) {
	 	List<String> ing = Arrays.asList(datoEscribirIngredientes);
		List<String> prep = Arrays.asList(datoEscribirPreparacion);
		String nombreArchivo = "ingredientes.txt";
		String nombreArchivoPre = "Preparacion.txt";
		File archivoIng = new File(nombreArchivo);
		File archivoPre = new File(nombreArchivoPre);
		
		try {
         Files.write(archivoIng.toPath(), ing,StandardCharsets.UTF_8);
         Files.write(archivoPre.toPath(), ing,StandardCharsets.UTF_8);
         }
         catch(Exception e){}
		
		
	}


}

class ingredientes{
	String nombre;
	String cantidad;
}
class preparacion{
	String tiempoTotal;
	String elaboracion;
	String coccion;
	String reposo;
	
}


