package cn.yasyx.devops.welcome;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WelcomeService {
    public Mono<String> hello() {
        return Mono.just("Hello 啊, 树哥！").map(s-> s.concat(",嘿嘿嘿")).log();
    }
}
