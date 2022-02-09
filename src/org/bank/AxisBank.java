package org.bank;

public class AxisBank extends BankInfo {
            
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
	    AxisBank a = new AxisBank();
	    a.Deposit("Parthi", 80000l);
	    
	    }
}
