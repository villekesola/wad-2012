package wad.database;

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.eclipse.persistence.sessions.factories.SessionFactory;
import org.springframework.stereotype.Repository;
import wad.domain.Henkilo;

@Repository
public class JPAHenkiloDao implements HenkiloDao {

   @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    
    @PersistenceContext
    EntityManager entityManagerHenkilo;

    @Override
    public void create(Henkilo instance) {
        entityManagerHenkilo.merge(instance);
    }

    @Override
    public Henkilo read(int id) {
         return entityManagerHenkilo.find(Henkilo.class, id);
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