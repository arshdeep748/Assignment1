
public class Commercial extends Property
{
	
	private String businessName;
	private String ABN;
	
	public Commercial(String lotNumber, String statetGovernmentRegistrationIndex, String postalAddress, String postcode,
			double area, double siteValue, double capitalImprovedValue, double netAnnualValue, String valuationDate, String businessName, String ABN) {
		super(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate);
		this.businessName = businessName;
		this.ABN = ABN;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getABN() {
		return ABN;
	}

	public void setABN(String aBN) {
		ABN = aBN;
	}
	
	
	
}
