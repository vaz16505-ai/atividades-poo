package modelo;

public class DVDPlayer implements Player {

    @Override
    public void play() {
        System.out.println("DVD Player: reproduzindo");
    }

    @Override
    public void stop() {
        System.out.println("DVD Player: parado");
    }

    @Override
    public void pause() {
        System.out.println("DVD Player: pausado");
    }

    @Override
    public void reverse() {
        System.out.println("DVD Player: retrocedendo");
    }
}