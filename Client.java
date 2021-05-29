package com.company;

public class Client {
    private String name;
    private long nationalID;
    private String address;
    private long phone ;
    public Account AccountsData=new Account();


    public Client(String name, long ID, String address, long phone , Account AccountsData )
    {
        this.name = name;
        nationalID = ID;
        this.address = address;
        this.phone = phone;
        this.AccountsData=AccountsData;

    }
    public Client(){}

    public void setAccounData(Account AccountsData)
    {
        this.AccountsData=AccountsData;
    }
    public Account getGetAccountData1()
    {
        return AccountsData;
    }
    public String getName() {
        return name;
    }

    public long getNationalID() {
        return nationalID;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationalID(long nationalID) {
        this.nationalID = nationalID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    public void setAccountsData(Account AccountsData)
    {
        this.AccountsData=AccountsData;
    }
    public Account getAccountsData()
    {
        return AccountsData;
    }

    public String toString()
    {
        return ("Name is : "+name+"\n"+"The national Id : "+ nationalID +"\n"+ "The address : " +address+"\n"+"The phone number : "+phone);
    }


}
