import java.util.Scanner;

/*
 * Acceder mediante el cmd (o su equivalente) del sistema al repositorio local de su proyecto y generar una nueva rama que se llame 
"DESARROLLO"
Luego, generar un programa sobre dicha rama desde el IDE y actualizarlo en el repositorio remoto (Github). 
El programa debe hacer lo siguiente:
Desarrollar un bot que te pregunte como te sentis el día de hoy, y en base a las siguientes posibilidades haga una accion
1. Triste -> Cuenta un chiste
2. Alegre -> "Enhorabuena"
3. Nervioso -> Mensaje de calma
TIP: A los chistes los pueden almacenar en un array y usar el metodo RANDOM para contar un chiste aleatorio. 
El programa tiene que tener un mensaje de bienvenida, donde te pregunte tu nombre previamente y te informe la fecha actual.
ENTREGABLES: 
Link del repositorio con el codigo almacenado. 
Captura del CMD mostrando la generacion de la rama. 
(!) EL CODIGO DEBE ESTAR ALMACENADO EN LA RAMA "DESARRROLLO (!)
 * 
 * */
public class Chistes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("¿Cómo te sientes?");
		String mensaje = s.nextLine();
		String triste = "triste";
		String nervioso = "nervioso";
		String alegre = "alegre";
		
		if(triste.equals(mensaje)) {
					System.out.println(" ¿Tienes WiFi?\r\n"
					+ "\r\n"
					+ "- Sí\r\n"
					+ "\r\n"
					+ "- ¿Y cuál es la clave?\r\n"
					+ "\r\n"
					+ "- Tener dinero y pagarlo.");

		}
		
		if(alegre.equals(mensaje)) {
			
			System.out.println("Enhorabuena");
		}
		if(nervioso.equals(mensaje)) {
			System.out.println("Calmate");
			
		}
		
		
	}

}
