package com.yupi.estutorial;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
@EnableSwagger2Doc
public class EsTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsTutorialApplication.class, args);
    }

}

