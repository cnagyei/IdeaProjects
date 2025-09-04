/*
Creating a closure
 Report a typo
Write a lambda expression that takes a single String argument, removes all whitespaces on its both ends and
adds PREFIX (before) and SUFFIX (after) to it. PREFIX and SUFFIX are final variables provided in the code template.
 */
import java.util.function.UnaryOperator;

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = argument -> PREFIX + argument.trim() + SUFFIX;
}