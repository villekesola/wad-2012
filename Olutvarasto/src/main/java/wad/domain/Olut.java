/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.domain;

public class Olut {

     private static int LASKURI = 1;

    public static int getLASKURI() {
        return LASKURI;
    }

    public static void setLASKURI(int LASKURI) {
        Olut.LASKURI = LASKURI;
    }
    private int id;
    private String name;

    public Olut() { id = LASKURI++; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            return true;
        }
        
        if(!(obj instanceof Olut)) {
            return false;
        }
                
        Olut o = (Olut) obj;
        return o.getId() == this.getId();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        return hash;
    }
}
