
public class WalletTester {

	public WalletTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		IDCard stCard = new IDCard("John", 17);
		CallingCard blue = new CallingCard("blue", 500, 12);
		Wallet wx = new Wallet();
		wx.addCard(stCard);
		wx.addCard(blue);
		DriverLicence dr = new DriverLicence("Jane", 22, 2020);
		System.out.println(dr.isExpired());
		System.out.println(wx.formatCard());
		
	}

}
