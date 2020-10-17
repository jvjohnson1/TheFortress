package persistence;

import com.thefortress.entity.Soldier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


/**
 * Manages Dao for class Soldier
 * @author JJohnson
 */
public class SoldierDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get book by id
     * @param id
     */
    public Soldier getById(int id) {

        Session session = sessionFactory.openSession();
        Soldier currentSoldier = session.get( Soldier.class, id );
        session.close();
        return currentSoldier;
    }

    /**
     * update Book
     * @param aSoldier Person to be inserted or updated
     */
    public void saveOrUpdate(Soldier aSoldier) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(aSoldier);
        transaction.commit();
        session.close();
    }

    /**
     * insert Book
     * @param aSoldier Person to be inserted
     */
    public int insert(Soldier aSoldier) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(aSoldier);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a book
     * @param aSoldier person to be deleted
     * Not sure how this will work with separation of duties
     */
    public void delete(Soldier aSoldier) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(aSoldier);
        transaction.commit();
        session.close();
    }


    /** Return a list of all books
     *
     * @return All books
     */
    public List<Soldier> getAll() {


        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Soldier> query = builder.createQuery( Soldier.class );
        Root<Soldier> root = query.from( Soldier.class );
        List<Soldier> troops = session.createQuery( query ).getResultList();

        logger.debug("The list of users " + troops);
        session.close();

        return troops;
    }



}
