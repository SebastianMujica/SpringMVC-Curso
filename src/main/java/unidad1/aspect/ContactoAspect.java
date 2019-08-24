package unidad1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ContactoAspect {

	@Before("execution(* unidad1.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Llamada a metodo en servicio");
	}
}
