package uniform.sierra.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "uniform.sierra.hellospringboot" })
public class SpringBootTutorialApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApp.class, args);
    }
}
