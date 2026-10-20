public class App {
    public static void main(String[] args) throws Exception {
        
        int [] original = {5, 6, 4, 1, 2, 3};
        int [] b = original.clone();
        int [] c = original.clone();
        


        // USAR EL MÉTODO DEL ARCHIVO(clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        Bubble buubble = new Bubble();
        Selection selection = new Selection();

        System.out.println(buubble);

        System.out.println(selection);

        //EJECUTAR CODIGO DEL ARCHIVO 
        printArreglo(b);
        buubble.sort(b);
        printArreglo(b);
    
        System.out.println(" ----SELECTION SORT-----");
        
        System.out.println("Arreglo original:");
        printArreglo(c);
        selection.sort(c);
        System.out.println("Arreglo ordenado:");
        printArreglo(c);
        
    }

    public static void printArreglo(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " - " );
        }
        System.out.println();
    }
}

