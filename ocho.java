/*Los empleados de una fabrica trabajan en dos turnos, Diurno y Nocturno. 
 * Se desea calcular el jornal diario de acuerdo a con las siguientes reglas:
La tarifa de las horas diurnas es de 10 €
La tarifa de las horas nocturnas es de 13,5 €
En caso de ser festivo, la tarifa se incrementa en un 10% en caso de turno diurno
 y en un 15% para el nocturno.
Escribe una función en pseudocódigo llamada jornal(…) que tome como parámetros 
 el nº de horas, el turno y el tipo de día (“Festivo”, “Laborable”) y nos devuelva
 el sueldo a cobrar. Escribe también un algoritmo principal que pida el nombre del
 trabajador, el día de la semana, turno y nº de horas trabajadas, nos escriba el 
 sueldo a cobrar usando la función anterior.
Ten en cuenta, que en la función nos pide el tipo de día pero en el algoritmo le
 pedimos al día es decir, que debemos saber si el dia que introduce el usuario es festivo o no.*/

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
