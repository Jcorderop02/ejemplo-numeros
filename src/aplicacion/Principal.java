package aplicacion;

public class Principal {
    public static void main(String[] args) {
        int i = 0;

        /*i = i +1; //Se puede acortar de esta forma i += 1; o i++;
        System.out.println(i);*/

        /*
         * El objetivo es imprimir los numeros del 1-10
         * Primero el bucle comprueba si se cumple la condicion
         */
        /*while (i <= 10){
            System.out.println(i++);
        }*/

        /*
         * Otra forma de imprimir los numeros del 1-10 de forma comprimida
         */
        /*for (int y = 0; y<= 10; y++){
            System.out.println(y);
        }*/

        /*
          El objetivo es imprimir los numeros pares del 0-10
         */
        /*while (i <= 10){
            System.out.println(i);
            i += 2;
        }*/

        /*
         * Otra forma de imprimir los numeros pares del 0-10 de forma mas comprimida
         */
        /*for (int y= 0; y<=10; y+=2){
            System.out.println(y);
        }*/

        /*
         * Otro tipo de bucle
         * Primero se imprime un valor y despues se comprueba la condicion del bucle
         */
        int j = 1;
        /*do{
            System.out.println(j++);
        } while(j <= -10);*/

        /*
         * Imprime el numero 5050 que es la suma de los numeros con un bucle while
         */
        int x = 1;
        int suma = 0;
        /*while(x <= 100){
            suma = suma + x;
            x++;
        }
        System.out.println(suma);*/

        /*
         * Imprime el numero 5050 que es la suma de los numeros con un bucle for
         */
        /*int suma2 = 0;
        for (int x1 = 1; x1 <= 100; x1++) {
            suma2 = suma2 + x1;
        }
        System.out.println(suma2);*/

        /*
         * Array de numeros
         */
        /*int[] array = new int[10];
        System.out.println(array[0]);
        array[1] = 12;
        System.out.println(array[1]);*/

        /*
         * Array de textos
         */
        /*String[] texto = new String[10];
        System.out.println(texto[0]);
        texto[1] = "Juan";
        System.out.println(texto[1]);*/

        /*
         * Array de numeros
         * Hay un bucle for que imprime los 10 valores de la array
         */
        int[] array2 = new int[10];
        array2[3] = 5;
        array2[6] = 12;
        /*for (int u = 0; u<10; u++){
            System.out.println(array2[u]);
        }*/

        /*
         * Bucle while que imprime los 10 valores de la array
         */
        int a = 0;
        System.out.println("El array tiene " + array2.length + " posiciones:");
        while (a< array2.length){
            System.out.println(array2[a++]);
        }
    }
}
