package org.bank;

public class BankInfo {

	    public void Saving(String Accname, long saving) {
		    System.out.println("Account name:"+Accname);
		    System.out.println("Saving amount:"+saving);
		}
		
	    public void Deposit(String Accname, long deposit) {
		    System.out.println("Account name:"+Accname);
		    System.out.println("Deposit amount:"+deposit);
		}
			
	    public void Fixed(String Accname, long fixed) {
		    System.out.println("Account name:"+Accname);
		    System.out.println("Fixed Deposit amount:"+fixed);
		}
	    
	    public static void main(String[]args) {
	    BankInfo b = new BankInfo();
	    b.Deposit("Parthi", 70000l);
	    b.Saving("Sunil", 60000l);
	    b.Fixed("Edwin", 100000l);
	    }

}