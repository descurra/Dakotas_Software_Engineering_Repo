import java.util.Scanner;
public class IntegerRightTriangles {
    /*
        p = perimeter of a right triangle
        p = a + b + c

        Finding total number of solutions for input value p 
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter perimeter of a right triangle, must be less than or equal to 10,000: ");
        int p = scanner.nextInt(); //User inputed perimeter
        

        if(p <= 10000 && p >= 1){
            int solCount = 0; //Number of solutions for perimeter
            
            //Looping through all possible values of a and b, they can't be more than half the total perimeter
            for(int a = 1; a < p/2; a++){
                for(int b = a ; b <= (p-a)/2 ; b++){

                    //Getting c by subtracting a and b from the total peimeter
                    int c = p - a - b;

                    //Checking if a^2 + b^2 = c^2, if yes then solCount gets incrimented by 1
                    if(a * a + b * b == c * c ){
                        System.out.println("a: "+a+", b: "+b+", c: "+c); //Displaying solution 
                        solCount++;
                    }

                }
            }
            //Printing out total number of solutions
            System.out.println("Total number of {a, b, c} solutions for the perimeter " + p + " is " + solCount);

        } else {
            //Printing if p is out of bounds
            System.out.println("This is an invalid perimeter");
        }

        scanner.close();
    }
}   