package gmail.com.rra;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Inherited
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
int a ();
int b ();
}
