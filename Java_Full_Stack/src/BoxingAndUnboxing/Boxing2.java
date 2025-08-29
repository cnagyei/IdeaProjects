/*
Only true or false
Implement the method toPrimitive(). It should take a value of Boolean type and return a boolean.
If the passed value is null, the result should be false.

Sample Input 1:
true

Sample Output 1:
true

Sample Input 2:
false

Sample Output 2:
false
 */
class MainBoxing2 {
    public static void main(String[] args) {
        boolean b = Boxing2.toPrimitive(Boolean.valueOf(false));
        System.out.println(b);

        Long longValue = Long.valueOf("2394");
        Long longValue2 = Long.parseLong("2394");
        System.out.println(longValue);

    }
}

class Boxing2 {
    public static boolean toPrimitive(Boolean b) {
        if (b == null){
            return false;
        } else {
            boolean b1 = b;
            return b1;
        }
    }
}