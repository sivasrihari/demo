class javaAssignment1_4 {
    public static void main(String args[])
    {
        int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();   
        }
        for(int i=1;i<=2*n;i++)
        {
            System.out.print('*');
        }
    }
}
