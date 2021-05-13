package com.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author wang.zhiqiang
 * @version 1.0
 * @date 2021/5/13 11:23
 * @description
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RepApplication.class})
@ActiveProfiles("local")
public class RuleEngineExeTest {

    @Resource
    private RuleEngineService ruleEngineService;

    @Test
    public void testExe() throws IOException {
        ruleEngineService.kieSession().fireAllRules();
    }
    
}
