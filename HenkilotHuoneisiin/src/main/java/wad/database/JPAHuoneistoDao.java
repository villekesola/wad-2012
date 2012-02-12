package wad.database;

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.factories.SessionFactory;
import org.springframework.stereotype.Repository;
import wad.domain.Huone;

@Repository
public class JPAHuoneistoDao implements HuoneistoDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    
    @PersistenceContext
    EntityManager entityManagerHuone;

    @Override
    public void create(Huone instance) {
        entityManagerHuone.merge(instance);
    }

    @Override
    public Huone read(int id) {
        return entityManagerHuone.find(Huone.class, id);
    }

    @Override
    public void delete(Huone instance) {
        entityManagerHuone.remove(instance);
    }

    @Override
    public Huone update(Huone instance) {
        return entityManagerHuone.merge(instance);
    }

    @Override
    public List<Huone> listHuoneet() {
        Query q = entityManagerHuone.createQuery("SELECT e FROM Huone e"); 
       // Session session = sessionFactory.getCurrentSession();
        
        return q.getResultList();
    }
}