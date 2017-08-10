package cl.gv.springboot.config.TestConfig;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableAutoConfiguration
@SpringBootApplication
public class TestConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestConfigApplication.class, args);
	}
}
