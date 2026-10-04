import modelo.CDPlayer;
import modelo.DVDPlayer;
import modelo.Studio;

public class Main {

    public static void main(String[] args) {

        Studio studio = new Studio();

        DVDPlayer dvd = new DVDPlayer();

        CDPlayer cd = new CDPlayer();

        System.out.println("=== DVD PLAYER ===");
        studio.executar(dvd);

        System.out.println();

        System.out.println("=== CD PLAYER ===");
        studio.executar(cd);
    }
}