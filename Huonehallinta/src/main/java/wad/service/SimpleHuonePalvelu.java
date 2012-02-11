/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.database.HuoneistoDao;
import wad.domain.Huone;

@Service
public class SimpleHuonePalvelu implements HuonePalvelu {

    @Autowired
    private HuoneistoDao huoneistoDao;

    @Override
    @Transactional
    public void lisaa(Huone huone) {
        huoneistoDao.create(huone);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Huone> listaa() {
        return huoneistoDao.list();
    }

    @Override
    @Transactional
    public void poista(int huoneId) {
        Huone e = huoneistoDao.read(huoneId);
        if (e != null) {
            huoneistoDao.delete(e);
        }
    }
}