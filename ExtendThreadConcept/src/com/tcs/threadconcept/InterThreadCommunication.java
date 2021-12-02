package com.tcs.threadconcept;

class Customer {
	int accountbalance = 10000;

 synchronized	public void WithdrawMoney(int amount) {
		System.out.println("\n going to withdraw money :INR 20000/-");
		if (this.accountbalance < amount) {
			System.out.println("\n insufficent balance wait for deposit moneyt");
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		this.accountbalance -= amount;
		{
			System.out.println("/n money withdrawl succefully ");
		}
	}

	synchronized public void depositeMoney(int amount) {
		System.out.println("\n going to deposited money :INR 15000/-");
		this.accountbalance += amount;
		System.out.println("\n money deposited succeffully ");
		notify();
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Customer cc = new Customer();
		new Thread() {
			public void run() {
				cc.WithdrawMoney(20000);
			};
		}.start();

		new Thread() {
			public void run() {
				cc.depositeMoney(15000);
			};
		}.start();
	}

}
