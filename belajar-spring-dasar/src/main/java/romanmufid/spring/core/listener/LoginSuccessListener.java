package romanmufid.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import romanmufid.spring.core.event.LoginSuccessEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {

  @Override
  public void onApplicationEvent(LoginSuccessEvent event) {
    log.info("Success login for user {}", event.getUser());
  }
}
