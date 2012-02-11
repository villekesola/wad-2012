
package wad.database;
import java.util.List;
import wad.domain.Henkilo;

public interface HenkiloDao extends DAO<Henkilo> {
    public List<Henkilo> listHenkilot();
}