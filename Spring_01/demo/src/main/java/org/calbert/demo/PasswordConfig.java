package org.calbert.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PasswordConfig {
    private static final String ALPHA_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALPHA_UPPER = ALPHA_LOWER.toUpperCase();
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    @Bean
    PasswordAlphabet allCharacters() {
        return new PasswordAlphabet(ALPHA_LOWER + ALPHA_UPPER + NUMERIC + SPECIAL_CHARS);
    }


//    record PasswordAlphabet(String characters) {
//    }

    // Record class equal to the following code block
//    static class PasswordAlphabet {
//        private final String characters;
//
//        public PasswordAlphabet(String characters) {
//            this.characters = characters;
//        }
//
//        public String getCharacters() {
//            return characters;
//        }
//    }
}