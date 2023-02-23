package tech.java;

public class This_Roadways2 {
	String BusName;
	String CompanyName;
	
	public This_Roadways2 () {
		System.out.println("BEST TRANSPORT");
	}
	
	public This_Roadways2(String BusName,String CompanyName) {
		this();
		this.BusName = BusName;
		this.CompanyName = CompanyName;
		
		System.out.println("NAME OF BUS : " + BusName);
		System.out.println("NAME OF COMPANY : " + CompanyName);
	}

}
