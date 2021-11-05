package Repository;

import java.util.List;

public interface ICrudRepository<T> {

    /**
     * Adds a new object to the repo
     * @param obj
     * @return Created object
     */
    T create(T obj);

    /**
     * Returns all the values in the repo
     * @return repo values
     */
    List<T> getAll();

    /**
     * Updates an object in repo
     * @param obj
     * @return updated object
     */
    T update(T obj);

    /**
     * Deletes the given object from repo
     * @param obj
     */
    void delete(T obj);
}