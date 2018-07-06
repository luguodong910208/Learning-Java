package chapter16Annotation.chapter16_5;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//�˷���ֻ����������
//@Target({ElementType.TYPE, ElementType.METHOD})�˷���������ͷ�����
@Retention(value = RetentionPolicy.RUNTIME)

public @interface MyTargetAnnotation{
	public String key() default "lu";
	public String value() default "shenzhen";
}
