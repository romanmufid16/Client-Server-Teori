package romanmufid.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import romanmufid.spring.core.data.Foo;

/**
 *
 * @author Acer
 */
@Configuration
public class DuplicateBeanConfiguration {

    @Bean
    public Foo foo1(){
        return new Foo();
    }
    
    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
