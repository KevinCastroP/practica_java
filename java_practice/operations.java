import java.util.Scanner;

public class operations {
/*function to make basic math operations*/    
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);
        int a;
        int b;
        String op;
        boolean loop = false;
        
        //Enter two values and press enter
        while (!loop){
            System.out.println("Choice the operation you want to do\n pow\n mul\n div\n sum\n sub\n ------>");
            op = num.nextLine();
            if (op.equals("pow")){
                System.out.println("Enter an integer number\n");
                a = num.nextInt();
                if (a > 0 ){                
                    System.out.println("Enter another integer number\n");
                    b = num.nextInt();
                    System.out.println("The power is:\n" + (a^b));                    
                }
                else {
                    System.out.println("Sorry, 0 is not an integer number\n");
                    loop = false;
                }
            } 
            else if (op.equals("mul")){
                System.out.println("Enter an integer number\n");
                a = num.nextInt();
                if (a > 0 ){                
                    System.out.println("Enter another integer number\n");
                    b = num.nextInt();
                    System.out.println("The multiplication is:\n" + (a*b));
                }
                else {
                    System.out.println("Sorry, 0 is not an integer number\n");
                    loop = false;
                }
            } 
            else if (op.equals("div")){
                System.out.println("Enter an integer number\n");
                a = num.nextInt();
                if (a > 0 ){                
                    System.out.println("Enter another integer number\n");
                    b = num.nextInt();
                    System.out.println("The division is:\n" + (a/b));
                }
                else {
                    System.out.println("Sorry, 0 is not an integer number\n");
                    loop = false;
                }
            } 
            else if (op.equals("sum")){
                System.out.println("Enter an integer number\n");
                a = num.nextInt();
                if (a > 0 ){                
                    System.out.println("Enter another integer number\n");
                    b = num.nextInt();
                    System.out.println("The sum is:\n" + (a+b));
                }
                else {
                    System.out.println("Sorry, 0 is not an integer number\n");
                    loop = false;
                }
            } 
            else if (op.equals("sub")){
                System.out.println("Enter an integer number\n");
                a = num.nextInt();
                if (a > 0 ){                
                    System.out.println("Enter another integer number\n");
                    b = num.nextInt();
                    System.out.println("The substraction is:\n" + (a-b));
                }
                else {
                    System.out.println("Sorry, 0 is not an integer number\n");
                    loop = false;
                }
            }            
        }
        num.close();       
    }
}