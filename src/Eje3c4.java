
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
			
			System.out.println("Introduce número");
			num = respuesta.nextInt();
		
			if(num<1) {
				System.out.println("Tiene que ser mayor de 0.");}
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

