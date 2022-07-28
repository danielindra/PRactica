import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/*
 * ////////////////////////////////////////////////////////
             EJERCICIO DE AUTOS
////////////////////////////////////////////////////////
En la ciudad de Buenos Aires suceden muchos accidentes de transito, se realizo un estudio indicando las marcas 
de autos mas propensas a participar de dichos accidentes,
 las cuales son las siguientes:
- Audi
- Alfa Romeo
- Ferrari
- Ford
Para cada una de estas marcas, se esta realizando un analisis que nos permita entender cuales son los modelos que mas participaron. 
Se nos pidio desarrollar un programa que almacene y muestre lo siguiente: 
- De cada marca de autos, informar los modelos que participaron de los siniestros
- Informar tambien la velocidad maxima de cada uno de los modelos
DESARROLLAR un txt que muestre, ordenado alfabeticamente, las marcas y sus respectivos modelos y sus velocidades maximas permitidas. 
Almacenarlo en el branch de Desarrollo. 
"Los modelos son los siguientes:"
..
.."Su velocidad permitida es la siguiente:"
..
..
 */
public class Coches {
    public static void main(String args[]){
    	InfoCoches ch1 = new InfoCoches();
    	InfoCoches ch2 = new InfoCoches();
    	InfoCoches ch3 = new InfoCoches();
    	InfoCoches ch4 = new InfoCoches();
    	InfoCoches ch5 = new InfoCoches();
    	InfoCoches ch6 = new InfoCoches();
    	InfoCoches ch7 = new InfoCoches();
    	InfoCoches ch8 = new InfoCoches();
    	InfoCoches ch9 = new InfoCoches();
    	InfoCoches ch10 = new InfoCoches();
    	String nombreArchivo = "coches1.txt";
        ch1.marca = "Audi";
        ch2.marca = "Audi";
        ch3.marca = "Audi";
        ch4.marca = "Audi";
        ch5.marca = "Audi";
        ch6.marca = "Alfa Romeo";
        ch7.marca = "Alfa Romeo";
        ch8.marca = "Alfa Romeo";
        ch9.marca = "Ferrari";
        ch10.marca = "Ford";
        
        ch1.modelo = "A1";
        ch2.modelo = "A2";
        ch3.modelo = "A3";
        ch4.modelo = "A5";
        ch5.modelo = "A8";
        ch6.modelo = "AA";
        ch7.modelo = "BB";
        ch8.modelo = "CC";
        ch9.modelo = "Roja";
        ch10.modelo = "Mustang";
        
        ch1.velocidadMax = "270";
        ch2.velocidadMax = "280";
        ch3.velocidadMax = "290";
        ch4.velocidadMax = "300";
        ch5.velocidadMax = "310";
        ch6.velocidadMax = "300";
        ch7.velocidadMax = "310";
        ch8.velocidadMax = "300";
        ch9.velocidadMax = "450";
        ch10.velocidadMax = "330";
        
        ArrayList<String> coches = new ArrayList<String>();
        TreeSet <String> organizado = new TreeSet <String>();

        coches.add(ch1.marca);
        organizado.add(ch1.marca);
        coches.add(ch2.marca);
        organizado.add(ch2.marca);
        coches.add(ch3.marca);
        organizado.add(ch3.marca);
        coches.add(ch4.marca);
        organizado.add(ch4.marca);
        coches.add(ch5.marca);
        organizado.add(ch5.marca);
        coches.add(ch6.marca);
        organizado.add(ch6.marca);
        coches.add(ch7.marca);
        organizado.add(ch7.marca);
        coches.add(ch8.marca);
        organizado.add(ch8.marca);
        coches.add(ch9.marca);
        organizado.add(ch9.marca);
        coches.add(ch10.marca);
        organizado.add(ch10.marca);
        
        ArrayList<String> modelo = new ArrayList<String>();
        ArrayList<String> velocidadMax = new ArrayList<String>();
        
        modelo.add(ch1.modelo);
        velocidadMax.add(ch1.velocidadMax);
        modelo.add(ch2.modelo);
        velocidadMax.add(ch2.velocidadMax);
        modelo.add(ch3.modelo);
        velocidadMax.add(ch3.velocidadMax);
        modelo.add(ch4.modelo);
        velocidadMax.add(ch4.velocidadMax);
        modelo.add(ch5.modelo);
        velocidadMax.add(ch5.velocidadMax);
        modelo.add(ch6.modelo);
        velocidadMax.add(ch6.velocidadMax);
        modelo.add(ch7.modelo);
        velocidadMax.add(ch7.velocidadMax);
        modelo.add(ch8.modelo);
        velocidadMax.add(ch8.velocidadMax);
        modelo.add(ch9.modelo);
        velocidadMax.add(ch9.velocidadMax);
        modelo.add(ch10.modelo);
        velocidadMax.add(ch10.velocidadMax);
        
        ArrayList<String> coche = new ArrayList<String>();
        ArrayList<String> modeloCoche = new ArrayList<String>();
        ArrayList<String> velocidadCoche = new ArrayList<String>();
        coche.add(ch1.marca);
        coche.add(ch2.marca);
        coche.add(ch3.marca);
        coche.add(ch4.marca);
        coche.add(ch5.marca);
        coche.add(ch6.marca);
        coche.add(ch7.marca);
        coche.add(ch8.marca);
        coche.add(ch9.marca);
        coche.add(ch10.marca);
        
        modeloCoche.add(ch1.modelo);
        modeloCoche.add(ch2.modelo);
        modeloCoche.add(ch3.modelo);
        modeloCoche.add(ch4.modelo);
        modeloCoche.add(ch5.modelo);
        modeloCoche.add(ch6.modelo);
        modeloCoche.add(ch7.modelo);
        modeloCoche.add(ch8.modelo);
        modeloCoche.add(ch9.modelo);
        modeloCoche.add(ch10.modelo);
        
        velocidadCoche.add(ch1.velocidadMax);
        velocidadCoche.add(ch2.velocidadMax);
        velocidadCoche.add(ch3.velocidadMax);
        velocidadCoche.add(ch4.velocidadMax);
        velocidadCoche.add(ch5.velocidadMax);
        velocidadCoche.add(ch6.velocidadMax);
        velocidadCoche.add(ch7.velocidadMax);
        velocidadCoche.add(ch8.velocidadMax);
        velocidadCoche.add(ch9.velocidadMax);
        velocidadCoche.add(ch10.velocidadMax);
        
        Iterator<String> it = organizado.iterator();
        String datoEscribir = null;
        	
        while(it.hasNext()) {
        	String dato =it.next();
        	for(int i=0; i<9; i++) {
            	if(dato.equals(coche.get(i))) {
            		System.out.println("El coche es: " + coche.get(i) + " El modelo: " + modelo.get(i) + " La velocidad máxima: " + velocidadMax.get(i) + "\n");
            	}
            datoEscribir = datoEscribir + dato;
            File archivo = new File(nombreArchivo);
            List<String> line = Arrays.asList(datoEscribir);
            try {
            Files.write(archivo.toPath(), line,StandardCharsets.UTF_8);
            }
            catch(Exception e){}
        }
    }
}
}

class InfoCoches{
	String marca;
	String modelo;
	String velocidadMax;
}
