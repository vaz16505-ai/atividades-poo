package modelo;

public class CDPlayer implements Player {

    @Override
    public void play() {
        System.out.println("CD Player: reproduzindo");
    }

    @Override
    public void stop() {
        System.out.println("CD Player: parado");
    }

    @Override
    public void pause() {
        System.out.println("CD Player: pausado");
    }

    @Override
    public void reverse() {
        System.out.println("CD Player: retrocedendo");
    }
}
