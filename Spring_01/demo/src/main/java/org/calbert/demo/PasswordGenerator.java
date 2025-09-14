package org.calbert.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {
    private static final Random random = new Random();
    private final PasswordAlphabet alphabet;

    public PasswordGenerator(@Autowired PasswordAlphabet alphabet) {
        this.alphabet = alphabet;
    }

    public String generate(int length) {
        String allCharacters = alphabet.characters();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            result.append(allCharacters.charAt(index));
        }
        return result.toString();
    }
}
