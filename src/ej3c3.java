/*3.c.3. Hacer un programa que pida un n�mero, y nos diga el primer n�mero primo m�s grande que el
n�mero introducido.*/
import java.util.*;
public class ej3c3 {	
	static int contador=2;
public static void main(String[] args) {
	Scanner respuesta= new Scanner(System.in);
	System.out.println("Introduce n�mero");
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
