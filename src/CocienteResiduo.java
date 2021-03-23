//hallar el cociente y el residuo de una division por restas sucesivas
import java.util.Scanner;
public class CocienteResiduo {
    public static void main (String args []){
        int a,b,res=0;

        Scanner read= new Scanner(System.in);
        do{
        System.out.println("ingrese un numero para el dividendo");
        a=read.nextInt();
        System.out.println("ingrese un numero para el divisor");
        b=read.nextInt();
        }while (a<=b && b != 0); //no detecta el 0 haciendo que no cumpla la decision ademas me gustaria que salte un mensaje que diga la razon por que la cual esta repetiendo
        
        while (a>=b){
            a=a-b;
            res=res+1;
        }
        System.out.println("El cociente es: "+res+ " el resto es: " +a);
        System.out.println("Si esta bien esto se verá");
    }
}
