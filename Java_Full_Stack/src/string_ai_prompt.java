import java.util.Scanner;

class Encode {
    static void transform(String input) {
        if (input == null) {
            System.out.println("null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'a': case 'A': sb.append('1'); break;
                case 'e': case 'E': sb.append('2'); break;
                case 'i': case 'I': sb.append('3'); break;
                case 'o': case 'O': sb.append('4'); break;
                case 'u': case 'U': sb.append('5'); break;
                default: sb.append(c); break;
            }
        }
        System.out.println(sb.toString());
    }
}

class MainEncode {
    public static void main(String[] args) {
        Encode.transform("Discovery");
    }
}