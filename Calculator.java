import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.print("Enter a=");
        int a=sc.nextInt();
        System.out.print("Enter b=");
        int b=sc.nextInt();
        System.out.println("Enter (1)sum\n(2)multiplication\n(3)subtraction\n(4)division\n(5)modulo");
        int operator=sc.nextInt();
       
        switch(operator){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a*b);
            break;
            case 3:System.out.println(a-b);
            break;
            case 4:if(b==0){
                System.out.println("invalid division");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5:if(b==0){
                System.out.println("invalid division");
            }else{
                System.out.println(a&b);
            }
            break;
            default:System.out.println("invalid");
        }
    }    
}

