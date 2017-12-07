package net.celicidad.api.mapper.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DozerConfig {

    @Bean(name = "dozerBeanMapper")
    public DozerBeanMapper dozerBeanMapper(){
        List<String> mappingFiles = Arrays.asList(
                "dozer-mapping.xml"
        );
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.setMappingFiles(mappingFiles);
        return dozerBeanMapper;
    }
}
