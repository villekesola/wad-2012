package wad.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Huone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private int kerros;
    private int kapasiteetti;
    
    @OneToMany
    private Set<Henkilo> henkilot;

    public Set<Henkilo> getHenkilot() {
        return henkilot;
    }

    public void setHenkilot(Set<Henkilo> henkilot) {
        this.henkilot = henkilot;
    }

    public Huone() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKapasiteetti() {
        return kapasiteetti;
    }

    public void setKapasiteetti(int kapasiteetti) {
        this.kapasiteetti = kapasiteetti;
    }

    public int getKerros() {
        return kerros;
    }

    public void setKerros(int kerros) {
        this.kerros = kerros;
    }
    


}