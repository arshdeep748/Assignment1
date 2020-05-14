
public abstract class Property {

	private String lotNumber;
	private String statetGovernmentRegistrationIndex;
	private String postalAddress;
	private String postcode;
	private double area;
	private double siteValue;
	private double capitalImprovedValue;
	private double netAnnualValue;
	private String valuationDate;
	
	public Property(String lotNumber, String statetGovernmentRegistrationIndex, String postalAddress, String postcode,
			double area, double siteValue, double capitalImprovedValue, double netAnnualValue, String valuationDate) {
		super();
		this.lotNumber = lotNumber;
		this.statetGovernmentRegistrationIndex = statetGovernmentRegistrationIndex;
		this.postalAddress = postalAddress;
		this.postcode = postcode;
		this.area = area;
		this.siteValue = siteValue;
		this.capitalImprovedValue = capitalImprovedValue;
		this.netAnnualValue = netAnnualValue;
		this.valuationDate = valuationDate;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getStatetGovernmentRegistrationIndex() {
		return statetGovernmentRegistrationIndex;
	}

	public void setStatetGovernmentRegistrationIndex(String statetGovernmentRegistrationIndex) {
		this.statetGovernmentRegistrationIndex = statetGovernmentRegistrationIndex;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getSiteValue() {
		return siteValue;
	}

	public void setSiteValue(double siteValue) {
		this.siteValue = siteValue;
	}

	public double getCapitalImprovedValue() {
		return capitalImprovedValue;
	}

	public void setCapitalImprovedValue(double capitalImprovedValue) {
		this.capitalImprovedValue = capitalImprovedValue;
	}

	public double getNetAnnualValue() {
		return netAnnualValue;
	}

	public void setNetAnnualValue(double netAnnualValue) {
		this.netAnnualValue = netAnnualValue;
	}

	public String getValuationDate() {
		return valuationDate;
	}

	public void setValuationDate(String valuationDate) {
		this.valuationDate = valuationDate;
	}  

	

	
	
}
