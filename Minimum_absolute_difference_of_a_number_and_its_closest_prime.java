import java.util.Scanner;
class diff
{
    public static boolean is_it_prime(int n)
    {
        int j;
        for(j=2;j<=Math.sqrt(n);j++)
        {
            if(n%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,c=0,d=0;
        n=sc.nextInt();
        temp=n;
        while(true)
        {
            
            if(n==1)
            {
                continue;
            }
            else if(is_it_prime(n))
            {
                c=Math.abs(temp-n);
                break;
            }
            n+=1;
        }
        n=temp;
        while(true)
        {
           
            if(n==1)
            {
                continue;
            }
            else if(is_it_prime(n))
            {
                d=Math.abs(temp-n);
                break;
            }
             n-=1;
        }
        if(c<=d)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }
    }
}