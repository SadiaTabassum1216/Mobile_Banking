package banking;

public class TestCase {
	public void start_banking(){
	AccountInfo Sadia = new AccountInfo("Sadia", "01627652864",2000, "1234" );
	Sadia.displayInfo();
	
	
    AccountInfo Turna = new AccountInfo("Turna", "01716459944",0);
    Turna.displayInfo();
    
 //add money and cash out with pin
    System.out.println("\nBanking Information for Sadia: ");
    Sadia.add_money(1500);
    Sadia.cash_out(200,"6e56");
    Sadia.cash_out(3000,"1234");
    Sadia.cash_out(1000,"1234");
    
    
    
 //add money and cash out without pin
    System.out.println("\nBanking Information for Turna: ");
    Turna.add_money(1000);
    Turna.cash_out(500);
    Turna.pin_set("5678");
    Turna.cash_out(500,"46578");
    Turna.cash_out(400,"5678");
	
	}
}
