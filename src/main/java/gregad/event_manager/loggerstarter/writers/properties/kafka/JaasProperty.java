package gregad.event_manager.loggerstarter.writers.properties.kafka;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Greg Adler
 */
@ConfigurationProperties(prefix = "spring.kafka.properties.sasl.jaas")
@Setter
@Getter
public class JaasProperty {
    private String config;
}
