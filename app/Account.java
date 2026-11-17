public class Account {

    public final String username;
    public String displayName;
    private String password;
    private static int userCount = 0;

    Account(String username, String displayName, String password) {

        this.username = username;
        this.displayName = displayName;
        this.password = password;
        userCount++;
        System.out.println(Account.userCount);
    }

}
