package cg.park.testSpringBoot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class timeCheckAop {

    Logger logger = LoggerFactory.getLogger(super.getClass());

//    @Around("@annotation(TimeCheck)")
//    public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
//
//
//        logger.info("===============START===============");
//
//        Object procced = joinPoint.proceed();
//
//        logger.info("===============E N D===============");
//        return procced;
//    }


}
