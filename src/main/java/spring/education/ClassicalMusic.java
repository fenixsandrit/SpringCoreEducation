package spring.education;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){};

    public static ClassicalMusic getInstance(){
        return new ClassicalMusic();
    }

    private void doMyInit(){
        System.out.println("Classical music init method");
    }

    private void doMyDestroy(){
        System.out.println("Classical music destroy method");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
