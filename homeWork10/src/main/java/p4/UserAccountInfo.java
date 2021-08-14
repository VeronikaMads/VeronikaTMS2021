package p4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserAccountInfo implements MethodicalAuthorization {
    private String login;
    private String password;
    private String confirmPassword;

    public UserAccountInfo(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = cipherIt(password);
        this.confirmPassword = confirmPassword;
    }

    //шифровщик. Нужен ли он ?
    private String cipherIt(String password) {
        return "ciphered" + password;
    }

    //дешифровщик
    public static String deCipherIt(String password) {
        return password.replaceAll("ciphered", " ");
    }

    @Override
    public void checkLogin() {

    }

    @Override
    public void checkupPassword() {

    }

    @Override
    public void checkpointPassword(String password) {

    }
}


