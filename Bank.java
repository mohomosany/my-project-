package com.company;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    Scanner in = new Scanner(System.in);
    public String BankName;
    public String Address;
    public int phone;
    public static int BankCounter=0;
    public ArrayList<Account> AccountData = new ArrayList<Account>();
    public ArrayList<Client> ClientsData = new ArrayList<Client>();
    public ArrayList<CommercialClient> CommercialClientsData = new ArrayList<CommercialClient>();
    public ArrayList<SpecialAccount> SpecialAccountData = new ArrayList<SpecialAccount>();


    public Bank(String name, String address, int Phone) {
        Address = address;
        BankName = name;
        phone = Phone;
    }

    public Bank() {
    }
    public static int getBankCounter()
    {
        return BankCounter;
    }

    public void setName(String name) {
        BankName = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getBankName() {
        return BankName;
    }

    public long getPhone() {
        return phone;
    }

    public void Add(Client C,Account A) {
        int choice = 0;
        while (choice !=3) {
            System.out.println("1.Add a normal client");
            System.out.println("2.Add Commercial client");
            System.out.println("3.Back for menu");
            choice = in.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter client name");
                    String name = in.next();
                    System.out.println("Enter client national ID");
                    long Id = in.nextLong();
                    System.out.println("Enter client address");
                    String add = in.next();
                    System.out.println("Enter phone");
                    long phone = in.nextLong();
                    C = new Client(name, Id, add, phone, A);
                    ClientsData.add(C);
                    System.out.println("***** Client Created *****");
                    break;

                case 2:
                    System.out.println("Enter  the commercial client name");
                    String name1 = in.next();
                    System.out.println("Enter the commercial client national ID");
                    long Id1 = in.nextLong();
                    System.out.println("Enter the commercial client address");
                    String add1 = in.next();
                    System.out.println("Enter the commercial client phone");
                    long phone1 = in.nextLong();
                    System.out.println("Add Account number that you want ");
                    int a = in.nextInt();
                    System.out.println("Add Account balance that you want ");
                    int b = in.nextInt();
                    Account W = new Account(a, b);
                    CommercialClient D = new CommercialClient(name1, Id1, add1, phone1, W);
                    ClientsData.add(D);
                    System.out.println("***** Client Created *****");
                    break;
            }
        }
    }

    public void display() {

        int choice=0;

        while (choice != 4)
        {
            System.out.println("1.Only Accounts data");
            System.out.println("2.Only clients data");
            System.out.println("3.Both Clients And Accounts data");
            System.out.println("Exit");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("What Kind Of Account Do you want to display");
                    System.out.println("1.Normal");
                    System.out.println("2.Special");
                    int kind=in.nextInt();
                        if(kind==1)
                        {
                            for (int i = 0; i < AccountData.size(); i++)
                            {
                                System.out.println("**** Account num "+(i+1)+" Information ****");
                                System.out.println(AccountData.get(i));
                            }
                        }
                        else
                        {
                            for (int i = 0; i < SpecialAccountData.size(); i++)
                            {
                                System.out.println("**** Special Account num " + (i + 1) + " Information ****");
                                System.out.println(SpecialAccountData.get(i));
                            }
                        }

                    break;

                case 2:
                    System.out.println("What Kind Of Client Do you want to display");
                    System.out.println("1.Normal");
                    System.out.println("2.Commercial");
                    int type=in.nextInt();
                    if(type==1)
                    {
                        for (int i = 0; i < ClientsData.size(); i++)
                        {
                            System.out.println("**** Client num " +(i+1)+" Information ****");
                            System.out.println(ClientsData.get(i));
                        }
                    }
                    else
                    {
                        for (int i = 0; i < CommercialClientsData.size(); i++)
                        {
                            System.out.println("**** Commercial Client num " +(i+1)+" Information ****");
                            System.out.println(CommercialClientsData.get(i));
                        }
                    }
                    break;

                /*case 3:
                    for (int i = 0; i < AccountData.size(); i++)
                    {
                        System.out.println("**** Account's Information ****");
                        System.out.println(AccountData.get(i));
                    }

                    for (int i = 0; i < SpecialAccountData.size(); i++)
                    {
                        System.out.println("**** Special Account num "+(i+1)+" Information ****");
                        System.out.println(SpecialAccountData.get(i));
                    }

                    for (int i = 0; i < ClientsData.size(); i++)
                    {
                        System.out.println("**** Client's Information ****");
                        System.out.println(ClientsData.get(i));
                    }

                    for (int i = 0; i < CommercialClientsData.size(); i++)
                    {
                        System.out.println("**** Commercial Client num " +(i+1)+" Information ****");
                        System.out.println(CommercialClientsData.get(i));
                    }

                    break;*/
            }
        }

            }

        }






