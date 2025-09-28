import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MainCoin {
    public static void main(String[] args) {

        Coin big = new Coin(25, 2006);
        Coin medium1 = new Coin(45, 2016);
        Coin medium2 = new Coin(3, 2001);
        Coin small = new Coin(467, 2000);

        List<Coin> coins = new ArrayList<>();
        coins.add(big);
        coins.add(medium1);
        coins.add(medium2);
        coins.add(small);

        System.out.println(coins);
        Collections.sort(coins);
        coins.forEach(System.out::println);
    }


}

public class Coin implements Comparable<Coin>{
    public final int nominalValue;
    public final int mintYear;

    public Coin(int nominalValue, int mintYear) {
        this.nominalValue = nominalValue;
        this.mintYear = mintYear;
    }

    @Override
    public int compareTo(Coin coin) {
        if (nominalValue == coin.nominalValue) {
            return 0;
        } else if (nominalValue > coin.nominalValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Coin{nominal=" + nominalValue + ", year=" + mintYear + "}";
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Coin coin = (Coin) that;
        return nominalValue == coin.nominalValue;
    }

    // getters, setters, hashCode and toString
}
