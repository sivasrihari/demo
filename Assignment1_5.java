public class Assignment1_5 {
    public static void main(String args[])
    {
        for(int i=1;i<=14;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }    
            for(int i=1;i<=14;i++)
        {
            System.out.print("*");
        }

    }
}
