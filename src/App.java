public class App {
    public static void main(String[] args) throws Exception {
        
        int [] original = {5 ,3 ,4, 1, 2 };
        int [] b = original.clone();
        int [] c = original;

        // USAR EL MÉTODO DEL ARCHIVO(clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        Bubble buubble = new Bubble();
        System.out.println(buubble);

        //EJECUTAR CODIGO DEL ARCHIVO 
        printArreglo(b);
        buubble.sort(b);
        printArreglo(b);
    }

    public static void printArreglo(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " - " );
            System.out.println();
        }
    }
}

