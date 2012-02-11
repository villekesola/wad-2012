/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.service;


import java.util.List;
import wad.domain.Huone;

public interface HuonePalvelu {
    public void lisaa(Huone huone);
    public List<Huone> listaa();
    public void poista(int huoneId);
}
