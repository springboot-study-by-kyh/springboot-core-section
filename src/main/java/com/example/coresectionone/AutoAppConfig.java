package com.example.coresectionone;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // @Component 가 붙은 모든 클래스를 스프링 빈으로 등록
    basePackages = "com.example.coresectionone.member", // 탐색할 시작 패키지 지정
//    basePackageClasses = AutoAppConfig.class,
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {




}
