package com.how2java;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        //读取配置文件，加载里面的配置等
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        ProductService productService = (ProductService)applicationContext.getBean("productService");
        productService.doSomeService();
    }
}