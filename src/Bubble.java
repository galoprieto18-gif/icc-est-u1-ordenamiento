public class Bubble {
    
        public int[] sort(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            //For j
            for(int j = i + 1; j < arreglo.length; j++){
            // COMPARACION if
            if(arreglo[j -1] > arreglo[j]){
                
                int aux = arreglo[j];
                arreglo[j-1] = arreglo[j];
                arreglo[j] = aux;

            }
            }
        }
    
        return null;
    }
}

