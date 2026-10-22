import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        
        //runEjemplosPrimitivos();
        runEjemplosObjetos();
        runComparators();
        
    }
        
    private static void runComparators() {
       
        Integer[] original = { 5, 6, 4, 1, 2, 3,};
        Arrays.sort(original); // Ordena arreglos por su orden natural
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
            
        }
        System.out.println("--------------------------------------------------------");
        Arrays.sort(original,Comparator.reverseOrder());
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
    }

    private static void runEjemplosObjetos() {

        Estudiante e1 = new Estudiante("Juan", 10);

        Estudiante [] estudiantes = {e1,
            new Estudiante("Maria" , 7),
            new Estudiante("Diego" , 3.5),
            new Estudiante("Pedro" , 6.8),

        };

        Bubble bubble = new Bubble();
        printArregloEstudiantes(estudiantes);
        bubble.sortEstudiantes(estudiantes);
        

    }

    private static void runEjemplosPrimitivos() {
        
        int [] original = {5,6,1,2,3};
        int [] b = original.clone();
        int [] e = original.clone();
        int [] c = original.clone();
        // USAR EL MÉTODO DEL ARCHIVO(clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        Bubble buubble = new Bubble();
        // Selection selection = new Selection();
        // InsertionSort insertion = new InsertionSort();
    }

       // System.out.println("\nBubble sort\n");

    //     //EJECUTAR CODIGO DEL ARCHIVO 
    //     System.out.println("Original:");
    //     printArreglo(b);
    //     buubble.sort(b);
    //     System.out.println("Ordenado:");
    //     printArreglo(b);
    
    //     System.out.print("\n ----------------------------------------------------------------------------------------------------------------------------------------------------\n");
    //     System.out.println("\nSelection sort\n");
    //     System.out.println("Original:");
    //     printArreglo(e);
    //     selection.sort(e);
    //     System.out.println("Ordenado asc:");
    //     printArreglo(e);

    //     System.out.print("\n ----------------------------------------------------------------------------------------------------------------------------------------------------\n");
    //     System.out.print("\n-------Selection Insertion----------\n");
    //     System.out.println("Original:");
    //     printArreglo(c);
    //     insertion.sort(c);
    //     System.out.println("Ordenado Des:");
    //     printArreglo(c);
    // }
    public static void printArregloEstudiantes(Estudiante [] estudiantes){
        for(int i = 0; i < estudiantes.length; i++){
            System.out.println(estudiantes[i] );
        }
        System.out.println();
    }
}

