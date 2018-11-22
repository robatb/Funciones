//Escribe una función en pseudocódigo que devuelva el resultado de un número elevado a un exponente dado.
import java.util.Scanner;
public class uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int base;
		int exponente;
		int respuesta;
		System.out.println("ingrese base de la potencia");
		base=entrada.nextInt();
		System.out.println("ingrese exponente de la potencia");
		exponente=entrada.nextInt();
		respuesta=potenciaf(base,exponente);
		System.out.println("el valor de la potencia es: "+respuesta);
		entrada.close();
	}


	public static int potenciaf(int x,int y){
		int potencia=x;
		for(int i=0;i<y-1;i++){
			potencia=potencia*x;
		}
		return potencia;
	}
}
