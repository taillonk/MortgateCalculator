package io.github.taillonk;

public class Main {
    public static void main(String[] args) {
        int principal = Prompts.getInt("Enter the amount of loan you'd like to get: ");
        double interest = Prompts.getDouble("Enter Interest Rate: ");
        int term = Prompts.getInt("Enter the term of the loan in months: ");

        CalculatePayment calculator = new CalculatePayment(principal,interest,term);

    }
}
