
/*3.c.4. Escribir un programa que encuentre el primer número perfecto tras uno inicial indicado por teclado.
Un número perfecto es un entero positivo que es igual a la suma de todos los enteros positivos (excluido
él mismo) que son sus divisores. El primer número perfecto es 6, ya que sus divisores son 1, 2, 3 y 1 + 2
+ 3 = 6.*/
import java.util.*;

public class Eje3c4 {

	public static void main(String[] args) {
		
		boolean perfect = true;
		
		int num = 0;
		int suma = 0;
		Scanner respuesta = new Scanner(System.in);
do {
	
		System.out.println("Introduce número");
		num = respuesta.nextInt();
	
		if(num<1) {
			System.out.println("Tiene que ser mayor de 0");}
		}
while(num<1);
num=num+1;

		do {
		suma=0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					suma = suma + i;
				}
			}
			if (suma == num) {
				perfect = true;
				System.out.println(num);
			} else {
				num++;
				perfect = false;
			
			}

		} while (perfect == false);
	}
}
