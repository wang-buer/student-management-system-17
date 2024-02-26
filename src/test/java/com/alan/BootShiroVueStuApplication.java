package com.alan;

import com.alan.pojo.Perms;
import com.alan.service.PermsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class BootShiroVueStuApplication {
    @Autowired
    PermsService permsService;
    @Test
    public void test(){
        List<Perms> list=permsService.findBasePermission();
        for (Perms perms :list) System.out.println(perms);

    }

    @Test
    public void test1(){
        System.out.println(permsService);
    }

}
