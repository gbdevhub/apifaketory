package guru.springframework.apifaketory.api.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
public class Name implements Serializable {
    private String title;
    private String first;
    private String last;
}
