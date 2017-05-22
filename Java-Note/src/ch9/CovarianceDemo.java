package ch9;

public class CovarianceDemo {
	//���d�ҥΩ��@java���x�����@�ܩʮĪG
	public static void main(String[] args) {
        Node<Apple> apple1 = new Node<>(new Apple(), null);
        Node<Apple> apple2 = new Node<>(new Apple(), apple1);
        Node<Apple> apple3 = new Node<>(new Apple(), apple2);
        
        Node<Banana> banana1 = new Node<>(new Banana(), null);
        Node<Banana> banana2 = new Node<>(new Banana(), banana1);

        printlnForEach(apple3);
        printlnForEach(banana2);
    }
    
	//����k�n����Node<? extends Fruit>������
	//���A���[��? extends Fruit�A�N��?�~�Ӧ�Fruit
	//�]���bmain�϶�����apple�Bbanana�����󳣥i�H��i����k
	
	//�խY�u���gNode<Fruit>�A�N�u�౵��Node<Fruit>���
	//java���x�������t�X?�Pextends�~�ॴ��@�ܩʮĪG
    static void printlnForEach(Node<? extends Fruit> n) { 
        Node<? extends Fruit> node = n;
        do {
            System.out.println(node.value);
            node = node.next;
        } while(node != null);
    }
}
