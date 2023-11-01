package com.webapp.services;

import com.webapp.model.ErNew;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErNewService {

    private final SessionFactory sessionFactory;

    @Autowired
    public ErNewService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public String getAdressByAccount(String account) {
        try (Session session = sessionFactory.openSession()) {
            // Используйте сессию Hibernate для получения объекта ErNew по номеру счета
            ErNew erNew = session.get(ErNew.class, account);

            // Проверка на null, чтобы избежать NullPointerException
            if (erNew != null) {
                return erNew.getAdress();
            } else {
                return "Адрес не найден для счета " + account;
            }
        }
    }
}
