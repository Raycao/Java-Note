package ch6;

public class ClientEvent {
	//ClientEvent�|����Client����A�óz�L��k�ǥX��T
    private Client client;
    public ClientEvent(Client client) {
        this.client = client;
    }
    
    public String getName() {
        return client.name;
    }
    
    public String getIp() {
        return client.ip;
    }
}
