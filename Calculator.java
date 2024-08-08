import java.util.Scanner;


class Calculator {
    public static void main(String[] args){

        int operator, n1, n2;

        System.out.println("1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        System.out.println("Choose Operator: ");

        Scanner oT = new Scanner(System.in);

        operator = oT.nextInt();

        System.out.println("Enter First number:");
        n1 = oT.nextInt();
        System.out.println("Enter Second number:");
        n2 = oT.nextInt();

        int result = 0;
        switch(operator){
            case 1:
            result = n1 + n2;
            break;

            case 2:
            result = n1 - n2;
            break;

            case 3:
            result = n1 * n2;
            break;

            case 4 :
            result = n1 / n2;
            break;

            default:
            System.out.println("Entered operator not valid");
        }

      System.out.println("Result is : " + result);


      oT.close();
    }       

}
