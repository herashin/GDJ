package aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component  // RequestLoggingAspect 클래스를 Bean으로 만들어 두시오.
@Aspect     // 안녕. 난 Aspect야. AOP 동작하려면 내가 필요해.
public class RequestLoggingAspect {
   
   // 로거
   private static final Logger LOG = LoggerFactory.getLogger(RequestLoggingAspect.class);

   // 포인트컷 설정
   @Pointcut("within(com.gdu.app08.controller..*)")  // 컨트롤러의 모든 메소드를 포인트컷으로 지정하겠다.
                                         // 컨트롤러의 모든 메소드에서 어드바이스(콘솔에 로그 찍기)가 동작한다.
   public void setPointCut() { }  // 오직 포인트컷 대상을 결정하기 위한 메소드(이름 : 아무거나, 본문 : 없음)
   
   // 어드바이스 설정
   // 어드바이스 실행 시점
   // @Before, @After, @AfterReturning, @AfterThrowing, @Around
   @Around("com.gdu.app08.aop.RequestLoggingAspect.setPointCut()")  // setPointCut() 메소드에 설정된 포인트컷에서 동작하는 어드바이스
   public Object executeLogging(ProceedingJoinPoint joinPoint) throws Throwable {  //@Around는 반드시 ProceedingJoinPoint joinPoint 선언해야 함
      
      // HttpServletRequest를 사용하는 방법
      HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();

      
   }
   
}