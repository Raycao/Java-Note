package ch6;

import java.util.ArrayList;

public class ClientQueue {
	//這邊新增兩個ArrayList物件
	//方別放client與listener
    private ArrayList clients = new ArrayList();
    private ArrayList listeners = new ArrayList();
    
    //addClientListener方法接收ClientListener物件
    //接收後，表示新增一個Listener，因此Listeners這個Arraylist要add一個listener
    public void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }
    
    //Queue內可以新增與移除，這應該沒什麼問題
    public void add(Client client) {
    	//新增一個client當然在，ArrayList要新增一個client
        clients.add(client);
        //接下來是實例ClientEvent，因為這個類別可以取得Client的資料內容，先做出來待會會用到
        ClientEvent event = new ClientEvent(client);
        //使用for將所有存在於listners這個陣列內的傾聽者一一找出來
        for(int i = 0; i < listeners.size(); i++) {
        	//實例ClientListener介面，將原本放進listeners陣列的ClientListener物件取出
            ClientListener listener = (ClientListener) listeners.get(i);
            //將剛剛實例的ClientEvent物件放進參數，這是原本就定義在ClientListener介面內的方法
            listener.clientAdded(event);
        }
    }
    
    //remove就跟add差不多
    public void remove(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for(int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientRemoved(event);
        }
    }
}
