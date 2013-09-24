/**
 * 
 */
package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.ioc.LocationProps;
import com.test.ioc.Player;
import com.test.ioc.SingletonDemo;
import com.test.ioc.SingletonDemoWithNonProtoType;

/**
 * @author Admin
 *
 */
public class IOCDemoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
 
		Player obj = (Player) context.getBean("playerBeanConstructor");
		println(obj.toString());
		
		
	
		obj = (Player) context.getBean("playerBeanConstructorAmbiguityIssue");
		println("\n PlayerBeanConstructorAmbiguityIssue : \n"+obj.toString());
		
		obj = (Player) context.getBean("playerBeanConstructorAmbiguityResolve");
		println("\n PlayerBeanConstructorAmbiguityResolve : \n"+obj.toString());
		
		obj = (Player) context.getBean("playerBeanSetter");
		println("\n PlayerBeanSetter : \n"+obj.toString());
		
		
		obj = (Player) context.getBean("playerBeanCollections");
		println("\n PlayerBeanCollections : \n"+obj.toString());
		
				
		obj = (Player) context.getBean("childPlayerBeanCollectionMerge");
		println("\n ChildPlayerBeanCollectionMerge : \n"+obj.toString());
		
		
		LocationProps props = (LocationProps) context.getBean("locationFromProperties");
		println("\n LocationFromProperties : \n"+props.toString());
		
				
		obj = (Player) context.getBean("playerForFactoryBean");
		println("\nPlayerForFactoryBean : \n"+obj.toString());
		
		
		
		obj = (Player) context.getBean("playerUsingUtil");
		println("\nPlayerUsingUtil : \n"+obj.toString());
		
			
		
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		
		obj = (Player) context.getBean("playerBeanSingleton");		
		obj.setId(9999);
		println("\nPlayerUsing Singleton1 : \n"+obj.toString());
		
		Player otherObj = (Player) context1.getBean("playerBeanSingleton");
		
		println("\nPlayerUsing Singleton 2: \n"+otherObj.toString());
		
		println("\n Comparing Singleton Object from two SpringContext objects of same XML : "+ (obj==otherObj));
		
		
		/**
		 * Usage of Lookup Method
		 * Scenario :
		 * Singleton scoped object having prototype reference, for not to defy singleton contract we need
		 * a reference for prototype created only once whenever we fetch singleton object (reference should be
		 * kept as prototype)
		 */
		
		
		
		SingletonDemo sDemo1=	(SingletonDemo)context.getBean("singletonDemo");
		
		SingletonDemo sDemo2=	(SingletonDemo)context.getBean("singletonDemo");
		
		SingletonDemo sDemo3=	(SingletonDemo)context.getBean("singletonDemo");
		
		println("Single Demo 1 :\n"+sDemo1);
		
		println("Single Demo 2 :\n"+sDemo2);
		
		println("Single Demo 3 :\n"+sDemo2);
		
		
		SingletonDemoWithNonProtoType sDemo4=	(SingletonDemoWithNonProtoType)context.getBean("singletonDemoWithNonProtoType");
		
		SingletonDemoWithNonProtoType sDemo5=	(SingletonDemoWithNonProtoType)context.getBean("singletonDemoWithNonProtoType");
		
		SingletonDemoWithNonProtoType sDemo6=	(SingletonDemoWithNonProtoType)context.getBean("singletonDemoWithNonProtoType");
		
		println("\n\nSingletonDemoWithNonProtoType 4 :\n"+sDemo4);
		
		println("SingletonDemoWithNonProtoType Demo 5 :\n"+sDemo5);
		
		println("SingletonDemoWithNonProtoType 6 :\n"+sDemo6);
		
		
		}
	
	public static void println(String message){
		System.out.println(message);
	}

}
