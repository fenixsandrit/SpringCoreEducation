package spring.education;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Fuck the police comin' straight from the underground";
    }
}
