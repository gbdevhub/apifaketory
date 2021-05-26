package guru.springframework.apifaketory.api.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
public class Login implements Serializable {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
}
