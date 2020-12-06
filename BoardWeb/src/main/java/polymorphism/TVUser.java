package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		//디자인패턴 이용하여 느슨한 결합상태로 만듬
		//BeanFactory factory=new BeanFactory();
		//TV tv=(TV)factory.getBean(args[0]); 
		
		//다형성 이용하기
		//TV tv=new LgTV();
		
		//spring XML 설정 이용하기
		//1. spring 컨터이너 구동하기
		AbstractApplicationContext factory= new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring 컨테이너로부터 필요한 객체를 요청한다.(Lookup)
		TV tv=(TV)factory.getBean("tv");
		//TV tv1=(TV)factory.getBean("tv");
		//TV tv2=(TV)factory.getBean("tv");
		
		tv.powerOn();
		tv.powerOff();
 		tv.volumeUp();
		tv.volumeDown();
		
		//3. spring컨테이너 종료
		factory.close();

	}

}
