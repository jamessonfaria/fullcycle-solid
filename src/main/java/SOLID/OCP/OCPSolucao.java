package SOLID.OCP;

public class OCPSolucao {

    public static void main(String[] args) {
        Video movie = new Movie();
        movie.calculaInteresse();
    }
}

abstract class Video {
    abstract public void calculaInteresse();
}

class Movie extends Video {
    @Override
    public void calculaInteresse() {
        System.out.println("Calcula Interesse baseado em filme");
    }
}

class TVShow extends Video {
    @Override
    public void calculaInteresse() {
        System.out.println("Calcula Interesse baseado em serie");
    }
}