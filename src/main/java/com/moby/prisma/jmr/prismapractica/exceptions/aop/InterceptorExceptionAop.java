package com.moby.prisma.jmr.prismapractica.exceptions.aop;

import com.moby.prisma.jmr.prismapractica.exceptions.GlobalServiceDataAccessException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InterceptorExceptionAop {

    private static final String MSJ_DATA_ACCESS_EXCEPTION = "Interceptador de servicios general. En caso de problema de integridad referncial en la BD";

    @AfterThrowing(pointcut = "within(com.moby.prisma.jmr.prismapractica.services.*)", throwing = "ex")
    public void handleDataAccessException(DataAccessException ex) throws GlobalServiceDataAccessException {
        throw new GlobalServiceDataAccessException(MSJ_DATA_ACCESS_EXCEPTION);
    }
}
