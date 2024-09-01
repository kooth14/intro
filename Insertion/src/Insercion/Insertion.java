package Insercion;

public class Insertion {

	public static void ordenamientoInsertion(int A[], int n) {
		for (int i = 1; i < n; i ++) {
			int valorc = A[1];
			int posicion = i;
			while ((posicion > 0) && (A[posicion - 1]> valorc)){
				A[posicion] = A[posicion -1];
				posicion = posicion - 1;
			}
			A[posicion]= valorc;
	}

}
	public void mostrarArreglo(int A[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
	}
		System.out.println();
}
	public static void main(String[] args) {
		Insertion obj = new Insertion();
		
		int A[] = {3, 5, 8, 9, 5, 2};
		
		System.out.println("Arreglo original:  ");
		
		obj.mostrarArreglo(A, A.length);
		
		obj.ordenamientoInsertion(A,A.length);
		
		System.out.println("Arreglo ordenado:  ");
		
		obj.mostrarArreglo(A,A.length);
	}
	
}