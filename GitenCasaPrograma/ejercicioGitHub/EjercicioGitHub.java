package ejercicioGitHub;

import java.util.Scanner;

public class EjercicioGitHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MANUEL JOSÉ RODRIGUEZ BORRERO
		
					double x1;
					double x2;
					double y1;
					double y2;
					
					
					Scanner sc= new Scanner (System.in);
					
					System.out.println("Define x1: ");
					x1= sc.nextDouble();
					
					System.out.println("Define x2: ");
					x2= sc.nextDouble();
					
					// AQUI ESTA EL ERROR QUE VAMOS CORREGIR Y A PASAR AL MASTER
					
					System.out.println("Define y1: ");
					y1= sc.nextDouble();
					
					System.out.println("Define y2: ");
					y2= sc.nextDouble();
					
					System.out.println("La distancia euclídea es: " + distancia( x1, x2, y1, y2));
					
					sc.close();
					
				}
				
				static double distancia (double x1, double x2, double y1, double y2) {
					
					double resultado;
					
					resultado =Math.sqrt(Math.pow((x1-x2), 2)+(Math.pow((y1-y2), 2)));
					
					return resultado;
					
		
		
	}

}
