
public class Bubble {
    
    public void sort(int[] arreglo){

        int [] original = {5, 6, 4, 1, 2, 3};
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < arreglo.length; i++) {
            //FOR j
            System.out.println( "Pasada:" + i);
            boolean combinaciones = false;
            for (int j = 1; j < arreglo.length -i; j++) {
                //COMPARACION
                comparaciones ++;
                if(arreglo[j-1] > arreglo[j]){
                    //INTERCAMBIO
                    cambios ++;
                    combinaciones = true;
                    int aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                    
                }
            }
            if(!combinaciones){
                break;
            }
            System.out.println("Cambios:" + cambios);
            System.out.println("Comparaciones:" + comparaciones);

        }
        System.out.println("Cambios:" + cambios);
        System.out.println("Comparaciones:" + comparaciones);

        return ;
    }
}