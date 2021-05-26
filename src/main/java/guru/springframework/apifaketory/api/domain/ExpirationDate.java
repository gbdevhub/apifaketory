
package guru.springframework.apifaketory.api.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
public class ExpirationDate implements Serializable {

    private String date;
    private Integer timezoneType;
    private String timezone;
}
