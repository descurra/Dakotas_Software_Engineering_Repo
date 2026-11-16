public class IntegerRightTriangles {
    /*
        Euler Problem 39:
        p = perimeter of right triangle
        p = a + b + c

        For which value of p <= 1000 is the number of soltutions maximized

        //For loop that iterates through the perimeter values from 1 to 1000
        //Checks that a^2 + b^2 = c^2
        
    
    */

    public static void main(String[] args) {
        int limit = 1000; // Perimeter limit
        int maxSol = 0; // Most amount of solutions had by the best perimeter
        int bestP = 0; // Value of perimeter with most amount of solutiosn

        for (int p = 1; p <= limit; p++) {
            int solCount = 0; // Count of solutions for current perimeter

            // Iterate through possible values of a and b
            for (int a = 1; a < p / 2; a++) {
                for (int b = a; b < p / 2; b++) {
                    int c = p - a - b; // Calculate c based on perimeter

                    // Check if it forms a right triangle
                    if (a * a + b * b == c * c) {
                        solCount++;
                    }
                }
            }

            // Update maxSol and bestP if current solCount is greater
            if (solCount > maxSol) {
                maxSol = solCount;
                bestP = p;
            }
        }

        System.out.println("Perimeter with the most solutions: " + bestP);
        System.out.println("Number of solutions: " + maxSol);



        

    }
}   