import java.util.Scanner;

public class postive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        if (number > 0) System.out.println("Number is positive");
        else if (number < 0) System.out.println("Number is negative");
        else System.out.println("Number is zero");
    }
}

/*2
import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        double discrim = b * b - 4 * a * c;
        if(discrim>0){
            double root1 = (-b - Math.sqrt(discrim)) / (2*a);
            double root2 = (-b + Math.sqrt(discrim)) / (2*a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if(discrim==0) {
            double root = -b/2;
            System.out.println("The root is "+ root);
        }
        else System.out.println("There isn't a root");
    }
}*/

/*3
import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int first = scanner.nextInt();

        System.out.print("Input the 2nd number: ");
        int second = scanner.nextInt();

        System.out.print("Input the 3rd number: ");
        int third = scanner.nextInt();
        int max = first;

        if (second > first) {
            max = second;
        }
        if (third > second) {
            max = third;
        }
        System.out.println("The greatest " + max);
    }
}
 */

/*4
import java.util.Scanner;

public class floatpositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input: ");
        double input = scanner.nextDouble();

        if (input > 0) {
            if (input < 1) System.out.println("Positive small number");
            else if (input > 1000000) System.out.println("Positive large number");
            else System.out.println("Positive number");
        }
        if (input<0){
            double abs=input*=-1;
            if(abs<1) System.out.println("Negative small number");
            else if(abs>1000000) System.out.println("Negative large nummber");
            else System.out.println("Negative number");
        }
    }
}
 */

/*5
import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
 */

/*6
import java.util.Scanner;

public class equal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double fpn1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double fpn2 = scanner.nextDouble();

        if(fpn1==fpn2) System.out.println("The are the same numbers");
        else System.out.println("They are the different numbers");
    }
}
 */

/*8
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = scanner.nextLine();

        if (ch.length() > 1) System.out.println("Error");
        else if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
            System.out.println(ch + " is vowel");
        } else System.out.println(ch + " is consonant");
    }
}
 */

/*10
import java.util.Scanner;

public class natural {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
 */

/*11
import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum=0;

        for (int i = 1; i <= number; i++) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("The sum of them is " + sum);
    }
}
 */

/*12
import java.util.Scanner;

public class sumaverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println(i);
        }
        average = sum / 5;
        System.out.println("The sum of them is " + sum);
        System.out.println("The average of them is " + average);
    }
}
 */

/*13
import java.util.Scanner;

public class cube {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i=1;i<=number;i++){
            int cube = i*i*i;
            System.out.println("Number is : " + i + " and cube of " + i + " is " + cube);
        }
    }
}
 */

/*14
import java.util.Scanner;

public class calculate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i=0;i<=number;i++){
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }
}
 */

/*15
import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println("The sum of them is: " + sum);
    }
}
 */

/*16
import java.util.Scanner;

public class row {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
                System.out.println(" ");
        }

    }
}
 */

/*17
import java.util.Scanner;

public class row2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println(" ");
        }

    }
}
 */

/*18
import java.util.Scanner;

public class problem18 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        int k=1;

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=i ; j++)
                System.out.print(k++ + " ");
                System.out.println("");
        }
    }
}
 */