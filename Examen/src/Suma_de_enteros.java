import java.util.Scanner;
public class Suma_de_enteros {
      public static void main(String[] args) {
    	   Scanner escaner = new Scanner(System.in);
    	   int numero_entero1;
    	   int numero_entero2;
    	   int numero_entero3;
    	   int suma;
   
    System.out.println("Introducir primer numero");
     numero_entero1= escaner.nextInt();
    System.out.println("Introducir segundo numero");
     numero_entero2= escaner.nextInt();
    System.out.println("Introducir tercer numero");
     numero_entero3= escaner.nextInt();
     
     suma= numero_entero1 + numero_entero2 + numero_entero3;
     
     System.out.printf("El resulatdo es =" + suma);
    			   
    	   
      }
}
