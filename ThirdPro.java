package projava;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ThirdPro
{
    DecimalFormat dec=new DecimalFormat("'$'###,##0.00");
    Scanner sc=new Scanner(System.in);
    private int CoustNumber;
    private int PassNumber;
    private int CheckingBal=0;
    private int SavingBal=0;
    public void setCoustNumber(int CoustNumber)
    {
        this.CoustNumber=CoustNumber;
    }
    public int getCoustNumber() {
        return CoustNumber;
    }
    public void setPassNumber(int setPassNumber) {
        this.PassNumber = setPassNumber;
    }
    public int getPassNumber() {
        return PassNumber;
    }
    public int checkCheckingBal()
    {
        return CheckingBal;
    }
    public int checkSavingBal()
    {
        return SavingBal;
    }
    public   boolean withdrawChEligilble(int amount)
    {

        if( CheckingBal>amount)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void withdrawChecking()
    {
        System.out.println("->Please enter the amount that you want to withdraw in Checking");
        int amount =sc.nextInt();
        if(withdrawChEligilble(amount))
        {
            System.out.println("Please take your cash");
            CheckingBal= CheckingBal-amount;
        }
        else {System.out.println("->Viewing Balance : "+dec.format(checkCheckingBal()));}
        System.out.println(" Not enough money .SO, can't be withdraw");
        return;
    }
    public   boolean withdrawSaEligilble(int amount)
    {

        if( SavingBal>amount)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void withdrawSaving()
    {
        System.out.println("->Please enter the amount that you want to withdraw in Saving");
        int amount =sc.nextInt();
        if(withdrawSaEligilble(amount))
        {
            System.out.println("->Please take your cash");
            SavingBal= SavingBal-amount;
        }
        else {System.out.println("->Viewing Balance : "+dec.format(checkSavingBal())+" can;t be withdraw");}

        System.out.println(" Not enough money .SO, can't be withdraw");
        return;
    }
    public void depositChecking()
    {
        System.out.println("->Please enter the amount that you are depositing in Checking");
        int amount =sc.nextInt();
        if(CheckingBal>0)
        {
            System.out.println("->your deposit is successfull");
            CheckingBal= CheckingBal+amount;
        }
        else{
            System.out.println("->since it is your first deposit!,your new checking balance is created");
            CheckingBal= CheckingBal+amount;
        }
        return;
    }
    public void depositSaving()
    {
        System.out.println("->Please enter the amount that you are depositing in saving");
        int amount =sc.nextInt();
        if(SavingBal>0)
        {
            System.out.println("->your deposit is successfull");
            SavingBal= SavingBal+amount;
        }
        else{
            System.out.println("->since it is your first deposit!,your new Saving balance is created");
            SavingBal= SavingBal+amount;
        }
        return;
    }
}    
