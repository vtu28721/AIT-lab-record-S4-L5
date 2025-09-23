import java.util.Scanner;

public class squareroot{
    public static void main(String args[]) {
       
        Scanner myObj = new Scanner(System.in);
        
       
        System.out.println("Enter the value of m to find its square root:");

        
        int m = myObj.nextInt();

       
        int i = 1;

      
        while (i * i <= m) {
            if (i * i == m) {
                System.out.println("The square root of " + m + " is " + i);
                break; 
            }
            i++; 
        }

       
        if (i * i != m) {
            System.out.println(m + " is not a perfect square.");
        }

        
        myObj.close();
    }
}
