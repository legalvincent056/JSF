package pjsf3.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mbclients",eager=true)
@SessionScoped
public class MBClients {
	
	
	ClientService clientService;
	private Client clientCourant;
	private Client client = new Client();
	ArrayList<Client> clients = new ArrayList<Client>();
	
	
	// Getter et Setter de Client pour ajouter un client
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	public MBClients(){
		clientService = new ClientService();
	}
	
	//Getter de la liste de clients
	public ArrayList<Client> getClients(){
		return clientService.getClients();
	}
	
	public int getNombre(){
		return clientService.getClients().size();
	}
	
	//Choisir un client

		
	public Client getClientCourant(){
		
		return clientCourant;
		
	}
	
	public String select(Client client){
		this.clientCourant =client;
		return "client";
	}
	
	
	
	public String delete(){
		
		clientService.delete(clientCourant);
		return "clients";
	}
	
	
	
	

	// Ajouter un client
	public String add(Client client){
		
		
		clientService.add(new Client(client.getNom(),client.getPrenom()));
		
		
		return "clients";
	}



	
	
}
