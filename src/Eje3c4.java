/*3.c.4. Escribir un programa que encuentre el primer número perfecto tras uno inicial indicado por teclado.
Un número perfecto es un entero positivo que es igual a la suma de todos los enteros positivos (excluido
él mismo) que son sus divisores. El primer número perfecto es 6, ya que sus divisores son 1, 2, 3 y 1 + 2
+ 3 = 6.*/
import java.util.*;
public class Eje3c4 {
	static int contador=2;
	static int cuenta=1;
	static boolean perfect=false;

	static int num=0;
	static	int suma=0;
	static Scanner respuesta=new Scanner(System.in);
	
	public static void main(String[] args) {
	int numero=	pedirNumero();
int perfect=perfecto(numero);
System.out.println(perfect);

		
	
	

	}
	public static int perfecto(int recibido) {
	
		do {				
			recibido=recibido+1;
			 perfect= esPerfecto(recibido);}
			
		while(perfect==false);
		return recibido;
			
		
	}
	

public static int pedirNumero() {

	do {
		System.out.println("Introduce número");
		num=respuesta.nextInt();
		if(num<1) {
			System.out.println("Tiene que mayor a 0");
		}}
		while(num<1);
	return num;
			
}
public static boolean esPerfecto(int num) {
	 boolean perfecto=false;
for(int i=1;i<num;i++) {
if(num%i==0) {
	suma=suma+contador;
}}
if(suma==num) {
	perfecto=true;
}
return perfecto;

}}







	


