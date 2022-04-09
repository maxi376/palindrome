public class PalindromePb {

	public static void main(String args[]) {
		int nr;
		int[] freq = new int[20];
		String s = "123321712344321";


		for (nr = 0; nr < s.length() - 1; nr++) {
			if (s.charAt(nr) == s.charAt(nr + 1)) {
				freq[nr] = checkPalindrom1(s, nr);
			} else if (nr - 1 >= 0)
				if (s.charAt(nr - 1) == (s.charAt(nr + 1))) {
					freq[nr] = checkPalindrom2(s, nr);
				}
		}

		for (int iterator = 0; iterator < 20; iterator++) {
			if (freq[iterator] != 0)
				System.out.println("For position: " + iterator + " we have a palindrome of length = " + freq[iterator]);
		}

	}

	public static int checkPalindrom1(String s, int nr) {
		int b = nr - 1;
		int c = nr + 2;
		int len = 2;
		while (b >= 0 && c < s.length()) {
			if (s.charAt(b) == s.charAt(c)) {
				++len;
				++len;
			}

			--b;
			++c;
			if (!(b >= 0 && c < s.length()))
				return len;
		}
		return len;
	}

	public static int checkPalindrom2(String s, int nr) {
		int b = nr - 2;
		int c = nr + 2;
		int len = 3;
		while (b >= 0 && c < s.length()) {
			if (s.charAt(b) == s.charAt(c)) {
				++len;
				++len;
			}

			--b;
			++c;
			if (!(b >= 0 && c < s.length()))
				return len;
		}
		return len;
	}
}
