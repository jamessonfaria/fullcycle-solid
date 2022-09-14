package SOLID.SRP;

import lombok.Getter;
import lombok.Setter;

public class SRPSolucao {

    @Getter
    @Setter
    class Course {
        private String name;
        private String categoria;
        private String descricao;
    }

    class PDO {
        public void insert(String categoria) {
            System.out.println("Inseri a categoria / curso no banco de dados");
        }
    }

    class Repository {
        public PDO connection() {
            return new PDO();
        }

        public void createCategoria(String categoria) {
            this.connection().insert(categoria);
        }

        public void createCourse(String course) {
            this.connection().insert(course);
        }
    }
}