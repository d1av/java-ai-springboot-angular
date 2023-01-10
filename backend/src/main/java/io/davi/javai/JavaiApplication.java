package io.davi.javai;

import io.davi.javai.entity.requests.Url;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JavaiApplication  {

	public static void main(String[] args) {
		SpringApplication.run(JavaiApplication.class, args);
	}

}
