/**
 * 
 */
package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.ioc.LocationProps;
import com.test.ioc.Player;

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
		
		
	}
	
	public static void println(String message){
		System.out.println(message);
	}

}
