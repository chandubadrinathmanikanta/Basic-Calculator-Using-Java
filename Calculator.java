import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Two Numbers");

    //here nextDouble() reads the nextDouble in the given Keyboard(next value)
    double first = reader.nextDouble();
    double second = reader.nextDouble();
    System.out.print("Enter an operator(+,-,*,/)");
    char operator = reader.next().charAt(0);
    double result;
    
    //using of switch for each operations

    switch (operator) {
        case '+':
        result = first + second;            
            break;

            case '-' :
            result = first - second;
            break;
            //This Program is createdd by R.Chandu BNM
            case '*' :
            result = first * second;
            break;

            case '/' :
            result = first / second;
            break;
    
        default:
        System.out.println("Error! The Entered Operatoe is Incorrect... Try Again");
        return;          
    } 
    //Printing the result of the operations
    System.out.printf("%.1f %c %.1f = %.1f",first,operator,second,result);
}
}
