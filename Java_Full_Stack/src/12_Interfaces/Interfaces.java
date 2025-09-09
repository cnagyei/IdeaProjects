/*
If the modifiers are not specified once the method is declared, its parameters will be public abstract by default.
An interface can't contain constructors, non-public abstract methods, or any fields other than public static final (constants).
An interface is a special kind of class that cannot be instantiated. The main idea of an interface is declaring
functionality. Interfaces help to abstract from specific classes and emphasize functionality.
It makes software design more reusable and clean. It is a good practice to apply the so-called interface-oriented
design, which means that you should rely on interfaces instead of concrete implementations. To implement an interface,
the keyword implements is used.
 */
interface DrawingTool {
    public void draw(Curve curve);
}

class Curve {
    String name;

    public Curve(String name) {
        this.name = name;
    }
}

class Pencil implements DrawingTool {
    @Override
    public void draw(Curve curve) {
        System.out.println("Pencil");
    }
}

class Brush implements DrawingTool {
    @Override
    public void draw(Curve curve) {
        System.out.println("Brush");
    }
}

class MainInterface {
    public static void main(String[] args) {
        DrawingTool pencil = new Pencil();
        DrawingTool brush = new Brush();

        // Anonymous class
        DrawingTool brush2 = new DrawingTool() {
            @Override
            public void draw(Curve curve) {

            }
        };
    }
}