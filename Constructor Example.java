//within a constructor don't call other methods or setter
 // Initialization in one main constructor, other constructors call it for a less effect on fields
 
 public class VipCustomer {
	private String name;
	private double creditLim;
	private String Email;
	
	public VipCustomer(String name, double creditLim, String Email) {
		this.name = name;
		this.creditLim = creditLim;
		this.Email = Email;
 
	}
 
	// bottom two constructors call & use top one for initialization, second one sets default email, third one sets all dedault values
	public VipCustomer(String name, double creditLim) {
		this(name, creditLim, "unknown@email.com);
	}
	
	public VipCustomer() {
		this("Default name", 50000.00, "default@email.com");
	}
	
	
	
	// Getters
	public getName() {
		return this.name;
	}
	
	public getcreditLim() {
		return this.crditLim;
	}
	
	public getEmail() {
		return this.Email;
	}
 }