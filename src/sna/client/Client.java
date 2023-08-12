package sna.client;

public class Client {
    private String userName;
    private final boolean manager;

    public Client(String userName, boolean manager) {
        this.userName = userName;
        this.manager = manager;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isManager() {
        return manager;
    }
}
