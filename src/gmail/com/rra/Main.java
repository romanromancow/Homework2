package gmail.com.rra;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        SomeClass c = new SomeClass();
        Class<?> someClass = SomeClass.class;

        try {
            Method method = someClass.getDeclaredMethod("sumTest", int.class, int.class);
            if (method.isAnnotationPresent(Test.class)){//проверка наличия аннотации
                Test test = method.getAnnotation(Test.class);//получение аннотации

                System.out.println(test.a());//извлечение параметра аннотации
                System.out.println(test.b());
                System.out.println("следующее строки - передаем значения аннотации в качестве параметров при вызове метода");
                try {
                    method.invoke(c, test.a(), test.b());// передаем значения аннотации в качестве параметров при вызове метода
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
