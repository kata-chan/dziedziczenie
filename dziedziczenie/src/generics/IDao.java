package generics;

import java.util.List;

public interface IDao<T extends IEntity<U>, U> {

	void delete(U id);

	// List<T> list(int offset, int size);

	List<T> listAll();

	void persist(T entity);

	T select(U id);
}
