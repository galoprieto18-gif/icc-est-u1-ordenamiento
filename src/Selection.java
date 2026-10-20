public class Selection {
    
    public void sort (int[] arreglo) {
        

        int comparaciones = 0;
        int cambios = 0;
            
        
        for(int i = 0; i < arreglo.length; i++){
            int min = i;
            int pasada = i;
           
            for(int j = i+1;j < arreglo.length; j++){
                if(arreglo[j]< arreglo[min]){
                    min = j;
                
            if (min !=i){
                int aux  = arreglo[min];
                arreglo[min] = arreglo[i];
                arreglo[i] = aux;
                cambios ++;
                System.out.println("Pasada= " + pasada + " | " +"Cambios:" + arreglo[j] +"<->" +arreglo[i]);

            }
                }
            System.out.println("Cambios:" + cambios);
            System.out.println("Comparaciones:" + comparaciones);
            
            }
        }
    }
}
