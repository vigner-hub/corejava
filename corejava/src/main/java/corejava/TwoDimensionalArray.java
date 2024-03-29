/*package corejava;


public class StringCaseCount {

    public static void main(String[] args) {
        String s = "Welcome To Automation";
        int lower = 0;
        int upper = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
        }
        
        System.out.println("Lowercase count: " + lower);
        System.out.println("Uppercase count: " + upper);
    }
}*/


/*
package corejava;
import java.util.Scanner;

public class EvenNumbers {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter Limit:- ");
int value = sc.nextInt();

System.out.println("Even numbers between 1 and " +value);

for (int i = 1; i <= value; i++) {
// if the number is divisible by 2 then it is even
if (i % 2 == 0) {
System.out.print(i + " ");
}
}
sc.close(); 

}
}*/

package corejava;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int b[][] = { { 100, 200 }, { 300, 600 }, { 400, 700 },  };

        for (int r = 0; r < b.length; r++) {
            for (int c = 0; c < b[r].length; c++) {
                System.out.print(b[r][c] + "  ");
            }
            System.out.println();
        }

       
    }
}
