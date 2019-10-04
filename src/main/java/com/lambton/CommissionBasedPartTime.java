package com.lambton;

public class CommissionBasedPartTime
{
    private double commissionPerc;

    public CommissionBasedPartTime(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }

    public double getCommissionPerc() {
        return commissionPerc;
    }

    public void setCommissionPerc(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }

    public void printMyData() {

    }

    public void setcommissionPerc(double commissionPerc) {
        if (commissionPerc > 0.0) {
            this.commissionPerc = commissionPerc;
        } else {
            throw new IllegalArgumentException("Commission rate must be greater than zero");
        }
    }
}
