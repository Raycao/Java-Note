package ch6;

import java.util.ArrayList;

public class ClientQueue {
	//�o��s�W���ArrayList����
	//��O��client�Plistener
    private ArrayList clients = new ArrayList();
    private ArrayList listeners = new ArrayList();
    
    //addClientListener��k����ClientListener����
    //������A��ܷs�W�@��Listener�A�]��Listeners�o��Arraylist�nadd�@��listener
    public void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }
    
    //Queue���i�H�s�W�P�����A�o���ӨS������D
    public void add(Client client) {
    	//�s�W�@��client��M�b�AArrayList�n�s�W�@��client
        clients.add(client);
        //���U�ӬO���ClientEvent�A�]���o�����O�i�H���oClient����Ƥ��e�A�����X�ӫݷ|�|�Ψ�
        ClientEvent event = new ClientEvent(client);
        //�ϥ�for�N�Ҧ��s�b��listners�o�Ӱ}�C������ť�̤@�@��X��
        for(int i = 0; i < listeners.size(); i++) {
        	//���ClientListener�����A�N�쥻��ilisteners�}�C��ClientListener������X
            ClientListener listener = (ClientListener) listeners.get(i);
            //�N����Ҫ�ClientEvent�����i�ѼơA�o�O�쥻�N�w�q�bClientListener����������k
            listener.clientAdded(event);
        }
    }
    
    //remove�N��add�t���h
    public void remove(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for(int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientRemoved(event);
        }
    }
}
