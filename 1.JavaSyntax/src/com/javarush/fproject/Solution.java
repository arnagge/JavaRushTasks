package com.javarush.fproject;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static final List<Character> ALPHABET = Arrays.asList('а', 'б', 'в',
            'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' ');

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int shiftKey = scanner.nextInt();

        String encodeString = encode(input, shiftKey);
        System.out.println("Encoded string: " + encodeString);

        String decodeString = decode(encodeString, shiftKey);
        System.out.println("Decoded string: " + decodeString);
    }

    private static String encode(String str, int keyCode) {
        int lastIdx = ALPHABET.size() - 1;
        char[] inputChArray = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : inputChArray) {
            int idx = ALPHABET.indexOf(ch);

            if (idx != -1) {
                int toIdx = idx + keyCode;
                toIdx = toIdx > lastIdx ? toIdx - lastIdx - 1 : toIdx;

                stringBuilder.append(ALPHABET.get(toIdx));
            }
        }

        return stringBuilder.toString();
    }

    private static String decode(String str, int keyCode) {
        int lastIdx = ALPHABET.size() - 1;
        char[] inputChArray = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : inputChArray) {
            int idx = ALPHABET.indexOf(ch);

            if (idx != -1) {
                int toIdx = idx - keyCode;
                toIdx = toIdx < 0 ? lastIdx + 1 + toIdx : toIdx;

                stringBuilder.append(ALPHABET.get(toIdx));
            }
        }

        return stringBuilder.toString();
    }

}