package com.bl;

public class Main1 
{
	/**
	 * Purpose: Main method to calculate monthly interest and annual interest
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		/**
		 * PROCEDURE
		 * 1.Instantiate 2 saving account objects saver1 and saver2
		 * 2.Set the annual interest rate to 4%=0.04
		 * 3.Calculate monthly interest for both saver1 and saver2
		 * 4.Print out the new balances for both savers
		 * 5.Set the annual interest rate to 5%=0.05
		 * 6.Calculate the next month interest rate and print out balances
		 */
		
		
		/**
		 * 1.Instantiate 2 saving account objects saver1 and saver2
		 */
	SavingsAccount saver1 = new SavingsAccount();
	SavingsAccount saver2 = new SavingsAccount();
	saver1.setSavingsBalance(2000.00);
	saver2.setSavingsBalance(3000.00);
	
	/**
	 *2.Set the annual interest rate to 4%=0.04
	 */
	SavingsAccount.modifyInterestRate(0.04);
	
	/**
	 *3.Calculate monthly interest for both saver1 and saver2
	 */
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	System.out.println("Banking Account Application");
	
	/**
	 * 4.Print out the new balances for both savers
	 */
	System.out.printf(" Balance for 1st month saver1 =%f\n",saver1.getSavingsBalance());
    System.out.printf(" Balance for 1st month saver2 =%f\n",saver2.getSavingsBalance());
    
    /**
	 *5.Set the annual interest rate to 5%=0.05
	 */
	SavingsAccount.modifyInterestRate(0.05);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	
	/**
	 * 6.Calculate the next month interest rate and print out balances
	 */
	System.out.printf(" Balance for 2nd month saver1 =%f\n",saver1.getSavingsBalance());
	System.out.printf(" Balance for 2nd month saver1 =%f\n",saver2.getSavingsBalance());

	}
	}