package ch9;

public class CovarianceDemo {
	//此範例用於實作java中泛型的共變性效果
	public static void main(String[] args) {
        Node<Apple> apple1 = new Node<>(new Apple(), null);
        Node<Apple> apple2 = new Node<>(new Apple(), apple1);
        Node<Apple> apple3 = new Node<>(new Apple(), apple2);
        
        Node<Banana> banana1 = new Node<>(new Banana(), null);
        Node<Banana> banana2 = new Node<>(new Banana(), banana1);

        printlnForEach(apple3);
        printlnForEach(banana2);
    }
    
	//此方法要接收Node<? extends Fruit>的物件
	//角括號訥的? extends Fruit，代表?繼承自Fruit
	//因此在main區塊內的apple、banana等物件都可以放進此方法
	
	//倘若只有寫Node<Fruit>，就只能接受Node<Fruit>實例
	//java的泛型必須配合?與extends才能打到共變性效果
    static void printlnForEach(Node<? extends Fruit> n) { 
        Node<? extends Fruit> node = n;
        do {
            System.out.println(node.value);
            node = node.next;
        } while(node != null);
    }
}
