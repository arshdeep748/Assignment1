
public class Hospital extends Property
{

	private String status;
	private String facilities;
	private int numberOfFloors;
	
	public Hospital(String lotNumber, String statetGovernmentRegistrationIndex, String postalAddress, String postcode,
			double area, double siteValue, double capitalImprovedValue, double netAnnualValue, String valuationDate, String status, String facilities, int numberOfFloors) {
		super(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate);
		this.status = status;
		this.facilities = facilities;
		this.numberOfFloors = numberOfFloors;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	
	
	

}
