package projava;
import java.lang.Exception;
import java.util.*;
import java.text.DecimalFormat;
class InvalidCoustomerException extends Exception
{
    public InvalidCoustomerException(String msg)
    {
        super(msg);
    }

}
public class Secpro extends ThirdPro
{
    
    DecimalFormat dec=new DecimalFormat("'$'###,##0.00");
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> data=new HashMap<>();
   
public void Login()
   {
    Secpro s=new Secpro();

    try
    {

        data.put(12345678,1234);
        data.put(87654321,8765);
        System.out.println("Welcome To MY Bank ATM");
        System.out.print("ENTER YOUR COUST NUMBER:: ");
        setCoustNumber(sc.nextInt());
        System.out.println();
        System.out.print("ENTER YOUR PASS NUMBER:: ");
        setPassNumber(sc.nextInt());
        System.out.println();
    }
    catch(Exception e)
    {
        System.out.println("invalid Only NUmbers are allowed");
        System.out.println("________________________________");
        System.out.println();
    }
     
     for(Map.Entry<Integer,Integer> it:data.entrySet())    
     {
         if(it.getKey()==getCoustNumber()&&it.getValue()==getPassNumber())
         {
             getAccountType();
         }
     }
     System.out.println("Wrong Coustomer Number or Pin Number");
     System.out.println("PLEASE RE-ENTER THE CREDENTIALS");
     try{Thread.sleep(3000);}catch(InterruptedException e){;;;;;;;}
     System.out.println();
     s.Login();
}
   public void getAccountType()
   {
        System.out.println();
        System.out.println("select the account type that you want to access");
        System.out.println("Type 1:Checking Account");
        System.out.println("Type 2:Saving Account");
        System.out.println("Type 3:Exit");
        System.out.println("enter your choice");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:{System.out.println("Checking Account");getChecking();break;}
            case 2:{System.out.println("Saving Account");getSaving();break;}
            case 3:{System.out.println("please take your card,  VISIT AGAIN");System.exit(0);}
            default:
            System.out.println("Invalid choice");
            System.out.println("start again");
            System.exit(0);
        }
   }
    public void getChecking()
        {
                System.out.println();            
                System.out.println("Checking Account: ");
                System.out.println("Type 1-View Balance");
                System.out.println("Type 2-Withdraw Fund");
                System.out.println("Type 3-Deposit Fund");
                System.out.println("Type 4-Exit");
                int n=sc.nextInt();
                switch(n)
                {
                    case 1:{System.out.println("Viewing Balance : "+dec.format(checkCheckingBal()));
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}getAccountType();break;}
                    case 2:{System.out.println("Checkig Account withdraw");withdrawChecking();
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}
                    getAccountType();break;}
                    case 3:{System.out.println("Checking Account deposit");depositChecking();
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}
                    getAccountType();break;}
                    default:
                    System.out.println("Not in the choices start againg");
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}
                    getAccountType();
                }
        }
        public void getSaving()
        {
                System.out.println();
                System.out.println("Savings Account: ");
                System.out.println("Type 1-View Balance");
                System.out.println("Type 2-Withdraw Fund");
                System.out.println("Type 3-Deposit Fund");
                System.out.println("Type 4-Exit");
                int n=sc.nextInt();
                switch(n)
                {
                    case 1:{System.out.println("Viewing Balance : "+dec.format(checkSavingBal()));
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}getAccountType();break;}
                    case 2:{System.out.println("Saving Account withdraw");withdrawSaving();
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}getAccountType();break;}
                    case 3:{System.out.println("Saving Account deposit");depositSaving();
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}getAccountType();break;}
                    default:{
                    System.out.println("Not in the choices start againg");
                    try{Thread.sleep(3000);}
                    catch(InterruptedException e){}
                    getAccountType();}
                }
        }
}
