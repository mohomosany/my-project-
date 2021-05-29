package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Account A=new Account();
        Client C=new Client();
        Bank B=new Bank();
        SpecialAccount S=new SpecialAccount();
        CommercialClient C1=new CommercialClient();

        int choice=0;
        while (choice!=5)
        {
            System.out.println("1.Add Accounts / Clients");
            System.out.println("2.Dispaly Accounts / Clients");
            System.out.println("3.Deposit");
            System.out.println("4.Withdraw");
            System.out.println("5.Exit");
            choice= in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Which kind of Account do you want to creat");
                    System.out.println("1.Normal");
                    System.out.println("2.Special");
                    int kind=in.nextInt();
                    if(kind==1)
                    {
                        System.out.println("Enter account number");
                        int accountnum = in.nextInt();
                        System.out.println("Enter account balance");
                        int accbalance = in.nextInt();
                        A = new Account(accbalance, accountnum);
                        B.AccountData.add(A);
                        System.out.println("***** Account Created *****");
                    }
                    else
                    {
                        System.out.println("Enter Special account number");
                        int Specialnum = in.nextInt();
                        System.out.println("Enter Special account balance");
                        int SpecialBal = in.nextInt();
                        S = new SpecialAccount(SpecialBal, Specialnum);
                        S.SpecialAccountData.add(S);
                        System.out.println("***** Special Account Created *****");
                    }
                    B.Add(C,A);
                    break;


                case 2:
                    B.display();
                    break;


                case 3:
                        System.out.println("Enter your Account Number");
                        int Accnum=in.nextInt();
                        for (int i=0;i<B.AccountData.size();i++)
                        {
                            if(B.AccountData.get(i).getAcountNumber()==Accnum)
                            {
                                System.out.println("enter money");
                                int money=in.nextInt();
                                A.deposite(money);
                            }
                            else
                            {
                                return ;
                            }
                        }





                    break;

                case 4:
                    System.out.println("what Kind of account you use ?");
                    System.out.println("1.Normal");
                    System.out.println("2.Special");
                    int x=in.nextInt();
                    if (x==1)
                    {
                        System.out.println("Enter your Account Number");
                        Accnum=in.nextInt();
                        for (int i=0;i<B.AccountData.size();i++)
                        {
                            if (B.AccountData.get(i).getAcountNumber() == Accnum) {
                                System.out.println("enter money");
                                int money = in.nextInt();
                                A.withdraw(money);
                            }
                            else
                            {
                                System.out.println("This account number doesn't exist");
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Enter your Special Account Number");
                        Accnum=in.nextInt();
                        for (int i=0;i<S.SpecialAccountData.size();i++)
                        {
                            if (S.SpecialAccountData.get(i).getAcountNumber() == Accnum) {
                                System.out.println("enter money");
                                int money = in.nextInt();
                                S.withdraw(money);
                            }
                            else
                            {
                                System.out.println("This account number doesn't exist");
                            }
                        }
                    }
                    break;

            }
        }












    }
}
