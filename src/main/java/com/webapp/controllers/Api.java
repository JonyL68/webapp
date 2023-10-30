package com.webapp.controllers;

import com.webapp.dao.DataDao;
//import com.event.model.OldNewClient;
//import com.event.model.ErNew;
import com.webapp.model.Teritory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Api {

    @Autowired
    private DataDao dataDao;

    @GetMapping("/getTerritory")
    @ResponseBody
    public List<Teritory> getteritory() {
        return dataDao.getTeritory();
    }


 //   @GetMapping(value = "/getAccount/{territory}/{account}")
 //   public ErNew read(@PathVariable(name = "territory") int territory, @PathVariable(name = "account") String account) {
  //      return dataDao.read(territory,account);
  //  }

    }

