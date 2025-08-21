import java.util.Arrays;

public class AccountGettersSetters {
    private long id;
    private String code;
    private long balance;
    private boolean enabled;

    // id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // balance
    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // enabled
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

class Account {
    public static void main(String[] args) {
        AccountGettersSetters account = new AccountGettersSetters();

        account.setId(2000);
        account.setCode("F100");
        account.setBalance(100_000_000);
        account.setEnabled(true);

        System.out.println(account.getId());
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
        System.out.println(account.isEnabled());
    }
}