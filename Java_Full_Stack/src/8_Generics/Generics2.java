class MainImmutableArray {
    public static void main(String[] args) {
        String[] strings = new String[] {"Apple", "Pie", "Corander"};
        var stringArray = new ImmutableArray<>(strings);
        System.out.println("Instance String: " + stringArray.getItems(2));
        strings[2] = "Sofo";
        System.out.println("Original String: " + strings[2]);
        System.out.println("Instance String: " + stringArray.getItems(2));
    }
}

class ImmutableArray<T> {
    T[] items;

    public ImmutableArray(T[] items) {
        this.items = items;
    }

    public T getItems(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}