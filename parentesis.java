
package parentesis;
import java.util.Scanner;
import java.util.Stack;
public class parentesis {

    
    public static void main(String args[]) {
        System.out.println("Ingrese la cadena deseada: ");
        Scanner x=new Scanner(System.in);
        String entrada=x.next();
        Stack <Character>p=new <Character>Stack();
        int i=0;
        int tam=entrada.length();
        while (i<tam){
            if(entrada.charAt(i)=='(') { 
                p.push('(');
            } else {
                if(p.isEmpty()) {
                    break;
                } else {
                    p.pop();
                }
            }
            
            i++;
        }
        
        if(p.isEmpty() & i==tam) { 
            System.out.print("La cadena es valida");
        } else {
            System.out.print("La cadena no es valida");
        }
        
    }
    
}
