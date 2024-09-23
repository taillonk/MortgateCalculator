package io.github.taillonk;

public class Main {
    public static void main(String[] args) {
        int principal = Prompts.getInt("Enter loan amount ($1k - $1M): ", 1_000, 1_000_000);
        double annualInterest = Prompts.getDouble("Enter the Annual Interest Rate (0% - 30%): ", 0, 30);
        int term = Prompts.getInt("Enter the term of the loan in years (1 to 30): ", 1, 30);
        CalculatePayment calculator = new CalculatePayment(principal, annualInterest,term);
        System.out.println("Mortgage: $" + calculator.calculateMortgage());
    }
}
