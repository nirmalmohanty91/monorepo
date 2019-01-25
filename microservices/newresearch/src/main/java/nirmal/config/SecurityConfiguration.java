package nirmal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  private static final String[] HTTP_WHITELIST = {"/health"};
  private static final String[] HTTP_ACTUATOR_LIST = {"/research/yml"};

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
    auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
  }

  @Override
  public void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests().antMatchers(HTTP_WHITELIST).permitAll();

    httpSecurity
        .authorizeRequests()
        .antMatchers(HTTP_ACTUATOR_LIST)
        .hasRole("ADMIN")
        .and()
        .httpBasic()
        .and()
        .csrf()
        .disable();
  }
}
