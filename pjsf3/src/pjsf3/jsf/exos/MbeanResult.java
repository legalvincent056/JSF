package pjsf3.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mbeanresult", eager=true)
@SessionScoped //Change la manière de se comporter (voir comment réagi le compteur). Par défaut, il est en RequestScoped.
//@ApplicationScoped

public class MbeanResult {

		

		String dataResult ="";
		
		
		public MbeanResult() {
			System.out.println("MBeanResult constructeur");
		}
		
		public String getDataResult(){
			return dataResult;
		}


		public void setDataResult(String dataResult){
			System.out.println("setting dataResult :" + dataResult);
			this.dataResult = dataResult;
		}


		

}
