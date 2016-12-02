package tpe.testate.crypter;

/**
 * Die Klasse implementiert das Interface Crypter. Texte werden mit der
 * speziellen TPE-Verschlüsselung verschlüsselt. Die Verschlüsselung
 * funktioniert so, dass bestimmte Zeichen durch andere ersetzt werden.
 *
 * Hierbei gilt die folgende Übersetzungstabelle:
 *
 * <code> e -> 3 3 -> e l -> 1 1 -> l o -> 0 0 -> o a -> 4 4 -> a t -> 7 7 -> t
 * 
 * @author b.collins
 *
 */
public class CrypterImpl implements Crypter {
	private char[] arrayHin = "abcdefghijklmnopqrstuvwxyz0123456789 ".toCharArray();
	private char[] arrayZurueck = "4bcd3fghijk1mn0pqrs7uvwxyzol2ea56t89 ".toCharArray();

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
		String output = "";
		for (int x = 0; x < input.length(); x++) {
			inner: for (int y = 0; y < arrayHin.length; y++) {
				if (input.charAt(x) == arrayHin[y]) {
					output = output + arrayZurueck[y];
					break inner;
				}
			}
		}
		return output;
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
		for (int x = 0; x < input.length(); x++) {
			inner: for (int y = 0; y < arrayHin.length; y++) {
				if (input.charAt(x) == arrayHin[y]) {
					break inner;
				} else if (y == arrayHin.length - 1) {
					throw new IllegalArgumentException();
				}
			}
		}
		return encrypt(input);

	}
}
