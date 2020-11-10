
public class Magic8BallApp {

	public static void main(String[] args) {

		int randomNumber1To8 = fetchRandomNumber(1, 8);

		// testRandomCreate1To8();

		String messageForUser = fetchMessageFromNumber(randomNumber1To8);
		System.out.println("Message for you:  " + messageForUser);

	}

	private static String fetchMessageFromNumber(int randomNumber1To8) {

		String messageReturned = "default message";

		if (randomNumber1To8 == 1) {
			messageReturned = "message1:  have a nice day";
		} else if (randomNumber1To8 == 2) {
			messageReturned = "message2: have a nice life";

		} else if (randomNumber1To8 == 3) {
			messageReturned = "message3:  have a nice week";
		} else if (randomNumber1To8 == 4) {
			messageReturned = "message4:  have a nice hour";
		} else if (randomNumber1To8 == 5) {
			messageReturned = "message5: have a nice minute";
		} else if (randomNumber1To8 == 6) {
			messageReturned = "message6: have a nice event";
		} else if (randomNumber1To8 == 7) {
			messageReturned = "message7:  have a nice trip";
		} else if (randomNumber1To8 == 8) {
			messageReturned = "message8:  have a nice TV watching";
		} else {
			messageReturned = "error";
		}

		return messageReturned;
	}

	private static void testRandomCreate1To8() {
		for (int i = 1; i < 100; i++) {
			System.out.println("for i is:  " + i + "answer is:  " + fetchRandomNumber(1, 8));
		}

	}

	private static int fetchRandomNumber(int min, int max) {
		// TODO Auto-generated method stub
		max = max + 1;
		double doubleVersion = (Math.random() * (max - min) + min);

		return (int) doubleVersion;
	}

}
