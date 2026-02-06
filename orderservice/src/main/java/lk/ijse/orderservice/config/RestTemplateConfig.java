package lk.ijse.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author manuthlakdiv
 * @email manuthlakdiv2006.com
 * @project e-commerce
 * @github https://github.com/ManuthLakdiw
 */

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
