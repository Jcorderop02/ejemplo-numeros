package aplicacion;

public class Principal {
    public static void main(String args[]){
        int i = 0;

        /*i = i +1; //Se puede acortar de esta forma i += 1; o i++;
        System.out.println(i);*/

        /**
         * El objetivo es imprimir los numeros del 1-10
         */
        /*while (i <= 10){
            System.out.println(i++);
        }*/

        /**
         * Otra forma de imprimir los numeros del 1-10 de forma comprimida
         */
        /*for (int y = 0; y<= 10; y++){
            System.out.println(y);
        }*/

        /**
         * El objetivo es imprimir los numeros pares del 0-10
         */
        /*while (i <= 10){
            System.out.println(i);
            i += 2;
        }*/

        /**
         * Otra forma de imprimir los numeros pares del 0-10 de forma mas comprimida
         */
        for (int y= 0; y<=10; y+=2){
            System.out.println(y);
        }
    }
}
