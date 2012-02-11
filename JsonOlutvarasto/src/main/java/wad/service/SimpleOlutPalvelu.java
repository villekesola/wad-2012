
package wad.service;

/**
 *
 * @author vkesola
 */
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import wad.domain.Olut;

@Service
public class SimpleOlutPalvelu implements OlutPalvelu {
   
    private List<Olut> oluet = new ArrayList();
    private int olutId;
    
    @Override
    public Olut annaOlut(int olutId) {
     Olut olut = null;
        for (Olut e : oluet) {
            if (e.getId() == olutId) {
                olut = e;
                break;
            }
        }
        return olut;
    }

    @Override
    public Olut lisaaOlut(Olut olut) {
        olutId = olut.hashCode();
        olut.setId(olutId);
        oluet.add(olut);
        return olut;
    }
    
    @Override
    public List<Olut> listaaOluet()
    {
        return oluet;
    }
    
    @Override
    public void poistaOlut(int olutId)
    {
        Olut olut = null;
        for (Olut e : oluet) {
            if (e.getId() == olutId) {
                olut = e;
                break;
            }
        }
        
        if (olut != null) {
            oluet.remove(olut);
        }
    }

    @Override
    public Olut muokkaaTaiLisaaOlut(int olutId, Olut olut) {      
        oluet.add(olut);
        return olut;
    }
 

}
