package com.example.demo.Dao;

import com.example.demo.entity.TestEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TestDao {

    public List<TestEntity> getIndustrySuggestionsData(){
        TestEntity testEntity1 = new TestEntity();
        testEntity1.setId(99);
        testEntity1.setName("Insurance");
        testEntity1.setUrlName("insurance");

        TestEntity testEntity2 = new TestEntity();
        testEntity2.setId(97);
        testEntity2.setName("Industrial Automation");
        testEntity2.setUrlName("industrial-automation");

        TestEntity testEntity3 = new TestEntity();
        testEntity3.setId(36);
        testEntity3.setName("Industrial Machinery");
        testEntity3.setUrlName("industrial-machinery");

        TestEntity testEntity4 = new TestEntity();
        testEntity4.setId(31);
        testEntity4.setName("Internet");
        testEntity4.setUrlName("internet");

        List<TestEntity> results = new ArrayList<>();
        results.add(testEntity1);
        results.add(testEntity2);
        results.add(testEntity3);
        results.add(testEntity4);

        return results;
    }
}
