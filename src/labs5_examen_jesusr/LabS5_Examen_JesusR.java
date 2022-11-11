package labs5_examen_jesusr;

import java.util.Scanner;
import java.util.Random;

public class LabS5_Examen_JesusR {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        do {
            System.out.println("Opcion 1: Primos");
            System.out.println("Opcion 2: Contorno");
            System.out.println("Opcion 3: Vecinos");
            System.out.println("Opcion 0: Salida");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    int N;
                    System.out.println("Ingrese un numero: ");
                    N = leer.nextInt();
                    if (N >= 1) {
                        primos(N);
                    } else {
                        System.out.println("Debe ser un numero mayor o igual a 1");
                    }
                    System.out.println("los numeros primos de " + N + " son: " + primos(N));

                    break;

                case 2:
                    int tamano;
                    System.out.println("Ingrese un tamano: ");
                    tamano = leer.nextInt();
                    int res = tamano % 2;
                    if (res != 0) {
                        Contorno(tamano, res);

                    } else {
                        System.out.println("Esto no es un numero impar");
                    }

                    break;
                case 3:
                    String Palab;
                    System.out.println("Ingrese una palabra: ");
                    Palab = leer.next();
                    Vecinos(Palab);

                    break;

                default:
                    System.out.println("Opcion no disponible");
                    break;

            }//fin Switch
        } while (op != 0);
    }//fin main

    public static void Contorno(int tamano, int res) {
        for (int i = 0; i <= (tamano/2)+1 ; i++) {
            for (int j = 0; j <= tamano-1; j++) {
                if (i >= tamano - 1 || j == tamano - 1 || j == 0 || i == 0|| i== tamano-1 || res!=2) {
                    System.out.print("*");
                } /*else
                    if (i+j==tamano){
                        System.out.println("+");
                    }*/
                else{

                    System.out.print(" ");
                }//fin else
            }//fin for
            System.out.println(" ");
        }//fin for
    }//fin contorno

    public static String primos(int N) {
        String Acum = "";
        for (int i = 1; i < N; i++) {
            int res2 = N % i;
            int Lo = i;
            if (res2 == 0) {
                Acum = "" + Acum + Lo + ",";

            }

        }
        return Acum;
    }//fin primos

    public static String Vecinos(String Palab) {
        boolean flag = true;
        String N_palabra = "";
        int PalabN = 0;
        Random A = new Random();
        int num = A.nextInt(2);
      
        System.out.println("El numero que salio es: " + num);
       
        for (int i = 0; i < Palab.length(); i++) {
            PalabN = (int) Palab.charAt(i);
            if ((int) PalabN >= 64 && (int) PalabN <= 91 || (int) PalabN >= 96 && (int) PalabN <= 123) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            if (num == 0) {
                for (int i = 0; i < Palab.length(); i++) {
                    PalabN = Palab.charAt(i);
                    PalabN = PalabN - 1;
                    char PalabN2 = (char) PalabN;
                    N_palabra = N_palabra + PalabN2;
                    System.out.println(N_palabra);

                    
                }

            } else if(num==1){
                for (int i = 0; i < Palab.length(); i++) {
                    PalabN = Palab.charAt(i);
                    PalabN = PalabN + 1;
                    char PalabN2 = (char) PalabN;
                    N_palabra = N_palabra + PalabN2;
                    System.out.println(N_palabra);
                    
                }
            }
        }
        //FIN IF

        String hola = "";
        return hola;
    }//fin vecinos
}//fin 

