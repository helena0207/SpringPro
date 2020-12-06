package polymorphism;

/*
 디자인 패턴 이용하기 
 Factory패턴이 적용된 BeanFactory클래스를 추가 하여 느슨한 결합상태를 만듬
 */
public class BeanFactory { 
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")){
			return new LgTV();
		}
		return null;
	}
}
