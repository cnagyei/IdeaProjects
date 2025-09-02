/*
The most commonly used type parameter names are:

T – Type
S, U, V etc. – 2nd, 3rd, 4th types
E – Element (used extensively by different collections)
K – Key
V – Value
N – Number
 */
class MainGeneric {
    public static void main(String[] args) {

        GenericType<Integer> obj1 = new GenericType<Integer>(100);
        GenericType<String> obj2 = new GenericType<String>("I'm a string");
        GenericType<Character> obj3 = new GenericType<>('A');
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println(obj1.getT());
        System.out.println(obj2.getT());
        System.out.println(obj3.getT());

        System.out.println(obj1.setT(300));
        System.out.println(obj2.setT("Abenaa"));
        System.out.println(obj3.setT('K'));

        System.out.println("---- Key-Value ----");

        Pair<String, Integer> keyValue = new Pair<>("Name", 34);
        System.out.println(keyValue.key);
        System.out.println(keyValue.value);

        Pair<Double, Character> constant = new Pair<>(3.14, 'P');
        System.out.println(constant.key);
        System.out.println(constant.value);

    }
}

class GenericType<T> {
    private T t;

    public GenericType(T t) {
        this.t =t;
    }

    public T getT() {
        return t;
    }

    public T setT(T t) {
        this.t = t;
        return t;
    }
}

class Three<T, U, V> {
    T t;
    U u;
    V v;

    public Three() {
    }
    public Three(T t, U u, V v) {
        this.t = t;
        this.u = u;
        this.v = v;
    }
}

class Pair<K, V> {
    K key;
    V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}