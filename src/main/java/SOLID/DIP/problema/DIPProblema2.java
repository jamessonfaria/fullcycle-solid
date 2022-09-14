package SOLID.DIP.problema;

public class DIPProblema2 {

}

class DramaCategory2 {

}

class Movie2 {
    private DramaCategory2 category;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DramaCategory2 getCategory() {
        // dependendo da uma implementacao
        return new DramaCategory2();
    }

}
