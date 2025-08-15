package com.lxz.user.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lxz.user.IntegrationTest;
import com.lxz.user.entity.TestTableUserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@IntegrationTest
public class TestTableUserServiceTest {
    @Autowired
    TestTableUserService testTableUserService;

    @Test
    public void test() {
        List<TestTableUserEntity> list = testTableUserService.getBaseMapper().selectList(new QueryWrapper<>(TestTableUserEntity.class));
        System.out.println(list.size());

        TestTableUserEntity test = TestTableUserEntity.builder().name("test").build();
        testTableUserService.getBaseMapper().insert(test);

        TestTableUserEntity queryEntity = testTableUserService.getBaseMapper().selectById(test.getId());
        System.out.println(queryEntity);
    }
}
