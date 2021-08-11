/*
 * Shane Fox 7/10/2021
 * Module 9 Assignment
 * Build and array, fill it with 20 numbers and give max, min, average, and sum.
 */

public class Array {
    public static void main(String[] args) {
        // Create a scanner object
    java.util.Scanner input = new java.util.Scanner(System.in);
    
    // Create the array
    double[] numbers = new double[20];
    double sum = 0;

    // Fill the array
    System.out.print("Enter 20 numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
      sum += numbers[i];
    }
    
    int maxValue = getMax(numbers);
    int minValue = getMin(numbers);
    double average = sum / numbers.length;
    
    System.out.println("The highest value added was: " +maxValue);
    System.out.println("The lowest value added was: " +minValue);
    System.out.println("The average of provided numbers is: " + average);
    System.out.println("The total of all numbers added is: " +sum);
  }
      // Method for getting the maximum value
    public static int getMax(double[] inputArray){ 
    int maxValue = (int) inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = (int) inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
      // Method for getting the minimum value
    public static int getMin(double[] inputArray){ 
    int minValue = (int) inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
         minValue = (int) inputArray[i]; 
      } 
    } 
    return minValue; 
  }
        
}