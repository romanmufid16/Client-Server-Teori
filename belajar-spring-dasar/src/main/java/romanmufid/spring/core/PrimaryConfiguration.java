package romanmufid.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import romanmufid.spring.core.data.Foo;

/**
 *
 * @author Acer
 */
public class PrimaryConfiguration {
    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }
    
    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
