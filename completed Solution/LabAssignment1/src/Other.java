
public class Other extends Property{

	private String specialDesc;
	
	public Other(String lotNumber, String statetGovernmentRegistrationIndex, String postalAddress, String postcode,
			double area, double siteValue, double capitalImprovedValue, double netAnnualValue, String valuationDate, String specialDesc) {
		super(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate);
		this.specialDesc = specialDesc;
	}

	public String getSpecialDesc() {
		return specialDesc;
	}

	public void setSpecialDesc(String specialDesc) {
		this.specialDesc = specialDesc;
	}
	
}
