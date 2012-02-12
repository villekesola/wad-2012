package wad.database;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import wad.domain.Henkilo;

@Repository
public class JPAHenkiloDao implements HenkiloDao {

    @PersistenceContext
    EntityManager entityManagerHenkilo;

    @Override
    public void create(Henkilo instance) {
        entityManagerHenkilo.merge(instance);
    }

    @Override
    public Henkilo read(int id) {
         Query query = entityManagerHenkilo.createQuery("FROM Henkilo as h LEFT JOIN FETCH  h.huoneet WHERE h.id="+id);
          // return entityManagerHenkilo.find(Henkilo.class, id);
         return (Henkilo) query.getSingleResult();
    }

    @Override
    public void delete(Henkilo instance) {
        entityManagerHenkilo.remove(instance);
    }

    @Override
    public Henkilo update(Henkilo instance) {
        return entityManagerHenkilo.merge(instance);
    }

    @Override
    public List<Henkilo> listHenkilot() {
        Query q = entityManagerHenkilo.createQuery("SELECT e FROM Henkilo e");
        return q.getResultList();
    }
}