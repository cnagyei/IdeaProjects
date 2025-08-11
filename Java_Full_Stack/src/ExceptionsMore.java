class mainExceptionsMore {
    public static void main(String[] args) {

        try {
            String s = null;
            char ch = s.charAt(10);
            System.out.println(ch);
        } catch (RuntimeException e) {
            System.out.println("A Runtime Exception ocurred");
        } catch (Exception e) {
            System.out.println("An exception ocurred");
        } finally {
            System.out.println("Finally");
        }
    }
}