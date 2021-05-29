package com.company;

public class CommercialClient extends Client {
    public CommercialClient(String n, long ni, String a, long p,Account Accountdata )
    {
        super.setName(n);
        super.setAddress(a);
        super.setPhone(p);
        this.commercialID = ni;
        super.setAccounData(AccountsData);
    }
    public CommercialClient(){}
    private long commercialID;

    public long getCommercialID() {
        return commercialID;
    }

    public void setCommercialID(long commercialID) {
        this.commercialID = commercialID;
    }

    //@Override
    public String tostring()
    {
        return  super.getName() + ":" + commercialID + ":" + super.getAddress() + ":" + super.getPhone() ;
    }

}

