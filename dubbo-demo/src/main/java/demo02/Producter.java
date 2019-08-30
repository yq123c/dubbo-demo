package demo02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陆昌
 * @time 创建于2019年8月30日下午3:04:49
 * 说明：
 */
public class Producter {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producter.xml");
        context.start();
        System.out.println("start");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
