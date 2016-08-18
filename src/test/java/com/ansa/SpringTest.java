package com.ansa;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:test-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest {


    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void test(){
        System.out.println(sessionFactory);


        HibernateTemplate template = new HibernateTemplate(sessionFactory);

        List<Item> items = template.loadAll(Item.class);

        items.stream().forEach(e->System.out.println(e.getName()));

    }
}
