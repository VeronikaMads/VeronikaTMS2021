package p4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserAccountInfo {
    private String login;
    private String password;
    private String confirmPassword;

    public UserAccountInfo(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = cipherIt(password);
        this.confirmPassword = confirmPassword;
    }

    private String cipherIt(String password) {
        return "ciphered" + password;
    }
    public static String deCipherIt(String password) {
        return password.replaceAll("ciphered"," ");
    }
}


