package cn.yasyx.devops.configuration;

import cn.yasyx.devops.welcome.WelcomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterConfiguration {

    @Bean
    RouterFunction routerFunction(WelcomeService welcomeService) {
        return route(GET("/"), request -> ServerResponse.ok()
                .body(welcomeService.hello(), Object.class));
    }
}
