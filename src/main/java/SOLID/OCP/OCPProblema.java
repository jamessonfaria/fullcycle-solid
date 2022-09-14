package SOLID.OCP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OCPProblema {

    class Video {
        private String type;

        public void calculaInteresse(){
            if (this.type.equals("Movie")) {
                System.out.println("Calcula Interesse baseado em filme");
            } else if (this.type.equals("TVShow")) {
                System.out.println("Calcula Interesse baseado em serie");
            }
        }
    }

}
