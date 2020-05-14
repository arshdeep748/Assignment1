
public class Industrial extends Property{

	private String hazardStatus;
	private String heavyVehicleStatus;
	
	public Industrial(String lotNumber, String statetGovernmentRegistrationIndex, String postalAddress, String postcode,
			double area, double siteValue, double capitalImprovedValue, double netAnnualValue, String valuationDate, String hazardStatus, String heavyVehicleStatus) {
		super(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate);
		this.hazardStatus = hazardStatus;
		this.heavyVehicleStatus = heavyVehicleStatus;
	}

	public String getHazardStatus() {
		return hazardStatus;
	}

	public void setHazardStatus(String hazardStatus) {
		this.hazardStatus = hazardStatus;
	}

	public String getHeavyVehicleStatus() {
		return heavyVehicleStatus;
	}

	public void setHeavyVehicleStatus(String heavyVehicleStatus) {
		this.heavyVehicleStatus = heavyVehicleStatus;
	}
	
	

	
	
}
