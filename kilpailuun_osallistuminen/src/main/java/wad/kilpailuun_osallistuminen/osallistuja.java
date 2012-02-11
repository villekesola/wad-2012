/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.kilpailuun_osallistuminen;

/**
 *
 * @author vkesola
 */
public class osallistuja {
    private String nimi;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOsallistuuKilpailuun() {
        return osallistuuKilpailuun;
    }

    public void setOsallistuuKilpailuun(String osallistuuKilpailuun) {
        this.osallistuuKilpailuun = osallistuuKilpailuun;
    }
    private String osallistuuKilpailuun;
    
}
