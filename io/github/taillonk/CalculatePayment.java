package io.github.taillonk;

public class CalculatePayment {
    private int principal;
    private double annualInterest;
    private int term;
    private double mortgage;
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    public CalculatePayment(int principal, double annualInterest, int term) {
        this.setTerm(term);
        this.setAnnualInterest(annualInterest);
        this.setPrincipal(principal);
    }
    public double calculateMortgage(){
        double monthlyRate = ((getAnnualInterest()/PERCENT) / MONTHS_IN_YEAR);
        int months = getTerm() * MONTHS_IN_YEAR;
        mortgage = getPrincipal() * ((monthlyRate * Math.pow((1+monthlyRate), months))/ (Math.pow((1+monthlyRate), months) - 1));
        mortgage = (double) Math.round(mortgage * PERCENT) / PERCENT;
        return mortgage;
    }

    public void calculateBalance(){
        double monthlyRate = ((getAnnualInterest()/PERCENT) / MONTHS_IN_YEAR);
        int months = getTerm() * MONTHS_IN_YEAR;
        for(int i = 0; i <= months; i++) {
            double balance = getPrincipal()
                    * (((Math.pow((1 + monthlyRate), months))) - (Math.pow((1 + monthlyRate), i)))
                    / ((Math.pow((1 + monthlyRate), months)) - 1);
            balance = (double) Math.round(balance * PERCENT) / PERCENT;
            System.out.println("$" + balance);
        }
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
