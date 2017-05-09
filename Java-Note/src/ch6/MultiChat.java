package ch6;

public class MultiChat {
    public static void main(String[] args) {
        //實例兩個Client物件，並給予內容
    	Client c1 = new Client("127.0.0.1", "Caterpillar");
        Client c2 = new Client("192.168.0.2", "Justin");
        
        //實例一個ClientQueue
        ClientQueue queue = new ClientQueue();
        
        //使用queue內的方法，而該方法接收ClientListener物件，此物件為介面，且需要override
        //我們的匿名介面Override在此處施行，寫在new之後
        //分別重新override兩個方法，改寫為輸出client內容
        queue.addClientListener(new ClientListener() {
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("%s 從 %s 連線%n",
                        event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("%s 從 %s 離線%n", 
                        event.getName(), event.getIp());
            }
        });
        
        queue.add(c1);
        queue.add(c2);

        queue.remove(c1);
        queue.remove(c2);
    }
}
