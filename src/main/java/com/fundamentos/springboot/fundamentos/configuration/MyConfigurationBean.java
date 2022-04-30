package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement2();
    }

    @Bean
    public MyOperation beanOperationOperation() {
        return new MyOperationImplemention();
    }

    @Bean
    public MyBeanWithDependency  beanOperationOperationWithDependency(MyOperation myOperation) {
        return new MyWithDependencyImplement(myOperation);
    }
}
