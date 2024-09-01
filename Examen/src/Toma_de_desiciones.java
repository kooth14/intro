import java.util.Scanner;
public class Toma_de_desiciones {
     public static void main(String[] args) {
    	 Scanner escaner = new Scanner(System.in);
    	 
    int numero1;
    int numero2;
   
        System.out.println("Introduce primer numero");
        numero1= escaner.nextInt();
        System.out.println("Introduce segundo numero");
        numero2= escaner.nextInt();
        
        if (numero1 == numero2);
         System.out.printf("%d == %d%n" , numero1, numero2);
         
        if (numero1 != numero2);
        System.out.printf("%d != %d%n",  numero1 , numero2);
        
        if (numero1 < numero2);
        System.out.printf("%d < %d%n", numero1, numero2);
        
        if (numero1 > numero2);
        System.out.printf("%d > %d%n", numero1, numero2);
        
        if (numero1 <= numero2);
        System.out.printf("%d <= %d%n", numero1, numero2);
        
        if (numero1 >= numero2);
        System.out.printf("%d >= %d%n", numero1, numero2);
        
        
     }
}
