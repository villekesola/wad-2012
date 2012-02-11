/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.database;

public interface DAO<T> {
    public void create(T instance);
    public T read(int id);
    public void delete(T instance);
    public T update(T instance);
}

