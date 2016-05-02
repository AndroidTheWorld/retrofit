package retrofit2.http;

import retrofit2.FieldGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by benny on 4/30/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface GeneratedField {
    String[] keys();

    Class<? extends FieldGenerator>[] generators();
}
