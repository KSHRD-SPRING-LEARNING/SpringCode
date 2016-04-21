import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfiguration {

	@Bean
	public HomeController homeController(){
		return new HomeController();
	}
}
