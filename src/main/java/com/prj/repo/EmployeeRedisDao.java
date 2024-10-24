package com.prj.repo;

import com.google.gson.Gson;
import com.prj.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


import java.util.concurrent.TimeUnit;

@Repository
public class EmployeeRedisDao {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    //向Redis缓存里保存员工数据
    public void saveEmployee(String id, int expireTime, Employee employee) {
        Gson gson = new Gson();
        redisTemplate.opsForValue().set(id, gson.toJson(employee), expireTime, TimeUnit.SECONDS);
    }

    //从Redis缓存里根据id查找员工数据
    public Employee findByID(String id) {
        Gson gson = new Gson();
        Employee employee = null;
        String employeeJson = redisTemplate.opsForValue().get(id);
        if (employee != null && !employee.equals("")) {
            employee = gson.fromJson(employeeJson, Employee.class);
        }
        return employee;
    }

    //从Redis里删除指定id的员工数据
    public void deleteByID(String id) {
        redisTemplate.opsForValue().getOperations().delete(id);
    }
}