package romanmufid.spring.core.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import romanmufid.spring.core.aware.IdAware;


@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor , Ordered {

  @Override
  public int getOrder() {
    return 2;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("Prefix Id Generator Processor for Bean {}", beanName);
    if(bean instanceof IdAware){
      log.info("Prefix Set Id Generator for Bean {}", beanName);
      IdAware idAware = (IdAware) bean;
      idAware.setId("PZN-" + idAware.getId());
    }

    return bean;
  }
}
