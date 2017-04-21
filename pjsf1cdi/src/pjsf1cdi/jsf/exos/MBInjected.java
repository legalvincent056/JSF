package pjsf1cdi.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "mbinjected", eager = true)
@ApplicationScoped
public class MBInjected {

	public MBInjected() {
		System.out.println("Injected Bean created");
	}

	public void show() {
		System.out.println("show injected");
	}

	public String getInjectedData() {
		return "Hello Injected";
	}

}
