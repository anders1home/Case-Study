package CaseStudy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class CaseStudy {

	public static void main(String [] args) {
		SpringApplication springApplication = new SpringApplication(CaseStudy.class);
		springApplication.run();
	}
}
