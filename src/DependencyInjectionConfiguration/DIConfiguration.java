package DependencyInjectionConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import service.EmailService;
import service.MessageService;
import service.TwitterService;

@Configuration
@ComponentScan(value= {"componentApplication"})
public class DIConfiguration {
	
	@Bean
	public MessageService gerMessageSevice(){
		return new EmailService();
		
	}

}
