package com.bl;

public class SavingsAccount
{
	/**
	 * calculateMonthlyInterest -  calculate monthly interest
	 * modifyInterestRate -  it modifies the interest with new interest
	 * getSavingsBalance - it returns the savings balance amount
	 * getAnnualInterestRate - it returns the interest rate
	 */
	/**
	 * Savings Account class to calculate annual and monthly interest rate
	 */
	
	
	/**
	 * declaring instance variables
	 */
 public static double annualInterestRate;
 private double savingsBalance;
 public SavingsAccount()
{
 annualInterestRate = 0.0;
 savingsBalance = 0.0;
}
/*Creating Constructor with parameters
 * 
 */
 public SavingsAccount(double intRate, double savBal)
{
 annualInterestRate = intRate;
 savingsBalance = savBal;
}

 /* calculates Monthly interest rate
 * 
 */
 public double calculateMonthlyInterest() 
{
 double intRate = (savingsBalance * annualInterestRate/12);
 savingsBalance = savingsBalance + intRate;
 return intRate;
}
 /*modifies  interest rate
  * 
  */

 public static void modifyInterestRate(double newInterestRate) 
{
 annualInterestRate = newInterestRate;
}
 
 public void setSavingsBalance(double newBal) 
{
 savingsBalance = newBal;
}
 
 /* it returns savingsBalance
  * 
  */
 public double getSavingsBalance()
{
 return savingsBalance;
}
 
 /* it returns AnnulalInteresrrate
 * 
 */
 public double getAnnualInterestRate() 
{
 return annualInterestRate;
}
}
