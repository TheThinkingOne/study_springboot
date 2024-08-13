package com.yojulab.study_springboot.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SharedDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    // 여러 개 레코드 
    public Object getList(String sqlMapId, Object dataMap){
        Object result = sqlSessionTemplate.selectList(sqlMapId, dataMap);
        return result;
    }

    // 레코드 하나
    public Object getOne(String sqlMapId, Object dataMap){
        Object result = sqlSessionTemplate.selectOne(sqlMapId, dataMap);
        return result;
    }

    // 수정
    public Object update(String sqlMapId, Object dataMap){
        Object result = sqlSessionTemplate.update(sqlMapId, dataMap);
        return result;
    }
    
    // 만듬
    public Object insert(String sqlMapId, Object dataMap){
        Object result = sqlSessionTemplate.insert(sqlMapId, dataMap);
        return result;
    }

    // 없앨 때
    public Object delete(String sqlMapId, Object dataMap){
        Object result = sqlSessionTemplate.delete(sqlMapId, dataMap);
        return result;
    }

    // result 를 Object로 해도 상관없음, 풀어해칠때만 잘 하면됨
}
