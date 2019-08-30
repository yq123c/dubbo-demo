package demo02;

import java.util.List;

/**
 * @author 陆昌
 * @time 创建于2019年8月30日下午3:02:48
 * 说明：
 */
public interface DemoService {
	String sayHello(String name);

    public List<User> getUsers();
}
