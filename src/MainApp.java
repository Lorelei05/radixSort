

//Lorelei 
import java.util.Arrays;

public class MainApp {

    
    public static void main(String[] args) {
        System.out.println("O R D E N A M I  E N T O     R A D I X     S O R T");
            System.out.println("...............................................");
            System.out.println("");
        System.out.println("Los numeros a ordenar son los siguientes: 😉");
        int[] arr = { 11, 23, 65, 98, 102, 78, 36, 5 };
        System.out.println(Arrays.toString(arr));
        new RadixSort(arr).sort();
        System.out.println("");
        System.out.println("..................................");
        System.out.println("");
        System.out.println("Los numeros ordanados correctamente 😘");
        System.out.println(Arrays.toString(arr));

    }

}