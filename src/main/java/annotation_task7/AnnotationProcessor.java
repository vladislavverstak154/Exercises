package annotation_task7;

import java.lang.reflect.Method;

public class AnnotationProcessor {
	
	
	public static void main(String[] args) throws Exception {
		loadClass("annotation_task7.NuclearSubmarine");
		
	}
	
	public static void loadClass(String className) throws Exception{
		Object object=null;
		Class<?> clazz=Class.forName(className);
		if(clazz.isAnnotationPresent(Service.class)){
			Object serviceObject=clazz.newInstance();
			Method[] methods=clazz.getDeclaredMethods();
			for(Method method:methods){
				if(method.isAnnotationPresent(Init.class)){
				System.out.println(method.getName()+ " has"+method.getAnnotation(Init.class).toString());
				method.invoke(serviceObject, null);
			}
		}
		
}
	}
}
	
