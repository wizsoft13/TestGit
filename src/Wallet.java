import java.util.Arrays;
public class Wallet {
	private Card[] slot;
	

	public Wallet() {
		slot = new Card[2];
	}
	public void addCard(Card card) {
		if(slot[0]== null) {
			slot[0] = card;
		}
		else if(slot[1]== null) {
			slot[1] = card;
		}
		else {
			return;
		}
	}
	public String formatCard() {
		if(slot[0] == null && slot[1] ==null) {
			return "";
		}
		return "" + slot[0] + " | " + slot[1];
	}

}
