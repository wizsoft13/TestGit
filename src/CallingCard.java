
public class CallingCard extends Card {
	private String name;
	private int cardNumber;
	private int pin;

	public CallingCard(String name, int cardNumber, int pin) {
		super(name);
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	public String format() {
		
		return super.format() + " card number: "+ this.cardNumber+ " pin: " + this.pin;
		
	}

}
