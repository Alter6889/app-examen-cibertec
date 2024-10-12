package pe.edu.cibertec.app_examen_cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AppExamenCibertecApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppExamenCibertecApplication.class, args);
	}

}

