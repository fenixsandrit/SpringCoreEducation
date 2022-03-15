package spring.education;

public class RapMusic implements Music{
    private void doMyInit(){
        System.out.println("Rap music init method");
    }

    private void doMyDestroy(){
        System.out.println("Rap music destroy method");
    }
    @Override
    public String getSong() {
        return "Fuck the police comin' straight from the underground";
    }
}
