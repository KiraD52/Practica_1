package practica_1;
import java.util.*;

public class Practica_1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calculadora O1 = new Calculadora();
        int a,b;
        System.out.print("Introducir primer valor: ");
        a = leer.nextInt();
        System.out.print("\nIntroducir segundo valor: ");
        b = leer.nextInt();
        System.out.print("\n----------Menu----------\n1)Suman\n2)Resta\n3)Division\n4)Multiplicacion\nLa opcion es: ");
       int opc;
       opc = leer.nextInt();
       switch(opc){
           case 1: System.out.println("\nSuma: "+O1.Suma(b, b));
                    break;
           case 2: System.out.println("\nResta: "+O1.Resta(b, b));
                    break;
           case 3: System.out.println("\nDividir: "+O1.Dividir(b, b));
                    break;
           case 4: System.out.println("\nMultiplicar: "+O1.Multiplicar(b, b));
                    break;
           
       }
    }
    
}
