package me.crazyjiang.crazymusic.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface ServiceType {
    /**
     * api service type: "Baidu"
     */
    String value() default "";
}