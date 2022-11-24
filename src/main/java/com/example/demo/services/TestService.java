package com.example.demo.services;

import com.example.demo.Dao.TestDao;
import com.example.demo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public List<TestEntity> getIndustryList(){
        return testDao.getIndustrySuggestionsData();
    }
}
