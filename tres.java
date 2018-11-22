//Area de un circulo dado su radio.

import java.util.Scanner;
public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		float r;
		float area;
		System.out.println("ingrese radio del circulo");
		r=entrada.nextFloat();
		area=circulo(r);
		System.out.println("el area del circulo es: "+area);
		
		entrada.close();
	}
	
	public static float circulo(float x){
	float area;
	area=((float)Math.PI)*x*x;
	return area;
	}
}
