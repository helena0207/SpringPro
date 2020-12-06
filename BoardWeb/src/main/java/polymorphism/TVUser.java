package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		//���������� �̿��Ͽ� ������ ���ջ��·� ����
		//BeanFactory factory=new BeanFactory();
		//TV tv=(TV)factory.getBean(args[0]); 
		
		//������ �̿��ϱ�
		//TV tv=new LgTV();
		
		//spring XML ���� �̿��ϱ�
		//1. spring �����̳� �����ϱ�
		AbstractApplicationContext factory= new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.(Lookup)
		TV tv=(TV)factory.getBean("tv");
		//TV tv1=(TV)factory.getBean("tv");
		//TV tv2=(TV)factory.getBean("tv");
		
		tv.powerOn();
		tv.powerOff();
 		tv.volumeUp();
		tv.volumeDown();
		
		//3. spring�����̳� ����
		factory.close();

	}

}
