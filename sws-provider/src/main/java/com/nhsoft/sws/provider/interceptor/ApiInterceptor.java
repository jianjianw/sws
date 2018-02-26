package com.nhsoft.sws.provider.interceptor;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ApiInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ApiInterceptor.class);

    @Pointcut("execution(* com.nhsoft.module.sws.schedule.*.*(..))")
    public void api() {
    }

    @Around(value="ApiInterceptor.api()")
    public Object printLog(ProceedingJoinPoint point) throws Throwable  {

        String name = null;
        Object object;
        long diff = 0;
        long preTime = 0;
        try {
            name = point.getTarget().getClass().getName() + "." + point.getSignature().getName();
            preTime = System.currentTimeMillis();
            object = point.proceed();
            return object;
        } catch (Throwable throwable) {
            logger.error(throwable.getMessage(),throwable);
            throw throwable;
        } finally {
            long afterTime = System.currentTimeMillis();
            diff = (afterTime - preTime)/1000;
            logger.info("API：" + name + "耗时：" + diff + "秒");
        }
    }

}
