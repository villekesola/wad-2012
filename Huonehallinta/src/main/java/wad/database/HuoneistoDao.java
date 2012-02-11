/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.database;


import java.util.List;
import wad.domain.Huone;

public interface HuoneistoDao extends DAO<Huone> {
    public List<Huone> list();
}