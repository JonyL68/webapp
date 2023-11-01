package com.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webapp.model.ErNew;

public interface ErNewRepository extends JpaRepository<ErNew, Long> {
    ErNew findByAccount(String account);
}
