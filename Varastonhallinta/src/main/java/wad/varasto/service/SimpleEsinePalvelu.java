

/**
 *
 * @author vkesola
 */

package wad.varasto.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import wad.varasto.domain.Esine;

@Service
public class SimpleEsinePalvelu implements EsinePalvelu {
   
    private List<Esine> esineet = new ArrayList();
    private int esineId;
    
    @Override
    public void lisaa(Esine esine)
    {
        esineet.add(esine);
    }
    
    @Override
    public List<Esine> listaa()
    {
        return esineet;
    }
    
    @Override
    public void poista(int esineId)
    {
        Esine esine = null;
        for (Esine e : esineet) {
            if (e.getId() == esineId) {
                esine = e;
                break;
            }
        }
        
        if (esine != null) {
            esineet.remove(esine);
        }
    }
}