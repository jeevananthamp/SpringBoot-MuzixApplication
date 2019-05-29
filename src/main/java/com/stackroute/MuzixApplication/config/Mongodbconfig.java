package com.stackroute.MuzixApplication.config;

import com.stackroute.MuzixApplication.document.Track;
import com.stackroute.MuzixApplication.repository.MuzixRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = MuzixRepository.class)
@Configuration
public class Mongodbconfig {

    @Bean
    CommandLineRunner cmdrunner (MuzixRepository muzixRepository)
    {
        return strings ->{

               muzixRepository.save(new Track("1","gaana song","nice to hear","all"));
               muzixRepository.save(new Track("2" ,"love song","good to hear","young"));

        };
    }
}
