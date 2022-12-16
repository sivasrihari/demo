class javaAssignment1_3 {
    public static void main(String args[])
    {
        for(int i=0;i<=14;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6-i;j++)
            {
                System.out.print("*");
            }
            int spaces=(2*i)+1;
            for(int j=0;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=0;j<7-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<=14;j++)
            {
                if(j==0||i==6||j==14)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
