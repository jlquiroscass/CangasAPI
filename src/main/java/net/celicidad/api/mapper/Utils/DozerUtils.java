package net.celicidad.api.mapper.Utils;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DozerUtils {

    private DozerUtils() {}

    public static <T>DozerBeanMapper getDozerBean(Class<T> bean){

        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(bean);
        context.registerShutdownHook();
        context.refresh();

        return (DozerBeanMapper) context.getBean("dozerBeanMapper");
    }
}
