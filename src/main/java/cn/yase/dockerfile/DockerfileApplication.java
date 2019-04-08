package cn.yase.dockerfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerfileApplication {

	@GetMapping("/")
	public String hello(){
		return "hello docker!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerfileApplication.class, args);
	}

}
