
/*3.c.4. Escribir un programa que encuentre el primer n�mero perfecto tras uno inicial indicado por teclado.
Un n�mero perfecto es un entero positivo que es igual a la suma de todos los enteros positivos (excluido
�l mismo) que son sus divisores. El primer n�mero perfecto es 6, ya que sus divisores son 1, 2, 3 y 1 + 2
+ 3 = 6.*/
import java.util.*;

public class Eje3c4 {
	static boolean perfect = true;
	
	static int num = 0;
	static int suma = 0;
	static Scanner respuesta = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero=preguntaNumero();
		int perfecto=esPerfecto(numero);
		
		System.out.println(num);

	}
		
	
	public static int preguntaNumero() {
		
		do {
			
			System.out.println("Introduce n�mero");
			num = respuesta.nextInt();
		
			if(num<1) {
				System.out.println("Tiene que ser mayor de 0");}
			}
	while(num<1);
	num=num+1;
	return num;
	}
	public static int esPerfecto(int numero) {
		do {
			suma=0;
				for (int i = 1; i < num; i++) {
					if (num % i == 0) {
						suma = suma + i;
					}
				}
				if (suma == num) {
					perfect = true;
				
				} else {
					num++;
					perfect = false;
				
				}

			} while (perfect == false);
		return num;
		}
		
	}

