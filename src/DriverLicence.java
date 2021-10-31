import java.util.*;
public class DriverLicence extends IDCard {
	private String name;
	private int idNumber;
	private int expYear;

	public DriverLicence(String name, int id, int expYear) {
		super(name, id);
		this.expYear = expYear;
	}
	public String format() {
		return super.format()+ " expiring year: "+this.expYear; 
		
	}
	public boolean isExpired() {
		GregorianCalendar calendar = new GregorianCalendar();
		if(expYear < calendar.get(calendar.YEAR)) {
			return true;
		}
		else {
			return false;
		}
	}

}
