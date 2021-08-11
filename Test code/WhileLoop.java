package IntermediateJava;

/**
 *Shane Fox 6/20/2021
 * Module 5 Assignment
 * While loop to increase and decrease denominator in equations.
 */
public class WhileLoop {
    public static void main(String[] args) {
    
    // Set value of int
    int j = 3;
    
    // While loop
    System.out.print("1/" + j);
    j++;
    while (j < 100){
        if (j%2 != 0){
        System.out.print(" + 1/" + j);
        }
        j++;
    }
    // New line
    System.out.println("");
    // Se value of int
    int i = 99;
    
    // While loop
    System.out.print("1/" + i);
    i--;
    while (i > 1){
        if (i%2 != 0){
            System.out.print(" + 1/" + i);
        }
        i--;
    }
  }
}