import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.crypto.KEM.Encapsulator;

import models.Estudiante;

public class Comparators {
    
    private List<Estudiante>  estList;
    private Estudiante[] estArray;

    public Comparators() {

        
        Estudiante e1 = new Estudiante("Juan", 10);

        estArray = new Estudiante[]{e1,
        new Estudiante("Maria" , 7),
        new Estudiante("Diego" , 3.5),
          new Estudiante("Pedro", 7),
        new Estudiante("Pedro" , 6.8),
      

        };
        estList = new ArrayList<>(List.of(estArray));
        //Llamadas a los ejemplos 
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
    }

    private void print(List<Estudiante> list){
        for (Estudiante estudiante: list) {
            System.out.println(estudiante);
        }
    }
    // Comparator -> por VALOR
    // Lamba extractora directa: nota ascendente

    public void ejemplo1(){
        //copiar el arreglo global
        System.out.println("Ejemplo 1:");
        List<Estudiante> lista = new ArrayList<>(estList);
        // Comparator -> Obj != (Envolvente de primivo ni String)
        Comparator<Estudiante> comparador = Comparator.comparingDouble(x -> x.getNota()); 
        lista.sort(comparador);
        // imprimir 
        print(lista);

    }
    // Ordenar por Nota Ascendentemente
    // Comparator -> por VALOR
    // Utilizar la referencia

    public void ejemplo2() {

        System.out.println("Ejemplo2");
         //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(comparator);
        // imprimir
        print(lista);

    }
    public void ejemplo3() {
        System.out.println("Ejemplo 3 :");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota).reversed();
        lista.sort(comparator);
        // imprimir 
        print(lista);
    }
    public void ejemplo4() {
        System.out.println("Ejemplo 4 :");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante :: getName);
        lista.sort(comparator);
        // imprimir 
        print(lista);
    }
    // Ordenar por nota ascendente 
    // Comparator -> compara DOS ITEMS
    // Lamba
     public void ejemplo5() {
        System.out.println("Ejemplo 5:");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) ->
        Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        // imprimir 
        print(lista);
    }
     public void ejemplo6() {
        System.out.println("Ejemplo 6 :");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1 , e2) -> 
        e1.getName().compareTo(e2.getName());
        lista.sort(comparator);
        // imprimir 
        print(lista);
    }
    public void ejemplo7() {
        System.out.println("Ejemplo 7 :");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1 , e2) -> 
        Double.compare(e2.getNota(), e1.getNota());
        lista.sort(comparator);
        // imprimir 
        print(lista);

    }
    public void ejemplo8() {
        System.out.println("Ejemplo 8 :");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1 , e2) -> {
            
            int comp = Double.compare(e1.getNota(),e2.getNota());
            if(comp !=0 )
                return comp;
            return e2.getName().compareTo(e1.getName());
            };
            lista.sort(comparator);
        
            print(lista);
        
    }
     public void ejemplo9() {
        System.out.println("Ejemplo 9 :");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
        .comparingDouble(Estudiante :: getNota)
        .thenComparing(Estudiante::getName);
       
        lista.sort(comparator);
        print(lista);

    }
    //Ordenar por nota Descente y nombre Ascendente
    // Comparador -> por vALOR
    // 1 comparator lamba
    // 2 comparator referencia
     public void ejemplo10() {
        System.out.println("Ejemplo 10 :");
          //copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        //Comparator<Estudiante> comparator = Comparator
        // .comparingDouble(e -> e.getNota())
        // .reversed()
        // .thenComparing(Estudiante :: getName);
        // .thenComparing(Estudiante :: getNota);
       
       
       // lista.sort(comparator);
        print(lista);
    }
    // Ordenar por nota ajustada ASCENDENTE Y NOMBRE DESCENDENTE.
    //Sumar 2 puntos si la nota es menor que 7. 
    //
    //
    //
    public void Ejemplo11(){

    }
}
     
