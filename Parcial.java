package javaapplication15;

import java.util.Scanner;




public class JavaApplication2 {

  
    public static void main(String[] args) {
        
      
        String []nom;
        int nota1,nota2,nota3,nota4,sc;
         Scanner nombre = new Scanner(System.in);
         for (int i = 0; i < 5; i++) {
        System.out.println("Nombre del estudiante : ");
            String a = nombre.next();
              }
         
  int tem;
        int vector[] = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese notas del estudiante");
            vector[i] = in.nextInt();
        }
     
         
        System.out.println();
        for (int i = 0; i < 4; i++) {

for (int j = 0; j < 4; j++) {
                if (vector[j] > vector[j + 1]) {
                    tem = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = tem;
                        
                }
            }
        }
       System.out.println("Ordenado");
        for (int i = 0; i < 5; i++) {       
            System.out.print(vector[i] + "|");
        }
         
        System.out.println("");
        int carne1,carne2,carne3,carne4;
          Scanner car = new Scanner(System.in);   
         for (int i = 0; i < 5; i++) {
      System.out.println("Introduzca una carne1: ");
           nota1 = car.nextInt();
      System.out.println("Introduzca una carne1: ");
           nota2 = car.nextInt();
      System.out.println("Introduzca una carne1: ");
           nota3 = car.nextInt();
      System.out.println("Introduzca una carne1: ");
           nota4 = car.nextInt();        
        
                   
                     
                 }
    }
           
           
       
    

