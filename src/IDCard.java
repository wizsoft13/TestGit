
public class IDCard extends Card {
	private String name;
	private int idNumber;

	public IDCard(String name, int id) {
		super(name);
		this.idNumber = id;
	}
	public String format() {
		return super.format()+ " id: "+ this.idNumber;
		
	}

}
