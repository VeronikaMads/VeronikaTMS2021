import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MilitaryOffice {

    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }
}


