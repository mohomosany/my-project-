package com.company;

public class SpecialAccount extends Account {
    private int Balance;
    private int AccountNum;
    public SpecialAccount (int Balance , int AccountNum)
    {
        this.AccountNum=AccountNum;
        this.Balance=Balance;
    }
    public SpecialAccount(){}
    public void withdraw(int money)
    {
        if (money<=Balance)
        {
            Balance=Balance-money;
            System.out.println("**** Successful withdrawing ****");
            System.out.println("The New Balance = "+Balance);

        }
        else if (money==(Balance+1000))
        {
            Balance=Balance-(money+1000);
            System.out.println("**** Successful withdrawing ****");
            System.out.println("The New Balance = "+Balance);
        }
        else
        {
            System.out.println("Error Your withdraw is greater than Your balance");
        }
    }
}
