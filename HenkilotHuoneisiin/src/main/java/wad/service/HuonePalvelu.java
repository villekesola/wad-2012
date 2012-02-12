package wad.service;
import java.util.List;
import wad.domain.Huone;

public interface HuonePalvelu {
    public void lisaaHuone(Huone huone);
    public List<Huone> listaaHuoneet();
    public void poistaHuone(int huoneId);
}
