package com.webapp.dao;

import com.webapp.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class DataDaoImpl implements DataDao {

  /*  private static final String TOKEN_INVALID = "invalidToken";
    private static final String TOKEN_EXPIRED = "expired";
    private static final String TOKEN_VALID = "valid";
    // Хранилище клиентов */

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Teritory> getTeritory() {
        return null;
    }

    @Override
    public ErNew read(int territory, String account) {
        return null;
    }

    @Override
    public Teritory getTerritory(int territory) {
        return null;
    }

/*    @Override
    public void saveBankData(Refrec_data refrec_data) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(refrec_data);
            session.getTransaction().commit();
        }
    } */

/*
    @Override
    public void updateBankData(Refrec_data refrec_data) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(refrec_data);
            session.getTransaction().commit();
        }
    }
*/
  /*  @Override
    public void updateBaseEmail(BaseEmail baseEmail) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(baseEmail);
            session.getTransaction().commit();
        }
    } */

 /*   @Override
    public void createVerificationTokenForEmail(Refrec_data user, String token) {
        final Verificationtoken_email myToken = new Verificationtoken_email(user.getId(), token);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(myToken);
            session.getTransaction().commit();
        }
    } */

  /*  @Override
    public String validateVerificationToken(String token) {
        final Verificationtoken_email verificationtokenEmail = findByTokenEmail(token);
        if (verificationtokenEmail == null) {
            return TOKEN_INVALID;
        }

        final Refrec_data user = getRefrecDataFromId(verificationtokenEmail.getUserid());

        // final Calendar cal = Calendar.getInstance();
       /* if ((verificationtokenEmail.getExpirydate().getTime() - cal.getTime().getTime()) <= 0) {
            return TOKEN_EXPIRED;
        }*/
       /* if (user.getUnsubscribe() == 1) {
          // пользователь ранее отписывался необхоимо Подписать его в в таблице base_email
            user.setUnsubscribe(0);

        }*/

 /*       Teritory teritory = sessionFactory.getCurrentSession().createQuery(
                "from Teritory as r where r.id = :id", Teritory.class)
                .setParameter("id", user.getTerritory())
                .uniqueResult();  */

  /*      BaseEmail baseMailForCheck = getBaseMailForCheck(user.getEmail(), user.getAccount(), teritory.getPindex());

        if (baseMailForCheck != null) {
            baseMailForCheck.setStatus(1);
            updateBaseEmail(baseMailForCheck);
        }

        user.setEnable(1);

        saveBankData(user);

        deleteEmailToken(verificationtokenEmail);

        return TOKEN_VALID;
    } */

 /*   public void deleteEmailToken(Verificationtoken_email verificationtokenEmail) {
        if (verificationtokenEmail != null) {
            try (Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                session.delete(verificationtokenEmail);
                session.getTransaction().commit();
                session.close();
            }
        }
    }
*/
 /*   @Override
    public Verificationtoken_email findByTokenEmail(String token) {
        return sessionFactory.getCurrentSession().createQuery(
                "from Verificationtoken_email as a  where a.token =:token", Verificationtoken_email.class)
                .setParameter("token", token)
                .uniqueResult();
    }
*/
 /*   @Override
    public Verificationtoken_email findByTokenUserid(Long userid) {
        return sessionFactory.getCurrentSession().createQuery(
                "from Verificationtoken_email as a  where a.userid =:userid", Verificationtoken_email.class)
                .setParameter("userid", userid)
                .uniqueResult();
    }
*/
 /*   @Override
    public Refrec_data getRefrecDataFromId(Long id) {
        return sessionFactory.getCurrentSession().createQuery(
                "from Refrec_data as a  where a.id =:id", Refrec_data.class)
                .setParameter("id", id)
                .uniqueResult();
    }

    @Override
    public void saveLastPay(LastPay lastPay) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            //session.saveOrUpdate(lastPay);
            session.save(lastPay);
            session.getTransaction().commit();
        }
    }

    @Override
    public void saveRefrecfail(RefrecFailLog refrecFailLog) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(refrecFailLog);
            session.getTransaction().commit();
        }
    }
*/
 /*   @Override
      public List<Teritory> getTeritory() {
        return sessionFactory.getCurrentSession().createQuery(
                "from Teritory", Teritory.class)
                .list();
    } */

 /*   @Override
    public void truncateLastpay() {

    }*/

 /*   @Override
    public ErNew read(int territory, String account) {
        return null;
    }
*/
 /*   @Override
    public LastPay getLastPay(Double pay, String account, Integer ter) {
        return sessionFactory.getCurrentSession().createQuery(
                "from LastPay as a  where (a.pay =:pay and a.account=:account and a.territory=:ter)", LastPay.class)
                .setParameter("pay", pay)
                .setParameter("account", account)
                .setParameter("ter", ter)
                .uniqueResult();
    }

    @Override
    public void truncateLastpay() {
        String hql = "delete from LastPay";
        sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();
    }

    @Override
    public Setup getSetup(Long id) {
        return sessionFactory.getCurrentSession().createQuery(
                "from Setup as a  where a.id=:id", Setup.class)
                .setParameter("id", id)
                .uniqueResult();
    }

    @Override
    public List<Refrec_data> getRefrecdata(String account, Integer territory, String email) {
        return sessionFactory.getCurrentSession().createQuery(
                "from Refrec_data as r where r.account like :account and r.territory = :territory and r.email like :email", Refrec_data.class)
                .setParameter("account", account)
                .setParameter("territory", territory)
                .setParameter("email", email)
                .list();
    }

    @Override
    public Refrec_data getRefrecDataFromUid(String uid) {
        return sessionFactory.getCurrentSession().createQuery(
                "from Refrec_data as r where r.uid =:uid and r.enable = 1", Refrec_data.class)
                .setParameter("uid", uid)
                .uniqueResult();
    }

    @Override
    public BaseEmail getBaseEmail(String uid) {
        return sessionFactory.getCurrentSession().createQuery(
                "from BaseEmail as r where r.uid =:uid", BaseEmail.class)
                .setParameter("uid", uid)
                .uniqueResult();
    }

    @Override
    public BaseEmail getBaseMailForCheck(String email, String account, Integer res_name) {
        return sessionFactory.getCurrentSession().createQuery(
                "from BaseEmail as bs where bs.email =:email and  bs.account =:account and" +
                        " bs.resName= :res_name and bs.status=0", BaseEmail.class)
                .setParameter("email", email)
                .setParameter("account", account)
                .setParameter("res_name", res_name)
                .uniqueResult();
    }
*/
 //   @Override
 //   public ErNew read(int territory, String account) {
 //       return sessionFactory.getCurrentSession().createQuery(
  //              "from ErNew as ona where ona.territory =:territory and ona.account =:account", ErNew.class)
 //               .setParameter("territory", territory)
  //              .setParameter("account", account)
 //               .uniqueResult();
 //   }

/*    @Override
    public Teritory getTerritory(int territory) {
        return sessionFactory.getCurrentSession().createQuery(
                        "from Teritory as r where r.id = :id", Teritory.class)
                .setParameter("id", territory)
                .uniqueResult();
    }
*/

}