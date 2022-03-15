package spring.education;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Fuck the police comin' straight from the underground";
    }
}
