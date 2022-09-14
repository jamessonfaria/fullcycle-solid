package SOLID.ISP;

public class ISPPRoblema {
}

interface Movie {
    public void play();
    public void increaseVolume() throws Exception;
}

class TheLionKing implements Movie {

    @Override
    public void play() {
    }

    @Override
    public void increaseVolume() {
    }
}

class ModernTimes implements Movie {

    @Override
    public void play() {
    }

    @Override
    public void increaseVolume() throws Exception {
        throw new Exception("Metodo não deve ser implementado para essa classe");
    }
}
