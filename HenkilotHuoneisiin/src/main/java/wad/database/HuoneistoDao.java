package wad.database;
import java.util.List;
import wad.domain.Huone;

public interface HuoneistoDao extends DAO<Huone> {
    public List<Huone> listHuoneet();
}