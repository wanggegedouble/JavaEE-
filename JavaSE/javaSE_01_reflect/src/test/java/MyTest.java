import org.junit.Test;

import java.lang.reflect.*;

public class MyTest {
    @Test
    public void getConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            //获取类对象
            Class c = Student.class;
            //定位单个构造器 c.getDeclaredConstructor(String.class) 定位有参构造
            //c.getDeclaredConstructor(); 定位无参构造
            Constructor constructor = c.getDeclaredConstructor();
            System.out.println(constructor.getName()+"====>"+constructor.getParameterCount());
            //遇到私有构造器 暴力反射
            constructor.setAccessible(true);
            //newInstance() 生成新对象
            Student student = (Student) constructor.newInstance();
            System.out.println(student);
        }
    @Test
    public void getConstructs(){
        Class c = Student.class;
        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Object obj = c.isInterface();
        System.out.println(obj);
    }

    @Test
    public void testGetConstructor() throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
        Class c = Student.class;
        Constructor constructor = c.getConstructor();
        Field field = c.getDeclaredField("name");
        System.out.println(field.getName()+" "+field.getType());
        field.setAccessible(true);
        Student student = new Student();
        field.set(student,"wy");
        System.out.println("student===>"+student);
        System.out.println(constructor.getName()+constructor.getParameterCount()+constructor.getModifiers());
        System.out.println(Modifier.toString(constructor.getModifiers()));
    }
}
