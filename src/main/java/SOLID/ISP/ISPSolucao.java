package SOLID.ISP;

public class ISPSolucao {
}

interface MovieNew {
    public void play();
}

interface AudioNew {
    public void increaseVolume();
}

class TheLionKingNew implements MovieNew, AudioNew {

    @Override
    public void play() {
    }

    @Override
    public void increaseVolume() {
    }
}

class ModernTimesNew implements MovieNew {

    @Override
    public void play() {
    }
}
