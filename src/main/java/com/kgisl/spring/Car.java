package com.kgisl.spring;
public class Car {
    private String customername;
    private String carname;
    private int tnNo;
    private int ranking;
   // private Date dateofreg;
    
    
    public String getcustomername() {
        return customername;
    }


    public void setcustomername(String customername) {
        this.customername = customername;
    }


    public String getcarname() {
        return carname;
    }


    public void setcarname(String carname) {
        this.carname = carname;
    }


    public int gettnno() {
        return tnNo;
    }


    public void settnno(int tnNo) {
        this.tnNo = tnNo;
    }


    public int getranking() {
        return ranking;
    }


    public void setranking(int ranking) {
        this.ranking = ranking;
    }


    // public Date getdateofreg() {
    //     return dateofreg;
    // }


    // public void setdateofreg(Date dateofreg) {
    //     this.dateofreg = dateofreg;
    // }


    @Override
    public String toString() {
        System.out.println();
        return "Models [customername=" + customername + ", carname=" + carname + ", tnno=" + tnNo + ", ranking="
                + ranking + "]";
                // ", dateofreg=" + dateofreg + 
    }
    
}
