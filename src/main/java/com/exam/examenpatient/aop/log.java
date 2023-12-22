package com.exam.examenpatient.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class log {
    @AfterReturning(pointcut = "execution(* com.exam.examenpatient.services..*(String,..))", returning = "result")
    public void logStringParamMethods(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("La méthode avec un paramètre String \"" + methodName + "\" a été exécutée.");
    }
}
