public class Insertion {
    
    public static void insertion(int[] a) {

        for(int i = 1; i < a.length; i++){
            int Key = a[i];
            int j = i - 1 ;
            while ( j>= 0 && a[j] > Key) {
                a[j+1] = a[j];
                j--;
                
            }
            a [j+1] = Key;
        }
        
    }
}
