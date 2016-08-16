package project3;

import java.util.Scanner;

/**
 * Created by saurabh on 15/8/16.
 */
public class Driver {
    public static void main(String [] args) {
        double rate;
        Scanner CONSOLE = new Scanner(System.in);

        LoanPayment loanPayment = new LoanPayment();

        System.out.println("One Year Loan Table\n");
        System.out.print("Enter the annual interest rate: ");
        rate = CONSOLE.nextInt();

        loanPayment.setAnnual_interest_rate(rate);
        loanPayment.setLoan_amount(1000);
        loanPayment.setMonthly_payment(50);

        loanPayment.DisplayInitialLoanDetails();
        System.out.println("Simple Loan Payment Table For One Year\n");

        loanPayment.PrintLoanMiniStatement();


        System.out.println("Detailed Loan Table\n");

        System.out.println("Enter Initial balance:");
        loanPayment.setLoan_amount(CONSOLE.nextInt());
        System.out.println("Enter Annual Interest rate");
        loanPayment.setAnnual_interest_rate(CONSOLE.nextInt());
        System.out.println("Enter Monthly payment");
        loanPayment.setMonthly_payment(CONSOLE.nextInt());
        System.out.println("Enter number of months");
        loanPayment.setNumber_of_months(CONSOLE.nextInt());

        loanPayment.DisplayInitialLoanDetails();

        loanPayment.PrintDetailedPaymentTable();
    }
}
