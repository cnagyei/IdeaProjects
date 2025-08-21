import java.util.jar.*;

class MainJar {
    public static void main(String[] args) throws Exception {
        JarFile jarFile = new JarFile("./myJAR.jar");
        System.out.println("Jar file: " + jarFile.getName());
    }
}