package Caleb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Qué deseas ordenar?");
            System.out.println("[1] Arreglo de números");
            System.out.println("[2] Arreglo de una cadena");
            int opcion = sc.nextInt();
            switch (opcion)
            {

                case 1:
                    burbujadinamica();
                    break;
                case 2:
                    burbujadinamicacadena();
                    break;
                default:
                    System.out.println("Seleccione una opcion válida");
            }
    }

    private static void burbujadinamica()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa de que tamaño será tu arreglo");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int aux=0;
        for(int a=0; a<arr.length; a++)
        {
            System.out.println("Ingresa el valor "+ "[" +(a+1) + "] de tu arreglo");
            arr[a] = sc.nextInt();
        }
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0; i<arr.length; i++)
        {
            for(int y=i+1; y<arr.length;y++)
            {
                if(arr[y]<arr[i])
                {
                    aux=arr[i];
                    arr[i] = arr[y];
                    arr[y]=aux;
                }
            }

        }
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]);
            System.out.print("_");
        }
        System.out.println();
    }

    private static void burbujadinamicacadena()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu cadena sin espacios");
        String cadena = sc.next();
        String cadenamin = cadena.toLowerCase();
        char []convertir =cadenamin.toCharArray();
        int aux=0;
        for(int i=0; i< convertir.length; i++)
        {
            System.out.print(convertir[i]);
        }
        System.out.println();
        for(int i=0; i<convertir.length; i++)
        {
            for(int y=i+1; y<convertir.length;y++)
            {
                if(convertir[y] < convertir[i])
                {
                    aux=convertir[i];
                    convertir[i] = convertir[y];
                    convertir[y] = (char)aux;
                }
            }

        }
        String resultado= new String(convertir);
        System.out.println("Tu cadena ordenada alfabeticamente:" +resultado);
    }
}