package uniform.sierra.hellospringboot;

import java.io.IOException;
import java.time.Clock;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class ApplicationConfig {
    @Autowired
    private ResourcePatternResolver resourceResolver;

    /** Dozer bean mapper
     * @throws IOException Some I/O error occured.
     */
    @Bean
    public DozerBeanMapperFactoryBean beanMapper() throws IOException {
        DozerBeanMapperFactoryBean mapperFactory = new DozerBeanMapperFactoryBean();
        mapperFactory
                .setMappingFiles(resourceResolver.getResources("classpath*:/dozer/**/*-mapping.xml"));
        return mapperFactory;
    }

    @Bean
    public Clock systemClock() {
        return Clock.systemDefaultZone();
    }
}
