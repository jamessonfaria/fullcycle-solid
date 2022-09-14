package SOLID.LSP;

public class LSPSolucao {

    public static void main(String[] args) {
        MovieNew theLionKing = new TheLionKingNew();
        theLionKing.increaseVolume();

        ModernTimesNew movieNew = new ModernTimesNew();
        movieNew.play();
    }
}

class MovieNew {
    public void play(){
        System.out.println("Play no video");
    }

    public void increaseVolume() {
        System.out.println("Increase volume");
    }
}

class MovieNewWithoutAudio {
    public void play(){
        System.out.println("Play no video");
    }
}

class TheLionKingNew extends MovieNew {
}

class ModernTimesNew extends MovieNewWithoutAudio {
}