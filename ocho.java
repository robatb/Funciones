/*Los empleados de una fabrica trabajan en dos turnos, Diurno y Nocturno. 
 * Se desea calcular el jornal diario de acuerdo a con las siguientes reglas:
La tarifa de las horas diurnas es de 10 �
La tarifa de las horas nocturnas es de 13,5 �
En caso de ser festivo, la tarifa se incrementa en un 10% en caso de turno diurno
 y en un 15% para el nocturno.
Escribe una funci�n en pseudoc�digo llamada jornal(�) que tome como par�metros 
 el n� de horas, el turno y el tipo de d�a (�Festivo�, �Laborable�) y nos devuelva
 el sueldo a cobrar. Escribe tambi�n un algoritmo principal que pida el nombre del
 trabajador, el d�a de la semana, turno y n� de horas trabajadas, nos escriba el 
 sueldo a cobrar usando la funci�n anterior.
Ten en cuenta, que en la funci�n nos pide el tipo de d�a pero en el algoritmo le
 pedimos al d�a es decir, que debemos saber si el dia que introduce el usuario es festivo o no.*/

import java.util.Scanner;
public class ocho {
	public static void main(String[]args){
		double respuesta;
		String nombre;
		String turno;
		String dia;
		String tdia;
		int horas;
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrese nombre");
		nombre=entrada.nextLine();
		System.out.println("ingrese turno (diurno/nocturno)");
		turno=entrada.nextLine();
		System.out.println("ingrese dia de la semana(lunes-domingo)");
		dia=entrada.nextLine();
		System.out.println("ingrese numero de horas trabajadas");
		horas=entrada.nextInt();
		if(!dia.equals("domingo")){
			tdia="laborable";
		}
		else{
			tdia="festivo";
		}
		respuesta=jornal(horas,turno,tdia);
		System.out.println("El sueldo de "+nombre+" es "+respuesta);
		
		entrada.close();
	
	}
	public static double jornal(int horas,String turno,String tdia){
		double sueldo=0;
		if(turno.equals("diurno")){
			if(tdia.equals("festivo")){
				sueldo=(horas*10*1.1);
			}
			else{
				sueldo=(horas*10);
			}
		}
		if(turno.equals("nocturno")){
			if(tdia.equals("festivo")){
				sueldo=(horas*13.5*1.15);
			}
			else{
				sueldo=(horas*13.5);
			}
		}
		return sueldo;
	}
}
