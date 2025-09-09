/*
Resolve a diamond problem
Resolve a diamond problem of ConsoleWriter class. Override greeting method according to Printer
interface implementation. Try to avoid code duplication.
 */
class ConsoleWriter implements Printer, Notifier {
    // override greeting method according to Printer default implementation
    public void greeting() {
        Printer.super.greeting();
    }
}

interface Printer {
    default void greeting() {
        System.out.println("Printer is ready");
    }
}

interface Notifier {
    default void greeting() {
        System.out.println("Notifier is ready");
    }
}