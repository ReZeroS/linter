package club.qqtim.aspect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public abstract class AbstractTestClass {


    public void testMethod(){
        log.info("hello");
    }

}