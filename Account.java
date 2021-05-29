package com.company;

import java.util.Scanner;

public class Account extends Bank{
    Scanner in = new Scanner(System.in);

        private int Balance;
        private int AccountNum;

        public Account(int Balance,int AccountNum)
        {
            this.Balance=Balance;
            this.AccountNum=AccountNum;
        }
        public Account()
        {}
        public void setBalance(int Balance)
        {
            this.Balance=Balance;
        }
        public int getBalance()
        {
            return Balance;
        }
        public void setAcountNumber(int AccountNum)
        {
            this.AccountNum=AccountNum;
        }
        public int getAcountNumber()
        {
            return AccountNum;
        }
        public String toString() // represent info about the acount
        {

            return ( "Account Number is : " + AccountNum +"\n"+"Balance is : " + Balance );
        }
        public void withdraw(int money) // to take money
        {

            if (money<Balance)
            {
                Balance=Balance-money;
                System.out.println("**** Successful withdrawing ****");
                System.out.println( "New Balance After Withdrawing is = "+Balance);
            }
            else
            {
                System.out.println("Error Ur withdrow is greater than Ur balance");
            }
        }
    public void deposite(int money) //to put money
    {
        if(money>=0)
        {
            Balance=Balance+money;
            System.out.println("*** Successful depositing ***");
            System.out.println("The new balance after depositing is = "+Balance);

        }
        else
            System.out.println("Error , U must put positive number");
    }

}


