package Hanoi;

public class Hanoi {

	public static void main(String[] args) {
		        // Definimos los discos
		        int nDisks = 5;
		        doTowers(nDisks, 'A', 'B', 'C');
		    }
		 
		    public static void doTowers(int topN, char from,
		    char inter, char to) {
		        if (topN == 1){
		            System.out.println("Disk 1 from " + from + " to " + to);
		        }else {
		            doTowers(topN - 1, from, to, inter);
		            System.out.println("Disco " + topN + " desde " + from + " hacia " + to);
		            // llamada recursiva
		            doTowers(topN - 1, inter, from, to);
		        }
		    }
		}