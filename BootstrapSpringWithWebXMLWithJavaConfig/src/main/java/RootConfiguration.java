import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.kshrd","com.kshrd.kddkd"})
@EnableWebMvc
public class RootConfiguration {

}
