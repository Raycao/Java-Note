package ch6;

public interface ClientListener {
	//ClientListener�@�������A����ClientEvent����
	//�խY������Q�n���oClient����[�JClientQueue���@�Ǹ�T�A�i�H�ӹ�@������
    //�䤤��Ӥ�k�ұ���ClientEvent����A�ӸӪ���i�H�ǥXClient���e
	void clientAdded(ClientEvent event);    // �s�WClient�|�I�s�o�Ӥ�k
    void clientRemoved(ClientEvent event); // ����Client�|�I�s�o�Ӥ�k
}
