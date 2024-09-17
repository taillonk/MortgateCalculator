package io.github.taillonk;

public class CalculatePayment {
    private int principal;
    private double interest;
    private int term;
    private double mortgage;

    public CalculatePayment(int principal, double interest, int term) {
        this.setTerm(term);
        this.setInterestRate(interest);
        this.setPrincipal(principal);
    }
    public double calculateMortgage(){
        return mortgage;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public double getInterestRate() {
        return interest;
    }

    public void setInterestRate(double interest) {
        this.interest = interest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
