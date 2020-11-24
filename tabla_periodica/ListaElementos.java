import java.util.ArrayList;
import java.util.List;

public class ListaElementos {

    private List lista;

    public ListaElementos() {
    }

    public List getLista() {
        return lista;
    }

    public void cargar() {
        this.lista = new ArrayList<Elemento>();
        lista.add(new Elemento("hidrogeno", "H", 1, 1.00794, "no metales"));
        lista.add(new Elemento("helio", "He", 2, 4.002602, "gases nobles"));
        lista.add(new Elemento("litio", "Li", 3, 6.941, "alcalinos"));
        lista.add(new Elemento("hierro", "Fe", 26, 55.845, "metal de transicion"));
        lista.add(new Elemento("neon", "Ne", 10, 20.1797, "gases nobles"));
    }
}
