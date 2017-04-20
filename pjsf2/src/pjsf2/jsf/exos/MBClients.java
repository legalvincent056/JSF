package pjsf2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mbclients",eager=true)
@SessionScoped
public class MBClients {
	
	private Client client = new Client();
	
	ArrayList<Client> clients = new ArrayList<Client>();
	
	public MBClients(){
		System.out.println("Constructeur MBClients");
		clients.add(new Client("Dupond", "Martin"));
		clients.add(new Client("Durand", "Jean"));
		
	}
	
	public ArrayList<Client> getClients(){
		
		return clients;
	}
	
	
	
	public int getNombre(){
		return clients.size();
	}
	
	/*public void select(Client client){
		
		System.out.println("selected : "+ client.getNom());
	}*/

	private Client clientCourant;
	
	public String select(Client client){
		this.clientCourant =client;
		System.out.println("selected + " + clientCourant.getNom());
		return "client";
	}
	
	public Client getClientCourant(){
		
		return clientCourant;
		
	}
	
	public String delete(){
		
		System.out.println("deleted : "+ clientCourant.getNom());
		clients.remove(clientCourant);
		return "clients";
	}
	
	/*
	private void delete(Client clientToDelete){
		
		ArrayList<Client> newClients = new ArrayList<Client>();
		
		for (Client client : clients){
			if(!client.getNom().equals(clientToDelete.getNom())){
				newClients.add(client);
			}
			
		}
	
	client = newClients;

}*/
	
	
	
	public String add(Client client){
		
		
		clients.add(new Client(client.getNom(),client.getPrenom()));
		
		System.out.println("Ajouter : "+ client.getNom());
		
		
		return "clients";
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	
}
