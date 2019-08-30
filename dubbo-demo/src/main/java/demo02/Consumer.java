package demo02;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陆昌
 * @time 创建于2019年8月30日下午3:11:03
 * 说明：
 */
public class Consumer {  

    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "consumer.xml" });  
        context.start();  

        DemoService demoService = (DemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); // ִ  
        System.out.println(hello); //   

        //   
        List<User> list = demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
        // System.out.println(demoService.hehe());  
        System.in.read();  
    }  

}