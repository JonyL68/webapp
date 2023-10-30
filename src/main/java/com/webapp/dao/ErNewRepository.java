package com.webapp.dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class ErNewRepository {

    public interface ErNewRepositoryImpl extends JpaRepository<User, Long> {
        // Можно добавить специфичные методы для доступа к данным
    }



}
