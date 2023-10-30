package com.webapp.services;

import com.webapp.model.ErNew;

public class ErNewService {




    public interface UserService {
        ErNew ge(Long id);
        void saveErNew(ErNew erNew);
        // другие методы, связанные с бизнес-логикой
    }


}
