/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.soahitcounter;

/**
 *
 * @author vkesola
 */
public interface SOAHitCounter {
     public int getAndIncrementCount();

    public void incrementCount();

    public Object getCount();
}
