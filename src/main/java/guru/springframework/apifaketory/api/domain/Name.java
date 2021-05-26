package guru.springframework.apifaketory.api.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by deinf.escalda on 26/05/2021.
 */
@Slf4j
@Data
public class Name {
    private String title;
    private String first;
    private String last;
}
