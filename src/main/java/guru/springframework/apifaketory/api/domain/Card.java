package guru.springframework.apifaketory.api.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
public class Card  implements Serializable {
    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
}
