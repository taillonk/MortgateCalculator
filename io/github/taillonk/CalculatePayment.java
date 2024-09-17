package io.github.taillonk;

public class CalculatePayment {
    private int principal;
    private double interestRate;
    private int term;
    private double mortgage;

    public void calculatePayment(int principal,double interestRate, int term) {
        this.setTerm(term);
        this.setInterestRate(interestRate);
        this.setPrincipal(principal);
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
