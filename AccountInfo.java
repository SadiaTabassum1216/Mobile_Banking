package banking;

public class AccountInfo {
	 	private String name;
	    private String phone_number;
	    private double balance;
	    private String pin;
	    
//Constructor with pin number	    
	    public AccountInfo(String name, String number,double balance, String pin){
	        this.name = name;
	        this.phone_number = number;
	        this.balance=balance;
	        this.pin = pin;
	    }

//Constructor without pin number	    
	  	    public AccountInfo(String name, String number,double balance){
	  	        this.name = name;
	  	        this.phone_number = number;
	  	        this.balance=balance;
	  	    }

//to print information
	  	    void displayInfo() {
	  	    	System.out.println("Name: "+name);
	  	    	System.out.println("Number: "+phone_number);
	  	    	System.out.println("Balance: "+ balance);
	  	    	//System.out.println("Pin: "+pin);
	  	    	System.out.println("\n");
	  	    }
	  	    
//Add money
	  	  public void add_money(double amount){
	          this.balance += amount;
	          System.out.println("Add money: " + amount);
	          System.out.println("Current balance: "+ balance);
	          System.out.println("\n");
	      }

//Cash out
	  	  public void cash_out(double amount, String pin){
	  		  
	  	  if (pin != this.pin){
	              System.out.println("Pin does not match.\n");
	              return;
	          }
	          else{
	              if (balance >= amount){
	                  balance -= amount;
	                  System.out.println("Cash out: " + amount);
	    	          System.out.println("Current balance: "+ balance);
	    	          System.out.println("\n");
	              }

	              else {
	                  System.out.println("Failed to cash out due to balance limit.\n");
	              }
	          }
	      }

//Cashout without pin
	  	 public void cash_out(double amount){  
	  		 if(pin==null) {
	  			 System.out.println("Please set your pin first.");	 
	  		 }
	  	 }
		  
	  	 
//set pin
	  	 public void pin_set(String pin_code) {
	  		 this.pin=pin_code;
	  		 System.out.println("Pin updated.\n");
	  	 }

}
