package romanmufid.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "romanmufid.spring.core.configuration"
})
public class ScanConfiguration {
}
