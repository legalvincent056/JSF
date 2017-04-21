package pjsf3.jsf.exos;

import java.util.ArrayList;


public class ClientService{
	
		
	ArrayList<Client> clients = new ArrayList<Client>();
	
	public ClientService(){
		//System.out.println("Constructeur MBClients");
		clients.add(new Client("Dupond", "Martin"));
		clients.add(new Client("Durand", "Jean"));
		
	}
	
	public ArrayList<Client> getClients(){
		
		return clients;
	}
	
	public int getNombre(){
		return clients.size();
	}
	
	public void delete(Client client){
		
		clients.remove(client);
		}
		
	public void add(Client client){
				
		clients.add(new Client(client.getNom(),client.getPrenom()));
	}
	
	
}
