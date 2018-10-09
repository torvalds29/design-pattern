package 行为型设计模式.策略模式;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author torvalds on 2018/10/7 16:35.
 * @version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Interval {
    double minInterval() default 0D;

    double maxInterval() default 0D;
}
