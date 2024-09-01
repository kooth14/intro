package NetFlix;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NETFLIX {

	public static void main(String[] args) {
	    	Scanner leer=new Scanner(System.in);
	    	String [] series = new String [5];
			series[0] ="Drama";
			series[1] ="Romance";
			series[2] ="Accion";
			series[3] ="Terror";
			series[4] ="Animado";
		    String drama[] = new String [5];
		    drama [0]="Vincenzo";
		    drama[1]="Elite";
		    drama[2]="Vagabond";
		    drama[3]="Friends";
		    drama[4]="Stranger Things";
		    String romance [] = new String [5];
		    romance[0]="Heirs";
		    romance[1]="Un amor tan hermoso";
		    romance[2]="My secret Romance";
		    romance[3]="Recuestate sobre mi hombro";
		    romance[4]="Jardin de meteoros";
		    String accion[] = new String [5];
		    accion[0]="Rugal";
		    accion[1]="Penthouse";
		    accion[2]="Flash and Furious";
		    accion[3]="Maze Runner: la cura mortal"; 
		    accion[4]="SPLIT";
		    String terror [] = new String[5];
			terror[0]="Voices";
			terror[1]="THE WALKING DEAD";
			terror[2]="Eli";
			terror[3]="No Respires";
			terror[4]="En Hierba Alta";
			String animado [] = new String [5];
			animado [0] = "Raya";
			animado [1]="Minions";
			animado [2]="Hotel Transilvania";
			animado [3]="titanes del pacifico ";
			animado [4]="Demon slayer";
			
			System.out.println("---NETFLIX---");
			String perfil,usuario, correo, nombreyapellido;
			double contraseña;
			String perfil1 [] = new String[5];
			perfil1 [0]= "kim";
			perfil1 [1]="jeon";
			perfil1 [2]="min";
			perfil1 [3]="wang";
			perfil1 [4]="lee";
			System.out.println("Tiene una cuenta?");
			String opcion = "si";
		    while (opcion.equals("si")) {
		    	System.out.println("Ingrese su cuenta:  ");
		    	usuario = leer.nextLine();
		    	System.out.println("Ingrese su contraseña:  ");
		    	contraseña = leer.nextDouble();
		    	if (contraseña < 6) {
		            System.out.println("ERROR, debe ser mas de 6 caracteres. Otra vez.");
		            continue;
		          }

		          if (contraseña > 10) {
		            System.out.println("ERROR, debe ser menos de 10 caracteres. Otra vez.");
		            continue;
		          }

		          boolean tieneLetra = false;
		          boolean tieneNumero = false;
		          char ch = 0;
		          for(int i=0;i < contraseña;i++) {
		
		            if( Character.isDigit(ch)) {
		                tieneNumero = true;
		            }
		            else if (Character.isLetter(ch)) {
		                tieneLetra = true;
		            }
		          }
		          if (!tieneNumero || !tieneLetra) {
		            System.out.println("ERROR, debe tener al menos un numero y una letra. Ingrese otra ves su contreña.");
		            continue;
		          }
		          System.out.println("--Biernvenido--");
		          break;
		    
		    do {
		    	System.out.println("Registrarse");
		    	System.out.println("Ingrese su nombre y apellido: ");
		    	nombreyapellido = leer.nextLine();
		    	System.out.println("Ingrese su contraseña:  ");
		    	contraseña = leer.nextDouble();
		    	if (contraseña < 6) {
		            System.out.println("ERROR, debe ser mas de 6 caracteres. Otra vez.");
		            continue;
		          }

		          if (contraseña > 10) {
		            System.out.println("ERROR, debe ser menos de 10 caracteres. Otra vez.");
		            continue;
		          }

		          boolean tieneLetra2= false;
		          boolean tieneNumero2 = false;
		          char a = 0;
		          for(int i=0;i < contraseña;i++) {
		
		            if( Character.isDigit(a)) {
		                tieneNumero = true;
		            }
		            else if (Character.isLetter(a)) {
		                tieneLetra = true;
		            }
		          }
		          if (!tieneNumero || !tieneLetra) {
		            System.out.println("ERROR, debe tener al menos un numero y una letra. Ingrese otra ves su contreña.");
		            continue;
		          }
		          break;
		          System.out.println("--Biernvenido--");
		    } 
		    System.out.println("En cual perfil accedera?");
		    String perfil2 = leer.nextLine();
		   System.out.println("Que desea ver ahorita");
		  	System.out.println("Peliculas");
		  	System.out.println("Series");
		  	int opcion1 = leer.nextInt();
		  	int opcionvolver;
			int regresar;
			switch(opcion) {
		  	
			case 1:
		  	{
		  		System.out.println("------------------");
		  		 System.out.println("    PELICULAS ");
		  		 System.out.println("------------------");
		  		 System.out.println("Eliga que categoria desea ver");
		  		 int[] peliculas;
				for(int i=0; i<peliculas.length;i++) {
		  			 System.out.println( i+1 + peliculas[i]); 
		  		 }
		  		 int opcioncategoriapelicula = leer.nextInt();
		  		 switch(opcioncategoriapelicula) {
		  		 case 1: 
		  			 System.out.println("Ha escogido drama, estas son las peliculas/series que tenemos disponibles en este genero:");
		  			 for(int i = 0;i<drama.length;i++) {
		  				 
		  				 System.out.println(i+1 + drama[i]);
		  				 
		  			 }
		  			 System.out.println("Escoja una pelicula");
		  			 String pelicula = leer.next();
		  			 System.out.println("Reproduciendo");
		  			 	for(int i=0; i<10; i++) {	
		  			 	System.out.print("*");
		  			 	 esperar();
		  			 	
		  			 	
		  			 	}
		  			 	System.out.println("PELICULA FINALIZADA	");
		  			 	System.out.println("¿Desea ver otra?(1-si /2-no)");
		  			 	 opcionvolver = leer.nextInt();
		  			 	 if(opcionvolver==1){
		  			 		 regresar = 1 ;
		  			 	 }else {
		  			 		 regresar = 0;
		  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
		  			 	 }
		  			 break;
		    }
		  	 case  2:
	  			 System.out.println("Ha escogido romance, estas son las peliculas/series que tenemos en este genero");
	  				for(int i= 0; i<romance.length;i++) {
	  					System.out.println(i+1 +romance[i]);
	  				}
	  				System.out.println("Eliga la pelicula");
	  				 String peli1 = leer.next();
	  				 System.out.println("Reproduciendo");
	  				 	for(int i=0; i<10; i++) {
	  				 	System.out.print("*");
	  				 	 Esperar ();
	  				 	}
	  				 	System.out.println("PELICULA FINALIZADA	");
	  				 	System.out.println("¿Desea ver otra?(1-si /2-no)");
	  				 	 opcionvolver = leer.nextInt();
	  				 	 if(opcionvolver==1){
	  				 		 regresar = 1 ;
	  				 	 }else {
	  				 		 regresar = 0;
	  				 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
	  				 	 }
	  				break;
	}
			case 3:
				return;
	  			System.out.println("Eligio la categoria Accion esta son las series que tenemos en este genero");
	  			for(int j=0 ; j<accion.length;j++) {
	  				System.out.println(j+1 + accion[j] ); 
	  			}
	  			System.out.println("Eliga la serie");
	  			 String SERIE2 = leer.next();
	  			 System.out.println("Reproduciendo");
	  			 	for(int i=0; i<10; i++) {
	  			 	System.out.print("*");
	  			 	 Esperar ();
	  			 	}
	  			 	System.out.println("PELICULA FINALIZADA	");
	  			 	System.out.println("¿Desea ver otra?(1->si /2->no)");
	  			 	 opcionvolver = leer.nextInt();
	  			 	 if(opcionvolver==1){
	  			 		 regresar = 1 ;
	  			 	 }else {
	  			 		 regresar = 0;
	  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
	  			 	 }
	  			break;
}
		    case 4:
		    	return;
	  			System.out.println("Ha escogido Terror, esta son las series/peliculas que tenemos en este genero");
	  			for(int j=0 ; j<terror.length;j++) {
	  				System.out.println(j+1 + terror[j] ); 
	  			}
	  			System.out.println("Eliga la serie");
	  			 String SERIE3 = leer.next();
	  			 System.out.println("Reproduciendo");
	  			 	for(int i=0; i<10; i++) {
	  			 	System.out.print("*");
	  			 	 Esperar ();
	  			 	}
	  			 	System.out.println("PELICULA FINALIZADA	");
	  			 	System.out.println("¿Desea ver otra?(1-si /2-no)");
	  			 	 opcionvolver = leer.nextInt();
	  			 	 if(opcionvolver==1){
	  			 		 regresar = 1 ;
	  			 	 }else {
	  			 		 regresar = 0;
	  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
	  			 	 }
	  			break;
	  			
	  		case 5:
	  			System.out.println("Ha escogido Animado, esta son las series/peliculas que tenemos en este genero");
	  			for(int j=0 ; j<animado.length;j++) {
	  				System.out.println(j+1 + animado[j] ); 
	  			}
	  			System.out.println("Eliga la serie");
	  			 String series1 = leer.next();
	  			 System.out.println("Reproduciendo");
	  			 	for(int i=0; i<20; i++) {	
	  			 	System.out.print("*");
	  			 	 Esperar ();
	  			 	}
	  			 	System.out.println("PELICULA FINALIZADA	");
	  			 	System.out.println("¿Desea ver otra?(1-si /2-no)");
	  			 	 opcionvolver = leer.nextInt();
	  			 	 if(opcionvolver==1){
	  			 		 regresar = 1 ;
	  			 	 }else {
	  			 		 regresar = 0;
	  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
	  			 	 }
	  			break;
		    }
	  			}
}
