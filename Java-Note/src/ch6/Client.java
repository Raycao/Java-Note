package ch6;

public class Client {
	//連線程式需包含連線端資料，ip與名字
    public final String ip;
    public final String name;
    public Client(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }
}