import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	private static Scanner sc = new Scanner(System.in);
	private DataInputStream dip = new DataInputStream(System.in);
	
	ArrayList<Property> propertyList = new ArrayList<Property>();
	
	public static void main(String[] args)
	{
		Driver driver = new Driver();
		driver.displayMessage();
		String selection  = "0";
		while(true)
		{
			driver.menuOption();
			System.out.print("Enter a selection(0-3): ");
			selection = sc.next();
			switch(selection)
			{
				case "1":
					driver.ratePayer();
					break;
				case "2":
					driver.ratePayer();
					break;
				case "3":
					driver.ratePayer();
					break;
				case "0":
					System.out.println("\nThank u for using it !!!");
					System.exit(0);
				default:
					System.out.println("ERROR: wrong selection, please try again");
					break;
			}
		}
		
	}	
	
	public void menuOption()
	{
		
		System.out.println("\nWhat would you like to do?");
		System.out.println("1. Add a Rate Payer");
		System.out.println("2. Add a Property");
		System.out.println("3. Calculate a Property Type's Yearly Rates Total");
		System.out.println("0. Exit Program");
		
	}
	
	
	public void ratePayer()
	{
		String selection  = "0";
		while(selection.equals("0"))
		{
			
			displayMessage();
			ratePayerMenuOption();
			System.out.print("Enter a selection(0-3): ");
			selection = sc.next();
			switch(selection)
			{
				case "1":
					residentailProperty();
					break;
				case "2":
					commercialProperty();
					break;
				case "3":
					vacantLandProperty();
					break;
				case "4":
					hospitalProperty();
					break;
				case "5":
					industrialProperty();
					break;
				case "6":
					schoolProperty();
					break;
				case "7":
					otherProperty();
					break;
				case "0":
					System.out.println("\nBack to Main Menu");
					selection = "1";
					break;
				default:
					System.out.println("ERROR: wrong selection, please try again");
					break;
			}
		}
		
	}
	
	public void displayMessage()
	{
		System.out.println("Council Rate Payer System");
		System.out.println("=========================");
	}
	
	public void ratePayerMenuOption()
	{
		System.out.println("CalculatePropertyTypeRates\n");
		
		System.out.println("What type of property are we dealing with?");
		System.out.println("1. Residential");
		System.out.println("2. Commercial");
		System.out.println("3. Vacant Land");
		System.out.println("4. Hospital");
		System.out.println("5. Industrial");
		System.out.println("6. School/Community");
		System.out.println("7. Other");
		System.out.println("0. To exit");
	}
	
	public void residentailProperty()
	{
		try {
			
			System.out.print("Enter alot number: ");
			String lotNumber = sc.next();
			
			System.out.print("Enter State Government Registration Number: ");
			String statetGovernmentRegistrationIndex = sc.next();
			
			System.out.print("Enter Postal Address: ");
			String postalAddress = dip.readLine();
			
			System.out.print("Enter Postal Code: ");
			String postcode = sc.next();
			
			System.out.println("Enter Area in square meter: ");
			double area = sc.nextDouble();
			
			System.out.print("Enter Site Value: ");
			double siteValue = sc.nextDouble();
			
			System.out.print("Enter CIV: ");
			double capitalImprovedValue = sc.nextDouble();
			
			System.out.print("Enter Net Annual Value: ");
			double netAnnualValue = sc.nextDouble();
			
			System.out.print("Enter Valuation Date(DD MM YYYY): ");
			String valuationDate = dip.readLine();
			
			System.out.print("Enter Type: ");
			String type= sc.next();
			
			System.out.print("Enter Architectural Style: ");
			String architecturalStyle = dip.readLine();
			
			Property property = new Residential(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate, type, architecturalStyle);
			propertyList.add(property);
			
			System.out.println("Residential Add Successfully !!!");
			
			
			
		}catch(Exception ex)
		{}
	}
	
	public void commercialProperty()
	{
		try {
			
			System.out.print("Enter alot number: ");
			String lotNumber = sc.next();
			
			System.out.print("Enter State Government Registration Number: ");
			String statetGovernmentRegistrationIndex = sc.next();
			
			System.out.print("Enter Postal Address: ");
			String postalAddress = dip.readLine();
			
			System.out.print("Enter Postal Code: ");
			String postcode = sc.next();
			
			System.out.println("Enter Area in square meter: ");
			double area = sc.nextDouble();
			
			System.out.print("Enter Site Value: ");
			double siteValue = sc.nextDouble();
			
			System.out.print("Enter CIV: ");
			double capitalImprovedValue = sc.nextDouble();
			
			System.out.print("Enter Net Annual Value: ");
			double netAnnualValue = sc.nextDouble();
			
			System.out.print("Enter Valuation Date(DD MM YYYY): ");
			String valuationDate = dip.readLine();
			
			System.out.print("Enter Business Name: ");
			String businessName= sc.next();
			
			System.out.print("Enter ABN: ");
			String ABN = dip.readLine();
			
			Property property = new Commercial(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate, businessName, ABN);
			propertyList.add(property);
			
			System.out.println("Commercial Add Successfully !!!");
			
			
			
		}catch(Exception ex)
		{}
	}
	
	public void vacantLandProperty()
	{
		try {
			
			System.out.print("Enter alot number: ");
			String lotNumber = sc.next();
			
			System.out.print("Enter State Government Registration Number: ");
			String statetGovernmentRegistrationIndex = sc.next();
			
			System.out.print("Enter Postal Address: ");
			String postalAddress = dip.readLine();
			
			System.out.print("Enter Postal Code: ");
			String postcode = sc.next();
			
			System.out.println("Enter Area in square meter: ");
			double area = sc.nextDouble();
			
			System.out.print("Enter Site Value: ");
			double siteValue = sc.nextDouble();
			
			System.out.print("Enter CIV: ");
			double capitalImprovedValue = sc.nextDouble();
			
			System.out.print("Enter Net Annual Value: ");
			double netAnnualValue = sc.nextDouble();
			
			System.out.print("Enter Valuation Date(DD MM YYYY): ");
			String valuationDate = dip.readLine();
			
			System.out.print("Enter Overlay: ");
			String overlay= sc.next();
			
			Property property = new VacantLand(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate, overlay);
			propertyList.add(property);
			
			System.out.println("Vacant Land Add Successfully !!!");
			
			
			
		}catch(Exception ex)
		{}
	}
	
	public void hospitalProperty()
	{
		try {
			
			System.out.print("Enter alot number: ");
			String lotNumber = sc.next();
			
			System.out.print("Enter State Government Registration Number: ");
			String statetGovernmentRegistrationIndex = sc.next();
			
			System.out.print("Enter Postal Address: ");
			String postalAddress = dip.readLine();
			
			System.out.print("Enter Postal Code: ");
			String postcode = sc.next();
			
			System.out.println("Enter Area in square meter: ");
			double area = sc.nextDouble();
			
			System.out.print("Enter Site Value: ");
			double siteValue = sc.nextDouble();
			
			System.out.print("Enter CIV: ");
			double capitalImprovedValue = sc.nextDouble();
			
			System.out.print("Enter Net Annual Value: ");
			double netAnnualValue = sc.nextDouble();
			
			System.out.print("Enter Valuation Date(DD MM YYYY): ");
			String valuationDate = dip.readLine();
			
			System.out.print("Enter Status: ");
			String status = sc.next();
			
			System.out.print("Enter Facilities: ");
			String facilities = dip.readLine();
			
			System.out.print("Enter number of floors: ");
			int numberOfFloors = sc.nextInt();
			
			Property property = new Hospital(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate, status, facilities, numberOfFloors);
			propertyList.add(property);
			
			System.out.println("Hospital Add Successfully !!!");
			
			
			
		}catch(Exception ex)
		{}
	}
	
	
	public void industrialProperty()
	{
		try {
			
			System.out.print("Enter alot number: ");
			String lotNumber = sc.next();
			
			System.out.print("Enter State Government Registration Number: ");
			String statetGovernmentRegistrationIndex = sc.next();
			
			System.out.print("Enter Postal Address: ");
			String postalAddress = dip.readLine();
			
			System.out.print("Enter Postal Code: ");
			String postcode = sc.next();
			
			System.out.println("Enter Area in square meter: ");
			double area = sc.nextDouble();
			
			System.out.print("Enter Site Value: ");
			double siteValue = sc.nextDouble();
			
			System.out.print("Enter CIV: ");
			double capitalImprovedValue = sc.nextDouble();
			
			System.out.print("Enter Net Annual Value: ");
			double netAnnualValue = sc.nextDouble();
			
			System.out.print("Enter Valuation Date(DD MM YYYY): ");
			String valuationDate = dip.readLine();
			
			System.out.print("Enter Hazard Status: ");
			String hazardStatus = dip.readLine();
			
			System.out.print("Enter Heavy Vehicle Status: ");
			String heavyVehicleStatus = dip.readLine();
			
			Property property = new Industrial(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate, hazardStatus, heavyVehicleStatus);
			propertyList.add(property);
			
			System.out.println("Industrial Add Successfully !!!");
			
			
			
		}catch(Exception ex)
		{}
	}
	
	public void schoolProperty()
	{
		try {
			
			System.out.print("Enter alot number: ");
			String lotNumber = sc.next();
			
			System.out.print("Enter State Government Registration Number: ");
			String statetGovernmentRegistrationIndex = sc.next();
			
			System.out.print("Enter Postal Address: ");
			String postalAddress = dip.readLine();
			
			System.out.print("Enter Postal Code: ");
			String postcode = sc.next();
			
			System.out.println("Enter Area in square meter: ");
			double area = sc.nextDouble();
			
			System.out.print("Enter Site Value: ");
			double siteValue = sc.nextDouble();
			
			System.out.print("Enter CIV: ");
			double capitalImprovedValue = sc.nextDouble();
			
			System.out.print("Enter Net Annual Value: ");
			double netAnnualValue = sc.nextDouble();
			
			System.out.print("Enter Valuation Date(DD MM YYYY): ");
			String valuationDate = dip.readLine();
			
			System.out.print("Enter Classification: ");
			String classification = dip.readLine();
			
			Property property = new School(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate, classification);
			propertyList.add(property);
			
			System.out.println("School Add Successfully !!!");
			
			
			
		}catch(Exception ex)
		{}
	}
	
	
	public void otherProperty()
	{
		try {
			
			System.out.print("Enter alot number: ");
			String lotNumber = sc.next();
			
			System.out.print("Enter State Government Registration Number: ");
			String statetGovernmentRegistrationIndex = sc.next();
			
			System.out.print("Enter Postal Address: ");
			String postalAddress = dip.readLine();
			
			System.out.print("Enter Postal Code: ");
			String postcode = sc.next();
			
			System.out.println("Enter Area in square meter: ");
			double area = sc.nextDouble();
			
			System.out.print("Enter Site Value: ");
			double siteValue = sc.nextDouble();
			
			System.out.print("Enter CIV: ");
			double capitalImprovedValue = sc.nextDouble();
			
			System.out.print("Enter Net Annual Value: ");
			double netAnnualValue = sc.nextDouble();
			
			System.out.print("Enter Valuation Date(DD MM YYYY): ");
			String valuationDate = dip.readLine();
			
			System.out.print("Enter Special Description: ");
			String specialDesc = dip.readLine();
			
			Property property = new Other(lotNumber, statetGovernmentRegistrationIndex, postalAddress, postcode, area, siteValue, capitalImprovedValue, netAnnualValue, valuationDate, specialDesc);
			propertyList.add(property);
			
			System.out.println("Other Add Successfully !!!");
			
		}catch(Exception ex)
		{}
	}
	
}
