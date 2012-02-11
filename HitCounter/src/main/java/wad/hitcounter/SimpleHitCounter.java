/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.hitcounter;

import org.springframework.stereotype.Service;

/**
 *
 * @author vkesola
 */
@Service
public class SimpleHitCounter implements HitCounter {
    private int count = 0;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void incrementCount() {
        if (this.count == 100) this.count=-10;
        count=count+10;
    }
}