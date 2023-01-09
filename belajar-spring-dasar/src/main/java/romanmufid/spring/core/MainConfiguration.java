package romanmufid.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import romanmufid.spring.core.configuration.BarConfiguration;
import romanmufid.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
