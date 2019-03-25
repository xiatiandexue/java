import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"oxy"})
@SpringBootApplication

public class ExaminationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExaminationApplication.class, args);
	}

}
