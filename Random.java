package com.deloitte;

public class Random {

	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();

		String[] article = { "the", "a", "one", "some" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };

		for (int i = 0; i < 20; i++) {
			System.out.println(Capitalize(article[r.nextInt(4)]) + " " + noun[r.nextInt(5)] + " " + verb[r.nextInt(5)]
					+ " " + preposition[r.nextInt(5)] + " " + article[r.nextInt(4)] + " " + noun[r.nextInt(4)] + ".");

		}

	}

	private static String Capitalize(String string) {
		string = string.substring(0, 1).toUpperCase() + string.substring(1);
		return string;
	}

}
