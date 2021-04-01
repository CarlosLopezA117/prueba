
package ejercicios_java;

import java.util.Arrays;

public class Ejercicios_Java {

    public static void main(String[] args) {
    int [] arregloAsc = {1,2,3,4,5,6};
    int [] arregloDesc = {6,5,4,3,2,1};
    int [] arregloIgual = {1,1,1};
    int [] arregloDesor = {1,2,1};
    
        /*System.out.println(describirArreglo(arregloAsc));       
        System.out.println(describirArreglo(arregloDesc));
        System.out.println(describirArreglo(arregloIgual));
        System.out.println(describirArreglo(arregloDesor));*/
        
        //Problema 2:
    int [] arregloP2 = {-10,1,2,3,-11,4,1,5,2,6,8,7,100};
        int [] arregloR =ArregloMayorMenor(arregloP2);
        for (int i = 0; i < arregloR.length; i++) {
            System.out.println(""+arregloR[i]);
        }
    }
    //Problema 1: Crear un metodo que identifique si un arreglo cualquiera esta en orden ascendente, descendente, tiene los mismo número o esta desordenado
    public static String describirArreglo(int[] arr) { //Metodo que describe el arreglo
        boolean desc = true, asc = true; //Variables de acenso y decenso declaradas
        for (int i = 1; i < arr.length && (desc || asc); i++) { //For que recorrera el arreglo empezando por la posicion 1, y se va a iterar si las variables son definidas
            if (arr[i - 1] < arr[i]) {
                desc = false; //Si i-1 es menor a i, entonces ya no puede ser descendente
            }
            if (arr[i - 1] > arr[i]) {
                asc = false; //si i-1 es mayor a i ya no puede ser ascendente
            }
        }
        if (asc || desc) {//Si asc o desc están en true, verificamos:
            if (asc && desc) { //si ambas estan en true entonces todos los núemros son iguales
                return "TODOS SON IGUALES";
            }
            return asc ? "ASCENDIENTE" : "DESCENDIENTE"; //si asc es true entonces es ascendiente, sino es descendiente
        }
        return "DESORDENADO"; //Si asc y desc estan en false, entonces retorna un desordenado
    }
    
    //Problema 2: Método que ordene un arreglo cualquiera de mayor a menor sin importar su tamaño
    public static int[] ArregloMayorMenor(int[] arr){
        int aux1= 0, aux2=0;
        boolean ordenado=false;
        do{
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]) {//Si la posición anterior es menor, entonces hacemos un cambio
                aux1=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=aux1;
                ordenado=false;
            }else{
                ordenado=true;
            }
        }
        }while(Aordenado(arr)==false);
        /*String res="";
        for (int i = 0; i < arr.length; i++) {
            res=res+arr[i];
        }*/
        return arr;
    }
    
    public static boolean Aordenado(int[] arr){
        boolean  ordenado=false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]) {
                ordenado=false;
                break;
            }else{
                ordenado=true;
            }
        }
        return ordenado;
    }
}
