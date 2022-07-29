package modelo;

/**
 *
 * @author Lisandro
 */
public class Orador {

    private int id_orador;
    private int id_persona;
    private String tema;

    public int getId_orador() {
        return id_orador;
    }

    public void setId_orador(int id_orador) {
        this.id_orador = id_orador;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Orador(int id_persona, String tema) {
        this.id_persona = id_persona;
        this.tema = tema;
    }

    public Orador(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Orador{" + "id_orador=" + id_orador + ", id_persona=" + id_persona + ", tema=" + tema + '}';
    }

    public Orador(int id_orador) {
        this.id_orador = id_orador;
    }
 
}
