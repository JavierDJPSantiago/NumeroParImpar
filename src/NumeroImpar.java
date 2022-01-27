/*Crear un nuevo proyecto llamado NumeroParImpar
crear el método main
crear una función que evalúe si un número es par o impar (se puede usar el operador ternario)
Imprimir en terminal el resultado

*extra, investigar cómo usar la clase Scanner en java.
https://ifgeekthen.nttdata.com/es/que-es-y-como-usar-la-clase-scanner-en-java#:~:text=Dentro%20del%20paquete%20java.,%2C%20double%2C%20string%20y%20etc.*/
import java.util.Scanner;//primero llamamos scanner
public class NumeroImpar {
	public static void main (String[] args) {
		
		/*
		 * int numero1;
		 * numero1 = 18;
		 * sin usar scanner
		 */
		
		
		//con scanner: scanner detiene todo, hasta que se cumpla la acción seguira 
		int numero1;
		Scanner usuario = new Scanner (System.in);//objeto consola creado
		System.out.println("Escribe un número: ")//un string para que el usuario sepa que hacer
		numero1 = usuario.nextInt();//el valor de numero sera el valor que de el usuario, este se giardo en el objeto creado
		
		
		//si el residuo del número dividido entre dos es diferente de 0
		if((numero1 % 2) != 0) {
			
			System.out.println("No es par");
			
			
		}else {
			System.out.println("Es par");
		}
	}
}
