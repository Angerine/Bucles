/*3.c.3. Hacer un programa que pida un número, y nos diga el primer número primo más grande que el
número introducido.*/
import java.util.*;
public class ej3c3 {	
	static int contador=2;
public static void main(String[] args) {
	Scanner respuesta= new Scanner(System.in);
	System.out.println("Introduce número");
		int num=respuesta.nextInt();
int i=num+1;
boolean primo=true;
do {
	 primo=esPrimo(i);
if(primo==true) {
	System.out.println(i);
	
}
else {
	i++;
}
}
while(primo==false);

}
public static boolean esPrimo(int num) {
	boolean esPrimo=true;
	while(esPrimo==true &&contador< num) {
	if(num%contador==0) {
		esPrimo=false;
	
	}
	else {
		esPrimo=true;
		contador++;
	}
		
	}
	return esPrimo;
	
	
}
}
