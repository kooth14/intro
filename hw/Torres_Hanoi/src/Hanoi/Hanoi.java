package Hanoi;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		        // Definimos los discos
		        int nDisks = 64;
		        doTowers(nDisks, 'A', 'B', 'C');
		    }
		 
		    public static void doTowers(int topN, char from,
		    char inter, char to) {
		        if (topN == 1){
		        	String []Arreglo = new String [5000];
		        	
		        	Scanner leer=new Scanner(System.in);
		   		 Scanner sc = new Scanner(System.in);
		   	        int n;
		   	        System.out.println("Numero de discos: ");
		   	        n = sc.nextInt();
		   	        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
		   	        
		            System.out.println("Disk 1 from " + from + " to " + to);
		        }else {
		            doTowers(topN - 1, from, to, inter);
		            System.out.println("Disco " + topN + " desde " + from + " hacia " + to);
		            // llamada recursiva
		            doTowers(topN - 1, inter, from, to);
		        }
		    }

			private static void Hanoi(int n, int i, int j, int k) {
				// TODO Auto-generated method stub
				
			}
		}