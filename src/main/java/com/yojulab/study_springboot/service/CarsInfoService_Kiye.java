package com.yojulab.study_springboot.service;

import com.yojulab.study_springboot.dao.LKY_DAO;
import com.yojulab.study_springboot.dao.SharedDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class CarsInfoService_Kiye {
    @Autowired
    LKY_DAO lky_dao;

    //HashMap result = new HashMap();
    public Object selectTotal(Map dataMap) {
        HashMap result = new HashMap<>();
        String sqlMapId = "CarInfors.selectTotalKiye"; // sqlMapId = namespace(xml 파일), 쿼리 id

        result.put("resultList", lky_dao.getList(sqlMapId, dataMap));
        return result;


    }

}
