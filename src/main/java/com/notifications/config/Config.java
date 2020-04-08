package com.notifications.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.Environment;
import reactor.bus.EventBus;

@Configuration
public class Config {

    @Bean
    public Environment env() {
        return Environment.initializeIfEmpty().assignErrorJournal();
    }

    @Bean
    public EventBus createEventBus(Environment env) {
//        EventBus evBus = EventBus.create(env, Environment.newDispatcher(REACTOR_CAPACITY,REACTOR_CONSUMERS_COUNT,
//                DispatcherType.THREAD_POOL_EXECUTOR));
        return EventBus.create(env, Environment.THREAD_POOL);
    }
}
