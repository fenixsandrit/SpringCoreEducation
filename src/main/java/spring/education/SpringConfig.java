package spring.education;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("spring.education")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
