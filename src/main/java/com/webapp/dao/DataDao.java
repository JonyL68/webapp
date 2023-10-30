package com.webapp.dao;


import com.webapp.model.*;

import java.util.List;

public interface DataDao {

    //void saveBankData(Refrec_data bankData);
    //void updateBankData(Refrec_data bankData);
    //void updateBaseEmail(BaseEmail baseEmail);

    //void createVerificationTokenForEmail(final Refrec_data user, final String token);

    //String validateVerificationToken(String token);

    //void deleteEmailToken(Verificationtoken_email verificationtokenEmail);

    //Verificationtoken_email findByTokenEmail(String token);
    //Verificationtoken_email findByTokenUserid(Long userid);

    //Refrec_data getRefrecDataFromId(Long id);

    //void saveLastPay(LastPay lastPay);

    //void saveRefrecfail(RefrecFailLog refrecFailLog);

    List<Teritory> getTeritory();

    //LastPay getLastPay(Double pay, String account, Integer ter);

    void truncateLastpay();

    //Setup getSetup(Long id);

    //List<Refrec_data> getRefrecdata(String account, Integer territory, String email);

    //Refrec_data getRefrecDataFromUid(String uid);

    //BaseEmail getBaseEmail(String uid);

    //Проверка на ранее отписанного в base_email

    //BaseEmail getBaseMailForCheck(String email, String account, Integer res_name);

    /**
     * Возвращает клиента по его територии и старому аккаунту
     *
     * @param territory - ID територии
     * @param account   - ID клиента
     * @return - объект клиента с заданным ID
     */
   ErNew read(int territory, String account);

    /**
     * Возвращает название территории по его ID
     * @param territory - ID територии
     * @return - название территории полное
     */
   Teritory getTerritory(int territory);

}
