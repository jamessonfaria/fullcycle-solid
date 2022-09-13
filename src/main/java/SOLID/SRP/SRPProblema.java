package SOLID.SRP;

import lombok.Getter;
import lombok.Setter;

public class SRPProblema {

    public static void main(String[] args) {
        System.out.println("aada");
    }

}

@Getter
@Setter
class Course {
    private String name;
    private String categoria;
    private String descricao;

    public PDO connection() {
        return new PDO();
    }

    public void createCategoria(){
        this.connection().insert(this.categoria);
    }

    public void createCourse() {
        this.connection().insert(this.name);
    }
}

class PDO {
    public void insert(String categoria) {
        System.out.println("Inseri a categoria / curso no banco de dados");
    }
}
