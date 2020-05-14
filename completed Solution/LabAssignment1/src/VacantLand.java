
public class VacantLand extends Property
{
	private String overlay;

	public VacantLand(String lotNumber, String statetGovernmentRegistrationIndex, String postalAddress, String postcode,
			double area, double siteValue, double capitalImprovedValue, double netAnnualValue, String valuationDate, String overlay) {
		super(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate);
		this.overlay = overlay;
	}

	public String getOverlay() {
		return overlay;
	}

	public void setOverlay(String overlay) {
		this.overlay = overlay;
	}
	
	

}
