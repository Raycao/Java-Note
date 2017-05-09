package ch6;

public class MultiChat {
    public static void main(String[] args) {
        //��Ҩ��Client����A�õ������e
    	Client c1 = new Client("127.0.0.1", "Caterpillar");
        Client c2 = new Client("192.168.0.2", "Justin");
        
        //��Ҥ@��ClientQueue
        ClientQueue queue = new ClientQueue();
        
        //�ϥ�queue������k�A�ӸӤ�k����ClientListener����A�����󬰤����A�B�ݭnoverride
        //�ڭ̪��ΦW����Override�b���B�I��A�g�bnew����
        //���O���soverride��Ӥ�k�A��g����Xclient���e
        queue.addClientListener(new ClientListener() {
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("%s �q %s �s�u%n",
                        event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("%s �q %s ���u%n", 
                        event.getName(), event.getIp());
            }
        });
        
        queue.add(c1);
        queue.add(c2);

        queue.remove(c1);
        queue.remove(c2);
    }
}
