package ch6;

public interface ClientListener {
	//ClientListener作為介面，接收ClientEvent物件
	//倘若有物件想要取得Client物件加入ClientQueue的一些資訊，可以來實作本介面
    //其中兩個方法皆接收ClientEvent物件，而該物件可以傳出Client內容
	void clientAdded(ClientEvent event);    // 新增Client會呼叫這個方法
    void clientRemoved(ClientEvent event); // 移除Client會呼叫這個方法
}
