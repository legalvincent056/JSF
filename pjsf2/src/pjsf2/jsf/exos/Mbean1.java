package pjsf2.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mbean1", eager=true)
@SessionScoped //Change la manière de se comporter (voir comment réagi le compteur). Par défaut, il est en RequestScoped.
//@ApplicationScoped

public class Mbean1 {

		private String message = "Hello1";
		private int compteur = 0;
		//final static int Constante = 10;
		
		
		
		public Mbean1() {
			System.out.println("MBean1 constructeur");
		}
		
		private String data = "";
		private String data2 = "";
		private String lesDeux ="";
		
		
		public String getMessage() {
			compteur ++;
			return message + compteur + " data = "+ data + " data2 = " +data2;
		}
		
		
		
		public String getData(){
			return data;
		}


		public void setData(String data){
			System.out.println("setting data :" + data);
			this.data = data;
		}
		
		
		public String getData2(){
			return data2;
		}


		public void setData2(String data2){
			System.out.println("setting data2 : " + data2);
			this.data2 = data2;
			FacesContext ctx = FacesContext.getCurrentInstance();
			ctx.addMessage("laForm:inputData2", new FacesMessage("message InputData2 depuis le bean"));
			ctx.addMessage("laForm:inputData3", new FacesMessage("message InputData3 depuis le bean"));
			ctx.addMessage("laForm:inputDataXXX", new FacesMessage("message InputDataXXX depuis le bean"));
			ctx.addMessage(null, new FacesMessage("message for all depuis le bean"));
			ctx.addMessage("leFormResult:inputDataResult", new FacesMessage("message InputDataResult depuis le bean"));
			
		}
		
		public String getLesDeux(){
			return data + data2;
		}
		
		
		public String goConditionnel(){
			if(data.length()>10) return "jsf3result2"; //test la longueur de data 1. Si supp à 10, j'affiche la page jsf3result2
			
			else return "jsf3result";
		}
		
		public String testErreur(){
			/*if(data.length()>10) return "jsf3result2"; //test la longueur de data 1. Si supp à 10, j'affiche la page jsf3result2
			
			else return "jsf3result";*/
			System.out.println("Testerreur");
			return "erreur";
		}
		
		
		private String civilite = "";



		public String getCivilite() {
			return civilite;
		}


		public void setCivilite(String civilite) {
			System.out.println("setting civilite : " + civilite);
			this.civilite = civilite;
		}
		
		
		
		
		
		
}
