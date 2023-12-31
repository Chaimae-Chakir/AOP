package me.chakir.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecondAspect {
    @Pointcut("execution(* me..test.*.main1(..))")
    public void pc1(){ }

    //code advice

   /* @Before("pc1()")
    public void beforeMain(){

        System.out.println("----------****************--------------------------------------");
        System.out.println("before main from aspectj with class syntax");
        System.out.println("-----------*****************-------------------------------------");

    }
    @After("pc1()")
    public void afterMain(){

        System.out.println("----------****************--------------------------------------");
        System.out.println("after main from aspectj with class syntax");
        System.out.println("-----------*****************-------------------------------------");

    }*/

    @Around("pc1()")
    public void aroundMain(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("----------****************--------------------------------------");
        System.out.println("before main from aspectj with class syntax");
        System.out.println("-----------*****************-------------------------------------");
        //execute main
        proceedingJoinPoint.proceed();
        System.out.println("----------****************--------------------------------------");
        System.out.println("after main from aspectj with class syntax");
        System.out.println("-----------*****************-------------------------------------");

    }
}
