public class InsertionSort {
    
    public void sort(int[] arreglo) {
         
        for(int i = 1; i < arreglo.length; i++){
            int aux = arreglo[i];
            int j = i - 1; 
            while (j >=0 && arreglo[j] < aux) {
                arreglo[j+1] = arreglo[j];
                j--;
            }
            arreglo[j+1] = aux;
        
            if( aux == 6){
                System.out.println("El aux= " + aux + " se inserta en pos " + (j+1));
                }
            if( aux == 2){
                System.out.println("El aux= " + aux + " se inserta en pos " + (j+1));
                }
            if( aux == 3){
                System.out.println("El aux= " + aux + " se inserta en pos " + (j+1));
            }
        }
    }
}




    
       



