package guru.springframework.apifaketory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ApifaketoryApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApifaketoryApplication.class, args);
		log.info("Aplicação iniciada!!!");
	}

}
