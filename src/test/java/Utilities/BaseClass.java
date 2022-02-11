package Utilities;

import net.bytebuddy.utility.RandomString;

public class BaseClass {

	public static String generateEmail() {
		RandomString random = new RandomString(3);
		String gmail = random.nextString() + "@gmail.com";
		return gmail;
	}
}
