public class App {
    public static void main(String[] args) throws Exception {
        
        int [] original = {5, 6, 4, 1, 2, 3};
        int [] b = original.clone();
        int [] c = original;
        int [] e = original.clone();
        int [] d = original.clone();

        


        // USAR EL MÉTODO DEL ARCHIVO(clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        Bubble buubble = new Bubble();
        Selection selection = new Selection();
        Insertion insertion = new Insertion();

        System.out.println("\nBubble sort\n");

        //EJECUTAR CODIGO DEL ARCHIVO 
        System.out.println("Original:");
        printArreglo(b);
        buubble.sort(b);
        System.out.println("Ordenado:");
        printArreglo(b);
    
        System.out.print("\n ----------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\nSelection sort\n");
        System.out.println("Original:");
        printArreglo(e);
        selection.sort(e);
        System.out.println("Ordenado asc:");
        printArreglo(e);

        System.out.print("\n ----------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\n-------Selection Insertion----------\n");
        System.out.println("Original:");
        printArreglo(d);
        insertion.sort(d);
        System.out.println("Ordenado Des:");
        printArreglo(d);
    
    }
    public static void printArreglo(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " - " );
        }
        System.out.println();
    }
}

