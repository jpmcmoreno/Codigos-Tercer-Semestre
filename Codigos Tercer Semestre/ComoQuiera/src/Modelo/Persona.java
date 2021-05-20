
package Modelo;


public class Persona {
    private String persona;
    private int id;

    public Persona() {
    }

    public Persona(String persona, int id) {
        this.persona = persona;
        this.id = id;
    }

    
    
    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
