package jp.co.misumi.creditmanagement.batch.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RequestConfig implements WebMvcConfigurer {

  @Autowired
  public ApplicationContext app;

  @Override
  public void addInterceptors(InterceptorRegistry registry){
    RestTemplate restTemplate = (RestTemplate) app.getBean("restTemplate");
    List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
    interceptors.add(new HeaderInterceptor());
    restTemplate.setInterceptors(interceptors);
  }

}
