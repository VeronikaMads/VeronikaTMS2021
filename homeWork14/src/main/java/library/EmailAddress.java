package library;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// - EmailAddress  с полями электронный адрес, дополнительная информация
public class EmailAddress {
    private String email;
    private String information;

    public EmailAddress(String email) {
        this.email = email;
    }
}
