package com.mrlong.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
		//----------------------使用传统的方法调用-----------------------
		//		UserService name = new UserService();
		//		name.setName("张三");
		//		name.sayHello();
		//--------------------------------------------------------------
				
		
		//使用spring！！！！！！！！！！！！！！
		//将new对象的操作交给spring
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		((UserService)ApplicationContextUtil
				.getApplicationContextUtil()
				.getBean("userService")).sayHello();
		/*上面这句话执行的时候spring容器被创建  ， 同时application中配置的对象就会被创建到内存中
		 *扫描xml文件，依赖于反射机制
		 *-----------------------------------spring运行原理分析--------------------------------------------------------------
		 *利用 dom4j+java反射
		 * Object userService = Class.forName("com.mrlong.myspring.UserService")
		 * Object byeService = Class.forName("com.mrlong.myspring.ByeService")
		 *	userService.setName("张三三")
		 *	userService.setbyeService(byeService)
		 *	byeService.setName("李四四")
		 *
		 *	application = new HashMap();
		 *	application.put("userService",userService)
		 *	application.put("byeService",byeService)
		 *--------------------------------------------------------------------------------------------------------
		 *
		 * 结构类似于【HashMap】重量级的对象
		 * id                                              对象	
		 * userService（ox123）               UserService【name，byeService（ox234）】
		 * byeServce（ox234）                    ByeService【name】
		 * 
		 * -------------------------------------------------------------------------------------------------------
		 * 对这个案例的总结
		 * spring实际上是一个容器框架，可以配置各种bean，并且可以维护bean间关系，当我们需要使用某个bean的时候我们可以getBean（id）使用即可。
		 * 
		 * IOC是 控制反转 inverse of controll ，就是把创建对象的和维护对象的关系的权利从程序中转移到spring容器文件（applicationContext），
		 * 而程序本身不在维护
		 * 
		 * DI 是 dependence injection   依赖注入，实际上DI和IOC是同一个概念，spring的设计者DI更能准确的表达spring的核心技术
		 * 
		 * 
		 * bean|
		 * bean|
		 * bean|---注入到applicaTionContext  【大项目（金融业，财务，政务，OA） 编程的粒度变大了】
		 * bean|                                  
		 * bean|
		 * 
		 * 框架的学习就是学习各种配置
		 * 
		 * struts充当web层，接管jsp/action/表单
		 * 主要是出现出mvc的数据输入
		 * mvc  model层（业务层+dao层+持久层）在一个项目中不一定全都有，
		 * 
		 * spring开发提倡接口编程，配合DI技术可以层与层间的解耦
		 * */
		
//		UserService userService = (UserService) aContext.getBean("userService");
//		userService.sayHello();
		//aContext 代表application容器
//		ByeService byeService = (ByeService) aContext.getBean("byeService");
//		byeService.sayBye();
		//spring框架什么时候被加载，spring中配置的bean怎么被创建，bean之间的关系怎么被维护
	}

}
