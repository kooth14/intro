package Juego_Geometrico;

import java.util.Scanner;

public class Cuerpo_Geometrico {

	private static final int Cuerpo_Geometrico = 0;
	static Scanner lector = new Scanner (System.in);
	private static final int Pi =(int) 3.1416;
	public static void main(String[] args) {
		String seguir = "si";
	    while  (seguir.equals("si")) {
	    	Figuras2 o=new Figuras2();
			
	    	System.out.println("----------------------FIGURAS--------------");
	    	System.out.println("1-Prisma");
	    	System.out.println("2-Cilindro");
	    	System.out.println("3-Piramide");
	    	System.out.println("4-Cono");
	    	System.out.println("5-Esfera");
	    	System.out.println("6-Tronco de cono");
	    	System.out.println("7-Tronco de piramide");
	    	System.out.println("8-Tetraedro");
	    	System.out.println("9-Hexaedro");
	    	System.out.println("10-Octaedro");
	    	System.out.println("11-Dodecaedro");
	    	System.out.println("12-Isosaedro");
	    	System.out.println("-------------------------------------------------------------------------------");
	    	System.out.println(">>>Escoja el numero de la figura con la quiere trabajar<<<");
	    	int opc = lector.nextInt();
	    	if(opc>12 || opc<=0) {
	    		do {
	    			System.out.println(">>>Por favor, escoja un valor correcto<<<");
	    			opc=lector.nextInt();
	    		}while(opc>12 || opc<=0);
	    	}
		switch (Cuerpo_Geometrico) {
		case 1:
			void prisma (double altura, double radio, double areaLateral,double  areaBase,double areaTotal, double volumen);
				System.out.println("***Prisma***");
				System.out.println("ingrese la altura: ");
				altura = lector.nextDouble();
				System.out.println("ingrese el radio: ");
				radio = lector.nextDouble();
				
				areaLateral = 2 * Math.PI * radio * altura;
				areaBase = Math.PI * radio * radio;
				areaTotal = areaLateral *2 *areaBase;
				volumen = areaBase * altura;
				
				System.out.println("El valor del area lateral es: " + areaLateral );
				System.out.println("El valor de area total es: " + areaTotal );
				System.out.println("El valor del volumen es: " + volumen );
				break;
		case 2:
			void cono (double altura1,double radio1, double generatriz, double pi, double area_lateral, double area_total, double volumen1);
			System.out.println("Calculo de areas y volumen de cono");
			System.out.print("Altura del cono: ");
			double altura1 = lector.nextDouble();
			
			System.out.print("Radio del cono(base): ");
			double radio1 = lector.nextDouble();
			double generatriz = Math.sqrt(radio1*radio1 + altura1*altura1);
			double pi = 3.141516;
			
			double area_lateral = (pi*radio1*generatriz);
			double area_total = (pi*radio1*(generatriz + radio1));
			double volumen1 = (pi*radio1*radio1*altura1)/3;
			
			System.out.println("Area lateral: " + area_lateral +  " " + "u²");
			System.out.println("Area total: " + area_total + " " + "u²");
			System.out.println("Volumen: " + volumen1 + " " + "u³");
			break;
		case 3:
			System.out.print("Arista del dodecaedro: ");
			double a = lector.nextDouble();
			
			double area = 3*a*a*6.88190960;
			double volumen11 = 7.663118960*a*a*a;
			
			System.out.println("Area: " + area + " " + "u²");
			System.out.println("Volumen: " + volumen11 + " " + "u³");
			break;
		case 4:
			System.out.print("Radio: ");
			double Radio = lector.nextDouble();
			double pi1 = 3.141516;
			
			double area1 = (4*pi1*Radio*Radio);
			double volumen111 = (4*pi1*Radio*Radio*Radio)/3;

			System.out.println("Area : " + area1 +  " " + "u²");
			System.out.println("Volumen: " + volumen111 + " " + "u³");
			
			System.out.println("Areas sencillas :");
			
			System.out.println("Areas especiales");
			System.out.println("Zona esferica");
			
			System.out.println("Casquete esferico");
			System.out.println("Recuerde que tiene ingresar una altura");
			System.out.println("menor a la del radio ");
			System.out.println("De lo contrario el dato resultante no tendra logica");
			
			System.out.print("Radio menor: ");
			double r = lector.nextDouble();
			System.out.print("Radio Mayor: ");
			double R = lector.nextDouble();
			System.out.print("Altura: ");
			double h = lector.nextDouble();
			
			double zona_esferica_area =  2*pi1*Radio*h;
			double zona_esferica_volumen = (pi1*h*(Math.pow(2, h) + 3*Math.pow(2, R) + 3*Math.pow(2, r)))/6;
			System.out.println("Area zona esferica: " + zona_esferica_area + " " + "u²");
			System.out.println("Volumen zona esferica: " + zona_esferica_volumen + " " + "u²");
			System.out.println("Casquete esferico");
			System.out.println("Recuerde que tiene ingresar una altura");
			System.out.println("menor a la del radio ");
			System.out.println("De lo contrario el dato resultante no tendra logica");

			
			System.out.print("Altura casquete esferico: ");
			double h2 = lector.nextDouble();
			double casquete_esferico_volumen = 3*pi1*(3*Radio - h2);
			double casquete_esferico_area = 2* Radio*h2;
			System.out.println("Area Casquete esferico: " + casquete_esferico_area + " " + "u²");
			System.out.println("Volumen Casquete esferico: " + casquete_esferico_volumen + " " + "u³");
			break;
		case 5:
			System.out.print("Arista del Hexaedro: ");
			double a1 = lector.nextDouble();
		
			double area_lateral1 = 6*a1*a1 - 2*a1*a1;
			double area_total1 = 6*a1*a1;
			double volumen2 = a1*a1*a1;
			
			System.out.println("Area lateral: " + area_lateral1 +  " " + "u²");
			System.out.println("Area total: " + area_total1 + " " + "u²");
			System.out.println("Volumen: " + volumen2 + " " + "u³");
			break;
		case 6:
			System.out.print("Arista del Hexaedro: ");
			double a11 = lector.nextDouble();
		
			double area_lateral11 = 6*a11*a11 - 2*a11*a11;
			double area_total11 = 6*a11*a11;
			double volumen3= a11*a11*a11;
			
			System.out.println("Area lateral: " + area_lateral11 +  " " + "u²");
			System.out.println("Area total: " + area_total11 + " " + "u²");
			System.out.println("Volumen: " + volumen3 + " " + "u³");
			break;
		case 7:
			System.out.print("Arista del icosaedro: ");
			double a3 = lector.nextDouble();
			
			double area2 = 8.660254037*a3*a3;
			double volumen4 = 2.18169499*a3*a3*a3;
			
			System.out.println("Area: " + area2 + " " + "u²");
			System.out.println("Volumen: " + volumen4 + " " + "u³");
			break;
		case 8:
			System.out.print("lado base del ortoedro: ");
			double a4 = lector.nextDouble();
			
			System.out.print("Ancho del ortoedro: ");
			double b = lector.nextDouble();
			
			System.out.print("altura del ortoedro: ");
			double c = lector.nextDouble();

			double area_total4 = 2*(a4*b + a4*c + b*c);
			double volumen5= a4*b*c;
			double D = Math.sqrt(a4*a4 + b*b + c*c);

			System.out.println("Area total: " + area_total4 + " " + "u²");
			System.out.println("Volumen: " + volumen5 + " " + "u³");
			System.out.println("Diagonal: " + D);
			break;
		case 9:
			System.out.print("Altura de piramide: ");
			double altura8 = lector.nextDouble();
			System.out.print("Lado de la piramide(base): ");
			double lado = lector.nextDouble();

			double radio8 = lado/2; 
			double Ap = Math.sqrt(altura8*altura8 + radio8*radio8);
			
			double area_lateral8 = (4*lado * Ap)/2;
			double area_total5 = (area_lateral8 + lado*lado);
			double volumen9 = (lado*lado*altura8)/3;
			
			System.out.println("Area lateral: " + area_lateral8 +  " " + "u²");
			System.out.println("Area total: " + area_total5 + " " + "u²");
			System.out.println("Volumen: " + volumen9 + " " + "u³");
			break;
		case 10:
			int numeroLado;
			double areaLateral9, altura9, areaBase1, longLados, alfa, perimetro;
			Scanner leer = new Scanner(System.in);
			
			System.out.println("ingrese el valor de la altura: ");
			altura9 = lector.nextDouble();
			System.out.println("ingrese la longitud de los lados: ");
			longLados = lector.nextDouble();
			System.out.println("ingrese el numero de lados: ");
			numeroLado = lector.nextInt();
			
			perimetro = numeroLado * longLados;
			areaLateral9 = perimetro * altura9;
			System.out.println("El perimetro es: " + perimetro);
			System.out.println("El area lateral del prsima es: " + areaLateral9);
			break;
		case 11:
			System.out.print("Arista del octaedro: ");
			double a9 = lector.nextDouble();
		
			double area7 = 2*a9*a9*1.73;
			double volumen7 = 0.866025*a9*a9*a9;
			
			System.out.println("Area : " + area7 + " " + "u²");
			System.out.println("Volumen: " + volumen7 + " " + "u³");
			break;
		case 12:
			System.out.print("Arista del tetraedro: ");
			double a12 = lector.nextDouble();
		
			double area_lateral12 = 3*((a12*Math.sqrt(a12*a12 - a12/2*a12/2))/2);
			double area_total12= 4*((a12*Math.sqrt(a12*a12 - a12/2*a12/2))/2);
			double volumen12 = (Math.sqrt(2)/12)*a12*a12*a12;
			
			System.out.println("Area lateral: " + area_lateral12 +  " " + "u²");
			System.out.println("Area total: " + area_total12 + " " + "u²");
			System.out.println("Volumen: " + volumen12 + " " + "u³");
			break;
		case 13:
			System.out.print("Altura del T_cono: ");
			double altura13 = lector.nextDouble();
			System.out.print("Radio menor del T_cono: ");
			double r1 = lector.nextDouble();
			System.out.print("Radio mayor T_cono: ");
			double R1 = lector.nextDouble();
		
			double generatriz1 = Math.sqrt(Math.pow(2, altura13) + Math.pow(2,(R1 - r1)));
			double pi2 = 3.141516;
			double Ab = pi2 * Math.pow(2,R1);
			double AB = pi2 * Math.pow(2,r1);
			
			double area_lateral13 = pi2*generatriz1*(R1 + r1);
			double area_total13 = area_lateral13 + Ab + AB;
			double volumen13 = (pi2*altura13*(Math.pow(2,R1) + Math.pow(2,r1) + R1*r1))/3;
			
			System.out.println("Area lateral: " + area_lateral13 +  " " + "u²");
			System.out.println("Area total: " + area_total13 + " " + "u²");
			System.out.println("Volumen: " + volumen13 + " " + "u³");
			break;
		case 14:
			System.out.print("Altura del T_piramide: ");
			double altura15 = lector.nextDouble();
			System.out.print("Lado base menor: ");
			double b1 = lector.nextDouble();
			System.out.print("Lado base mayor: ");
			double B = lector.nextDouble();
			
			double apotema = Math.sqrt(Math.pow(2, altura15) - Math.pow(2,B/2 - b1/2));
			double perimetro_b = b1*4;
			double perimetro_B = B*4;
			
			double area_lateral9 = ((perimetro_B + perimetro_b)/2)*apotema; 
			double area_total9 = (area_lateral9 + B*B + b1*b1);
			double volumen8 = ((altura15*(B*B + b1*b1 + Math.sqrt(B*B + b1*b1)))/3);
			
			System.out.println("Area lateral: " + area_lateral9 +  " " + "u²");
			System.out.println("Area total: " + area_total9 + " " + "u²");
			System.out.println("Volumen: " + volumen8 + " " + "u³");
			break;
			System.out.println("¿Quiere intentarlo de nuevo?");
		      seguir = lector.nextLine();
		    }
		    System.out.println("Take care, Thanks");
		    lector.close();
		}
		
			}

		}

	


