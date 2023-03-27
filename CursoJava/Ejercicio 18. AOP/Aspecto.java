package aop.aspectos;
import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component

public class Aspecto {
	@Before("execution(public void generarTxt(List<Empleado> listaEmpleados))")
	public void pre()
	{
		System.out.println("Se esta generando un fichero");
	}
	@After("execution(public void cierrePrograma())")
	public void post()
	{
		System.out.println("Se esta cerrando el programa");
	}
}