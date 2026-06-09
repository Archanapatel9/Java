import java.util.Scanner;
public class cal {
    public static void main(String[] args){
        System.out.println("Welcome in my calculator");
        
        cal obj = new cal();
        char ch = obj.getoperator();
        if(ch=='?'){
            System.out.println("wrong opeator");
            return;
        }
        System.out.println("operator is " + ch);

        int a = obj.getOperand(1);
        int b = obj.getOperand(2);

        if(!obj.isoperandValid(ch,b)){
            System.out.println("denominator cannot be zero");
            return;
        }
                System.out.println("entered number are " + a + " ," + b);

        obj.calculator(ch, a , b);

        }
    }
    public void calculator(char op, int num1, int num2){
        switch (op){
            case '+':
                System.out.println("result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("result is " + (num1 - num2));
                break;
            case '*':
                System.out.println("result is " + (num1 * num2));
                break;
            case '%':
                System.out.println("result is " + (num1 % num2));
                break;
            case '/':
                System.out.println("result is " + (num1 / num2));
                break;
        }
        
    }
    public int getOperand(int inputNumber){
            System.out.println("enter operant " + inputNumber);
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            return userInput;
        } 
        public boolean isoperandValid(char operator,int num2){
        if(operator == '/' || operator == '%'){
            if(num2==0){
                return false;
            }
        }
        return true;
    }
    public boolean isoperatorValid(String userInput){
        int len = userInput.length();
        if(len==0 || len>1){
            return false ;
        }
        char ch = userInput.charAt(0);
        if(ch== '+' || ch=='-' || ch=='*' || ch=='%' || ch=='/' ){
            return true ;
        }
        return false;
    }

public char getoperator(){
    System.out.println("enter a opeartor: ");
    System.out.println(" '+', '-', '*', '%', '/' ");
    Scanner sc = new Scanner(System.in);
    String userInput = sc.next();
    if(isoperatorValid(userInput)){
        return userInput.charAt(0);
    }else{
        return '?'; // if user give wrong input
        }
    }


