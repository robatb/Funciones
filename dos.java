//Termino n de la serie fibonacci.
/*Escribe una función en pseudocódigo que devuelva el término N 
 * (siendo N un número entero positivo) de la serie de Fibonacci, 
 * esta sigue la siguiente serie: 1, 1, 2, 3, 5, 8, 13, 21… y así 
 * sucesivamente. Date cuenta, que para obtener un numero, suma los
 *  dos números anteriores. Por ejemplo, si introducimos un 3, la función nos devuelve el 2.*/
import java.util.Scanner;
public class dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int n;
		int respuesta;
		System.out.println("ingrese un numero");
		n=entrada.nextInt();
		respuesta=fibonacci(n);
		System.out.println("el termino "+n+" de la serie fibonacci es "+respuesta);
		
		entrada.close();
	}
	
	public static int fibonacci (int x){
		int a=0;
		int b=1;
		int suma=0;
		if (x==1){
			suma=1;
		}
		else{
			for(int i=0;i<x-1;i++){
				suma=a+b;
				a=b;
				b=suma;
			}
		}
		
		return suma;
	}

}
