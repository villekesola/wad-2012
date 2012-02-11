package wad.service;
import java.util.List;
import wad.domain.Henkilo;

public interface HenkiloPalvelu {
    public void lisaaHenkilo(Henkilo henkilo);
    public List<Henkilo> listaaHenkilot();
    public void poistaHenkilo(int henkiloId);
}
