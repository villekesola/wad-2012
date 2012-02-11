/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package wad.database;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import wad.domain.Huone;

@Repository
public class JPAHuoneistoDao implements HuoneistoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Huone instance) {
        entityManager.merge(instance);
    }

    @Override
    public Huone read(int id) {
        return entityManager.find(Huone.class, id);
    }

    @Override
    public void delete(Huone instance) {
        entityManager.remove(instance);
    }

    @Override
    public Huone update(Huone instance) {
        return entityManager.merge(instance);
    }

    @Override
    public List<Huone> list() {
        Query q = entityManager.createQuery("SELECT e FROM Huone e");
        return q.getResultList();
    }
}