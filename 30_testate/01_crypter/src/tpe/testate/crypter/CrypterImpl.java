package tpe.testate.crypter;

public class CrypterImpl implements Crypter {
	/**
	 * Verschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben, so
	 * werden diese in Kleinbuchstaben umgewandelt. Ungültige Zeichen werden
	 * ignoriert und nicht in den verschlüsselten Text übernommen.
	 *
	 * @param input
	 *            Text, der verschlüsselt werden soll.
	 * @return Verschlüsselter Text.
	 */
	public String encrypt(String input) {
		input = input.toLowerCase();
		char[] outputArray = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);
			switch (x) {
			case 'e':
				outputArray[i] = '3';
				break;
			case '3':
				outputArray[i] = 'e';
				break;
			case 'l':
				outputArray[i] = '1';
				break;
			case '1':
				outputArray[i] = 'l';
				break;
			case 'o':
				outputArray[i] = '0';
				break;
			case '0':
				outputArray[i] = 'o';
				break;
			case 'a':
				outputArray[i] = '4';
				break;
			case '4':
				outputArray[i] = 'a';
				break;
			case 't':
				outputArray[i] = '7';
				break;
			case '7':
				outputArray[i] = 't';
				break;
			// sdfg
			case 'b':
				outputArray[i] = input.charAt(i);
				break;
			case 'c':
				outputArray[i] = input.charAt(i);
				break;
			case 'd':
				outputArray[i] = input.charAt(i);
				break;
			case 'f':
				outputArray[i] = input.charAt(i);
				break;
			case 'g':
				outputArray[i] = input.charAt(i);
				break;
			case 'h':
				outputArray[i] = input.charAt(i);
				break;
			case 'i':
				outputArray[i] = input.charAt(i);
				break;
			case 'j':
				outputArray[i] = input.charAt(i);
				break;
			case 'k':
				outputArray[i] = input.charAt(i);
				break;
			case 'm':
				outputArray[i] = input.charAt(i);
				break;
			case 'n':
				outputArray[i] = input.charAt(i);
				break;
			case 'p':
				outputArray[i] = input.charAt(i);
				break;
			case 'q':
				outputArray[i] = input.charAt(i);
				break;
			case 'r':
				outputArray[i] = input.charAt(i);
				break;
			case 's':
				outputArray[i] = input.charAt(i);
				break;
			case 'u':
				outputArray[i] = input.charAt(i);
				break;
			case 'v':
				outputArray[i] = input.charAt(i);
				break;
			case 'w':
				outputArray[i] = input.charAt(i);
				break;
			case 'x':
				outputArray[i] = input.charAt(i);
				break;
			case 'y':
				outputArray[i] = input.charAt(i);
				break;
			case 'z':
				outputArray[i] = input.charAt(i);
				break;
			case '2':
				outputArray[i] = input.charAt(i);
				break;
			case '5':
				outputArray[i] = input.charAt(i);
				break;
			case '6':
				outputArray[i] = input.charAt(i);
				break;
			case '8':
				outputArray[i] = input.charAt(i);
				break;
			case '9':
				outputArray[i] = input.charAt(i);
				break;

			default:
				break;
			}
		}
		String outputString = new String(outputArray);
		return outputString;
	}

	/**
	 * Entschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
	 * oder andere ungültige Zeichen, so wirft die Methode eine Ausnahme.
	 *
	 * @param input
	 *            Text, der entschlüsselt werden soll.
	 * @return Entschlüsselter Text.
	 * @throws IllegalArgumentException
	 *             Wird geworfen, wenn die Eingabe ungültige Zeichen
	 *             (Großbuchstaben) enthält.
	 */
	public String decrypt(String input) throws IllegalArgumentException {
		char[] outputArray = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);
			switch (x) {
			case 'e':
				outputArray[i] = '3';
				break;
			case '3':
				outputArray[i] = 'e';
				break;
			case 'l':
				outputArray[i] = '1';
				break;
			case '1':
				outputArray[i] = 'l';
				break;
			case 'o':
				outputArray[i] = '0';
				break;
			case '0':
				outputArray[i] = 'o';
				break;
			case 'a':
				outputArray[i] = '4';
				break;
			case '4':
				outputArray[i] = 'a';
				break;
			case 't':
				outputArray[i] = '7';
				break;
			case '7':
				outputArray[i] = 't';
				break;
			case 'b':
				outputArray[i] = input.charAt(i);
				break;
			case 'c':
				outputArray[i] = input.charAt(i);
				break;
			case 'd':
				outputArray[i] = input.charAt(i);
				break;
			case 'f':
				outputArray[i] = input.charAt(i);
				break;
			case 'g':
				outputArray[i] = input.charAt(i);
				break;
			case 'h':
				outputArray[i] = input.charAt(i);
				break;
			case 'i':
				outputArray[i] = input.charAt(i);
				break;
			case 'j':
				outputArray[i] = input.charAt(i);
				break;
			case 'k':
				outputArray[i] = input.charAt(i);
				break;
			case 'm':
				outputArray[i] = input.charAt(i);
				break;
			case 'n':
				outputArray[i] = input.charAt(i);
				break;
			case 'p':
				outputArray[i] = input.charAt(i);
				break;
			case 'q':
				outputArray[i] = input.charAt(i);
				break;
			case 'r':
				outputArray[i] = input.charAt(i);
				break;
			case 's':
				outputArray[i] = input.charAt(i);
				break;
			case 'u':
				outputArray[i] = input.charAt(i);
				break;
			case 'v':
				outputArray[i] = input.charAt(i);
				break;
			case 'w':
				outputArray[i] = input.charAt(i);
				break;
			case 'x':
				outputArray[i] = input.charAt(i);
				break;
			case 'y':
				outputArray[i] = input.charAt(i);
				break;
			case 'z':
				outputArray[i] = input.charAt(i);
				break;
			case '2':
				outputArray[i] = input.charAt(i);
				break;
			case '5':
				outputArray[i] = input.charAt(i);
				break;
			case '6':
				outputArray[i] = input.charAt(i);
				break;
			case '8':
				outputArray[i] = input.charAt(i);
				break;
			case '9':
				outputArray[i] = input.charAt(i);
				break;

			default:
				throw new IllegalArgumentException("" + x);
				//break;
			}
		}
		String outputString = new String(outputArray);
		return outputString;

	}
}

