package org.nuunframework.kernel.plugin.dummy1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME)
@Target({  ElementType.TYPE})
public @interface MarkerSample4
{

}
