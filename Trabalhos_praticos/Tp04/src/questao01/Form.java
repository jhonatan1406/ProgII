package questao01;
import java.io.OutputStream;
public class Form {

        protected int nm;

        public int getNm() {
            return nm;
        }

        public Form (int nm){
            this.nm=nm;
        }

        @Override
        public String toString() {
            return "Formulario: " + nm +"\n";
        }

        public void flush(OutputStream o) {
        }
    }

