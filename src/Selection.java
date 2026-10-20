public class Selection {
    
    public void sort (int[] arreglo) {
        
        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {

            int min = i;
            int pasada = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones ++;
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
            if(min != i){
                cambios ++;
                int aux = arreglo[min];
                arreglo[min] = arreglo[i];
                arreglo[i] = aux;
                System.out.println("Pasada= "+pasada+" | cambio "+arreglo[min]+"<->"+arreglo[i]);
            }
            
        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
    }
}
