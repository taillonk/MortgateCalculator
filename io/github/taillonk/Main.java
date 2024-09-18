package io.github.taillonk;

public class Main {
    public static void main(String[] args) {
        int principal = Prompts.getInt("Enter the amount of loan you'd like to get: ");
        double annualInterest = Prompts.getDouble("Enter the Annual Interest Rate: ");
        int term = Prompts.getInt("Enter the term of the loan in years: ");
        CalculatePayment calculator = new CalculatePayment(principal, annualInterest,term);
        System.out.println("Mortgage: $" + calculator.calculateMortgage());
    }
}
