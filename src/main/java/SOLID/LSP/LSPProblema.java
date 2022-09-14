package SOLID.LSP;

public class LSPProblema {

    public static void main(String[] args) throws Exception {
        Movie theLionKing = new TheLionKing();
        theLionKing.increaseVolume();

        Movie movie = new ModernTimes();
        movie.increaseVolume();
    }
}

class Movie {
    public void play(){
        System.out.println("Play no video");
    }

    public void increaseVolume() throws Exception {
        System.out.println("Increase volume");
    }
}

class TheLionKing extends Movie {

}

class ModernTimes extends Movie {
    public void increaseVolume() throws Exception {
        throw new Exception("Não pode aumentar o volume para esse filme");
    }
}