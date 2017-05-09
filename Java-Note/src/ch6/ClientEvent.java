package ch6;

public class ClientEvent {
	//ClientEvent會接收Client物件，並透過方法傳出資訊
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
