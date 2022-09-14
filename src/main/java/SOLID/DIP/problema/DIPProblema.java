package SOLID.DIP.problema;

public class DIPProblema {

}

class DramaCategory {

}

class Movie {
    // dependendo de uma implementacao
    private DramaCategory category;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DramaCategory getCategory() {
        return category;
    }

    public void setCategory(DramaCategory category) {
        this.category = category;
    }
}
