public class Assignment1_1
{
    public static void main(String args[])
    {
        int n=10;
        for( int i=1;i<=n;i++ )
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1&&j>=n/4&&j<=3*n/4||i==n&&j>=n/4&&j<=3*n/4||j==(n-1)/2&&i>=0&&i<=n)
                
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                for(int  j=1;j<=n;j++)
            {
                    if(j==1&&i>1||i==j&& i!=0&&j!=n||j==n&&i>=1)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1&&j>2&&j<(3*n/4)+1||i==n/2&&j>2&&j<(3*n/4)+1||i==n&&j>1&&j<(3*n/4)+1||j==2&&j<=n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=n;j++)
            {
                if(j==1&&i<n||j==n-1&&i<n||i==n&&j>1&&j<n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int  j=1;j<=n;j++)
            {
                    if(j==1&& i!=n/2&&i>1&&i<=n||i==1&&j>1&&j<3*n/4||j==3*n/4&&i>1&&i<(n/2)||i==(n/2)&&j>1&&j<3*n/4||i-j==((n-2)/2))
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
           
            for(int j=1;j<=n;j++)
            {
                if(i==1&&j>2&&j<n-1||i==n&&j>2&&j<n-1||j==2&&i>1&&i<n||j==n-1&&i>1&&i<n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            for(int  j=1;j<=n;j++)
            {
                    if(j==1&&i>1||i==j&& i!=0&&j!=n||j==n&&i>=1)
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