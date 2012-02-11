/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.varasto.service;

/**
 *
 * @author vkesola
 */
import java.util.List;
import wad.varasto.domain.Esine;

public interface EsinePalvelu {
    public void lisaa(Esine esine);
    public List<Esine> listaa();
    public void poista(int esineId);
}