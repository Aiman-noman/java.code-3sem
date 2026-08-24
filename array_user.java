import java.util.*;
class array_user{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of array");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the element in the array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Element of array one");
            for(int i=0;i<n;i++){
                System.out.println(a[i]);
            }
        }
    }
}