package Hanoi;

import java.util.Scanner;

public class Torres {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		 Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.println("Numero de discos: ");
	        n = sc.nextInt();
	        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
	        
	    }


	//M�todo Torres de Hanoi Recursivo
	public static void Hanoi(int n, int origen,  int auxiliar, int destino){
	  if(n==1)
	  System.out.println("mover disco de " + origen + " a " + destino);
	  else{
	     Hanoi(n-1, origen, destino, auxiliar);
	     System.out.println("mover disco de "+ origen + " a " + destino);
	     Hanoi(n-1, auxiliar, origen, destino);
	    
	   }
	  System.out.println("Numero de discos: ");
      Scanner sc = null;
	n = sc.nextInt();
	if(n==2)
		  System.out.println("mover disco de " + origen + " a " + destino);
		  else{
		     Hanoi(n-2, origen, destino, auxiliar);
		     System.out.println("mover disco de "+ origen + " a " + destino);
		     Hanoi(n-2, auxiliar, origen, destino);
		    
		   }
	 }
	
	}


