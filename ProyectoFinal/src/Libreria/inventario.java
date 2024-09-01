package Libreria;

public class inventario extends CompraVenta{

	public inventario(int cantidad, String marca, String nombre, double precio, double total) {
		super(cantidad, marca, nombre, precio, total);
	}
	
	public void inventario1() {
		String[][] Producto = new String [2][2] ;
    	Producto [0][0] = "Equipamiento";
    	Producto [1][1] = "Utiles";
    	Producto [2][2] = "Papeles";
    	
    	String [][] Equipamiento = new String [6][6];
    	Equipamiento [0][0] = "Mochila";
    	Equipamiento [0][1] = "1200";
    	Equipamiento [1][0] = "Cartuchera";
    	Equipamiento [1][1] = "180";
    	Equipamiento [2][0] = "Pichinga";
    	Equipamiento [2][1] = "200";
    	
    	String [][]Utiles = new String [10][10];
    	Utiles [0][0] = "Lapices de colores";
    	Utiles [0][1] = "80";
    	Utiles [1][0] = "Borrador";
    	Utiles [1][1] = "5";
    	Utiles [2][0] = "Saca punta";
    	Utiles [2][1] = "7";
    	Utiles [2][2] = "Regla";
    	Utiles [3][0] = "12";
    	Utiles [3][1] = "Lapiz";
    	Utiles [3][3] = "6";
    	Utiles [4][0] = "Lapicero";
    	Utiles [4][1] = "8";
    	Utiles [4][4] = "Resaltador";
    	Utiles [5][0] = "60";
    	Utiles [5][1] = "Tijeras";
    	Utiles [5][5] = "30";
    	Utiles [6][0] = "Calculadora";
    	Utiles [6][1] = "Marcador";
    	Utiles [6][6] = "25";
    	
    	String [][] Papeles = new String [5][5];
    	Papeles [0][0] = "Cuaderno";
    	Papeles [0][1] = "28";
    	Papeles [1][0] = "Block";
    	Papeles [1][1] = "27";
    	Papeles [2][0]= "Papelografo";
    	Papeles [2][1] = "6";
    	Papeles [2][2] = "Papel crepe";
    	Papeles [3][0] = "7";
    	Papeles [3][1] = "Cartulina";
    	Papeles [3][3] = "9";
		
    	for(int i=0; i<Producto.length;i++) {
			 System.out.println( i+1+ ")" + Producto [i]); 
			 
			 for (int j = 0; j < Producto[i].length; j++) {
					
				  System.out.println (Equipamiento[i][j]);
				}
    	} 
   
        for (int i = 0; i < Equipamiento.length; i++) {
			
			for (int j = 0; j < Equipamiento[i].length; j++) {
			
				  System.out.println (Equipamiento[i][j]);
				}
			 }
			 
         for (int i = 0; i < Utiles.length; i++) {
			
			for (int j = 0; j < Utiles[i].length; j++) {
			
				  System.out.println (Utiles[i][j]);
			 }
			 
         }
         for (int i = 0; i < Papeles.length; i++) {
 			
 			for (int j = 0; j < Papeles[i].length; j++) {
 			
 				  System.out.println (Papeles[i][j]);
				 
			 }
    	
         }
	}
}
		
		