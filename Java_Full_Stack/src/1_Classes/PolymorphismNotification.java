class MainNotification {
    public static void main(String[] args) {
        Notification notif = new Notification("No problems");
        Notification warning = new Warning("Money ends");
        Notification alarm = new Alarm("The ship sank");

        alarm.getMsg();
        notif.showMsg();
        warning.showMsg();
    }
}

class Notification {
    protected String msg;

    public Notification(String msg) {
    }

    public void showMsg() {
        System.out.println(getMsg());
    }
    public String getMsg() {
        return msg;
    }
}

class Warning extends Notification {
    public Warning(String msg) {
        super(msg);
    }

    @Override
    public String getMsg() {
        return "WARN: " + msg;
    }
}

class Alarm extends Notification {
    public Alarm(String msg) {
        super(msg);
    }

    @Override
    public void showMsg() {
        System.out.println("ALARM: " + msg);
    }
}