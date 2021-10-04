package constructorsBankAcountChallenge;

public class VipCustomer {
	
    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.
	
	private String vipName;
	private double creditLimit;
	private String vipEmailAddress;
	
	
	public VipCustomer() {
		this("Default name", 50000.00, "default@mail.com");
	}
	
	public VipCustomer(String vipName, double creditLimit) {
		super();
		this.vipName = vipName;
		this.creditLimit = creditLimit;
	}

	public VipCustomer(String vipName, double creditLimit, String vipEmailAddress) {
		this.vipName = vipName;
		this.creditLimit = creditLimit;
		this.vipEmailAddress = vipEmailAddress;
	}
	
	public String getVipName() {
		return vipName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getVipEmailAddress() {
		return vipEmailAddress;
	}
	
	
	
	

}
