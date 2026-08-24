import java.util.*;
class multip{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }
    }
}