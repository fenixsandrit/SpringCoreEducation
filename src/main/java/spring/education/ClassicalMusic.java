package spring.education;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    private void doMyInit(){
        System.out.println("Classical music init method");
    }
    @PreDestroy
    private void doMyDestroy(){
        System.out.println("Classical music destroy method");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
