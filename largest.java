import java.util.*;
class largest{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number is "+a);
        }
        if(b>a && b>c){
            System.out.println("The largest number is "+b);
        }
        else{
            System.out.println("The largest number is "+c);
        }


    }
}