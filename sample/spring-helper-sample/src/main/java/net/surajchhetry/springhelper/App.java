package net.surajchhetry.springhelper;

import net.surajchhetry.springhelper.service.CompanyManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = null;
        ctx = new ClassPathXmlApplicationContext("spring-config/core-context.xml");
        CompanyManager companyManager = ctx.getBean(CompanyManager.class);
        companyManager.addCompany(new Company("test"));        
    }
}
