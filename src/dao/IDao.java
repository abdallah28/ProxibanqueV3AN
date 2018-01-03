package dao;
/**
 * IDaoCrud est un Interface avec les methodes qui sont immpliqués dans les classes différent. ça aide à bien factoriser le Code.
 */
import java.util.Collection;

import javax.ejb.Local;
/**
 * @author AB_NC: Interface Idao est une interface qui contient la signature des
 *         m�thodes implementer par la classe dao
 *
 *
 */
@Local
public interface IDao<T> {
	boolean create(T el);
	boolean delete(T el);
	T update(T el);
	Collection<T> getAll();
	T getById(long id);

}
