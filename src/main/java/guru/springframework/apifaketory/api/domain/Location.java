package guru.springframework.apifaketory.api.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
public class Location implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postcode;
}
