
package wad.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Henkilo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String nimi;
    private String osoite;
    private String puhelinnumero;
      
    // henkilö voi olla vain yhdessä huoneessa kerrallaan
    @ManyToOne(optional=true)
    @JoinTable(name = "HuoneessaHenkiloita", joinColumns = {
    @JoinColumn(name="HenkiloId") },
    inverseJoinColumns = { @JoinColumn(name="HuoneId")})
    private Huone huone;

    public Huone getHuone() {
        return huone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getPuhelinnumero() {
        return puhelinnumero;
    }

    public void setPuhelinnumero(String puhelinnumero) {
        this.puhelinnumero = puhelinnumero;
    }

    
}
