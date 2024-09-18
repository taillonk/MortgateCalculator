package io.github.taillonk;

import java.text.NumberFormat;

public class CalculatePayment {
    private int principal;
    private double annualInterest;
    private int term;
    private double mortgage;

    public CalculatePayment(int principal, double annualInterest, int term) {
        this.setTerm(term);
        this.setAnnualInterest(annualInterest);
        this.setPrincipal(principal);
    }
    public double calculateMortgage(){
        double monthlyRate = ((getAnnualInterest()/100) / 12);
        int months = getTerm() * 12;
        mortgage = getPrincipal() * ((monthlyRate * Math.pow((1+monthlyRate), months))/ (Math.pow((1+monthlyRate), months) - 1));
        mortgage = (double) Math.round(mortgage * 100) / 100;
        return mortgage;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(double interest) {
        this.annualInterest = interest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
