import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        int r;
        float a;
        
        Scanner sc=new Scanner(System.in);
        
        r=sc.nextInt();
        
        a=(float)((3.14)*r*r);
        
        System.out.format("%.2f",a);
        
        sc.close();
    }
}