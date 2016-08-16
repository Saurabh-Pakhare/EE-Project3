package project3;

import java.text.DecimalFormat;

/**
 * Created by saurabh on 15/8/16.
 */
public class LoanPayment {
    int loanAmount;
    double annualInterestRate;
    int monthlyPayment;
    int numberOfMonths;

    public void setLoan_amount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setAnnual_interest_rate(double annual_interest_rate) {
        this.annualInterestRate = annual_interest_rate;
    }

    public void setMonthly_payment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setNumber_of_months(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    private static String twoPlaces(double d) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(d);
    }

    public void DisplayInitialLoanDetails()
    {
        System.out.println("The initial loan is " + loanAmount);
        System.out.println("The monthly payment is " + monthlyPayment);
        System.out.println("The annual interest rate is" + annualInterestRate);
        System.out.print("\n");
    }

    public void PrintLoanMiniStatement()
    {
        double startBalance ;
        double remaining_balance = loanAmount;

        System.out.println("Month\t" + "Balance");
        for(int i=1; i<=12; i++)
        {
            startBalance = (remaining_balance + ((annualInterestRate/12)/100)*remaining_balance);
            remaining_balance = startBalance - monthlyPayment;
            System.out.println(i + "\t\t"+ remaining_balance);
        }
        System.out.print("\n");
    }

    public void PrintDetailedPaymentTable()
    {
        double startBalance ;
        double remainingBalance = loanAmount;

        System.out.println("Month\t\t" + "Balance\t\t\t" + "Payment\t\t\t" + "Remaining");

        for(int i=1; i<=numberOfMonths; i++)
        {
            startBalance = (remainingBalance + ((annualInterestRate/12)/100)*remainingBalance);
            remainingBalance = startBalance - monthlyPayment;
            System.out.println(i + "\t\t\t"+ twoPlaces(startBalance) + "\t\t\t" + twoPlaces(monthlyPayment) + "\t\t\t"+ twoPlaces(remainingBalance));
            //System.out.printf("%d \t\t%.4f \t\t%.4f \t\t%.4f", i, startBalance, monthlyPayment, remainingBalance);
        }

    }
}
