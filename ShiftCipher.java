package Ciphers;

/**
 * ShiftCipher
 * 
 * PlainText:
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Nunc interdum lacus porta consequat finibus.
 * Duis nec suscipit urna.
 * Pellentesque quis libero faucibus, cursus lectus ut, convallis nibh.
 * Aliquam at eleifend nisi. Etiam mattis dolor sed nisi luctus, non tempus
 * magna cursus.
 * Fusce faucibus erat sit amet semper elementum.
 * Suspendisse pharetra orci porta malesuada sollicitudin.
 * Nullam tincidunt ex ante, in commodo mauris finibus quis.
 * Etiam nec ligula eu odio tempor pharetra sit amet quis elit.
 * Mauris nibh arcu, interdum nec malesuada vel, varius vitae elit.
 * Sed pretium, tellus et commodo malesuada, lorem elit tincidunt tellus, quis
 * scelerisque mauris sem at ante.
 * Maecenas dignissim velit vel blandit imperdiet.
 * 
 * 
 * 
 */
public class ShiftCipher {

    public static void main(String[] args) {
        final String[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".split("");
        final int SHIFT_AMOUNT = Integer.parseInt("3") % 26;
        String plain_text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc interdum lacus porta consequat finibus. Duis nec suscipit urna. Pellentesque quis libero faucibus, cursus lectus ut, convallis nibh. Aliquam at eleifend nisi. Etiam mattis dolor sed nisi luctus, non tempus magna cursus. Fusce faucibus erat sit amet semper elementum. Suspendisse pharetra orci porta malesuada sollicitudin. Nullam tincidunt ex ante, in commodo mauris finibus quis. Etiam nec ligula eu odio tempor pharetra sit amet quis elit. Mauris nibh arcu, interdum nec malesuada vel, varius vitae elit. Sed pretium, tellus et commodo malesuada, lorem elit tincidunt tellus, quis scelerisque mauris sem at ante. Maecenas dignissim velit vel blandit imperdiet.";
        String[] plain_text_array = plain_text.toLowerCase().split("");
        String cipher_text = "";
        for (int i = 0; i < plain_text_array.length; i++) {
            for (int j = 0; j < ALPHABET.length; j++) {
                if (plain_text_array[i].equals(ALPHABET[j])) {
                    cipher_text += ALPHABET[(j+SHIFT_AMOUNT) %26];
                    break;
                }
            }
        }
        System.out.println(cipher_text);
    }
}