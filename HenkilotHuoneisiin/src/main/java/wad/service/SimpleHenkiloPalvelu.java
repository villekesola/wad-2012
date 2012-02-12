package wad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.database.HenkiloDao;
import wad.domain.Henkilo;

@Service
public class SimpleHenkiloPalvelu implements HenkiloPalvelu {

    @Autowired
    private HenkiloDao henkiloDao;

    @Override
    @Transactional
    public void lisaaHenkilo(Henkilo henkilo) {
        henkiloDao.create(henkilo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Henkilo> listaaHenkilot() {
        return henkiloDao.listHenkilot();
    }

    @Override
    @Transactional
    public void poistaHenkilo(int henkiloId) {
        Henkilo e = henkiloDao.read(henkiloId);
        if (e != null) {
            henkiloDao.delete(e);
        }
    }
}