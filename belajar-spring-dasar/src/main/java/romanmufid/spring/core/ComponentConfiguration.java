package romanmufid.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import romanmufid.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "romanmufid.spring.core.repository",
    "romanmufid.spring.core.service",
    "romanmufid.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
