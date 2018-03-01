package test.java.utilities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by rajivbhati on 2/27/18.
 */

@Configuration
@PropertySource(value = {
        "classpath:/properties/application-default.properties",
        "classpath:/properties/application-${environment}.properties"
})
public class PropertyHelper {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
