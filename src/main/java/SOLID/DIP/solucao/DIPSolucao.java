package SOLID.DIP.solucao;

public class DIPSolucao {
    public static void main(String[] args) {
        Movie movie = new Movie(new DramaCategory(), "Category 1");

        Movie movie2 = new Movie(new XCategory(), "Category 2");
    }
}

interface Category {
}

class DramaCategory implements Category {
}

class XCategory implements Category {
}

class Movie {
    private Category category;
    private String name;

    public Movie(Category category, String name){
        this.category = category;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
