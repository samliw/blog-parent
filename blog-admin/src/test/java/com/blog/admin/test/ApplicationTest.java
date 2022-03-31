package com.blog.admin.test;

import com.blog.es.utils.ElasticsearchUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    /**
     * 测试索引
     */
    private String indexName = "megacorp";

    /**
     * 类型
     */
    private String esType = "employee";

    @Test
    public void esTest(){
        if (!ElasticsearchUtil.isIndexExist(indexName)) {
            ElasticsearchUtil.createIndex(indexName);
        } else {
            System.out.println("索引已经存在");
        }
    }

}
