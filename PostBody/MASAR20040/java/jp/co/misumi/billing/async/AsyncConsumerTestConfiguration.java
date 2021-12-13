package jp.co.misumi.billing.async;

import com.fasterxml.jackson.databind.ObjectMapper;
import jp.co.misumi.fw.async.api.consumer.exceptionhandler.ExceptionHandler;
import jp.co.misumi.fw.async.api.consumer.listener.domain.TaskListenerRepository;
import jp.co.misumi.fw.async.api.consumer.testing.consumer.JmsMockAsyncConsumer;
import jp.co.misumi.fw.async.api.consumer.testing.consumer.MockAsyncConsumer;
import jp.co.misumi.fw.common.security.auth.misumi.MisumiPreAuthenticatedUserDetailsService;
import jp.co.misumi.fw.core.locale.LocaleAdapter;
import jp.co.misumi.fw.core.logging.ExceptionLogger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.support.MessageHandlerMethodFactory;
import org.springframework.security.access.AccessDecisionManager;

@TestConfiguration
public class AsyncConsumerTestConfiguration {
    @Bean
    MockAsyncConsumer mockAsyncConsumer(
        MessageSource messageSource,
        ObjectMapper objectMapper,
        TaskListenerRepository taskListenerRepository,
        @Qualifier("taskHandlerMethodFactory") MessageHandlerMethodFactory messageHandlerMethodFactory,
        ExceptionHandler exceptionHandler,
        ExceptionLogger exceptionLogger,
        LocaleAdapter localeAdapter,
        MisumiPreAuthenticatedUserDetailsService misumiPreAuthenticatedUserDetailsService,
        AccessDecisionManager accessDecisionManager
    ){
        return new JmsMockAsyncConsumer(messageSource,objectMapper, taskListenerRepository, messageHandlerMethodFactory, exceptionHandler, exceptionLogger, localeAdapter, misumiPreAuthenticatedUserDetailsService, accessDecisionManager);
    }

}