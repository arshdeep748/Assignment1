
public class Residential extends Property
{

	private String type;
	private String architecturalStyle;
	
	public Residential(String lotNumber, String statetGovernmentRegistrationIndex, String postalAddress, String postcode,
			double area, double siteValue, double capitalImprovedValue, double netAnnualValue, String valuationDate, String type, String architecturalStyle) {
		super(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate);
		this.type = type;;
		this.architecturalStyle = architecturalStyle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getArchitecturalStyle() {
		return architecturalStyle;
	}

	public void setArchitecturalStyle(String architecturalStyle) {
		this.architecturalStyle = architecturalStyle;
	}
	
	
	
}
