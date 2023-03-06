/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_factorial;

/**
 *
 * @author Marisol G
 */
public class EVA1_15_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Factorial de un numero 
        // 5 * 4 * 3 * 2 * 1
        /* int facto = 1;
        for (int i = 4; i >= 1 ; i++) {
            facto = facto * 1 ;
        }*/
        System.out.println(factorial(18));
    }

    public static int factorial(int nume) {
        if (nume > 0) {
            return nume * factorial(nume - 1);
        } else {
            return 1;
        }
    }
}

