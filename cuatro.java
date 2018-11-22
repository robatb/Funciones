//Calculo de factoriales entre 2 numeros.
/* Escribe una funci�n en pseudoc�digo que devuelva el factorial
 *  de un n�mero N (siendo N un n�mero entero positivo). Haz despu�s
 *   un algoritmo principal que pida por teclado dos n�meros y escriba
 *    en pantalla los factoriales de cada n�mero comprendido entre los
 *     dos anteriores. El factorial de 5 es el resultado de 5*4*3*2*1*/

import java.util.Scanner;
public class cuatro {
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		int ter;
		int respuesta;
		int a;
		int b;
		System.out.println("ingrese primer numero");
		a=entrada.nextInt();
		System.out.println("ingrese segundo numero");
		b=entrada.nextInt();
		if(a>b){
			for(int i=0;i<a;i++){
				ter=b+i;
				respuesta=factorial(ter);
				System.out.println("El factorial de "+ter+" es "+respuesta);
			}
		}
		if(b>a){
			for(int i=0;i<b;i++){
				ter=a+i;
				respuesta=factorial(ter);
				System.out.println("El factorial de "+ter+" es "+respuesta);
			}
		}
		entrada.close();
	}
	
	public static int factorial(int valor){
		int f=1;
		int i=0;
		while(i<valor){
			f=f*(valor-i);
			i=i+1;
		}
		return f;
	}
}
