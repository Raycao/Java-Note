package ch1;

class Clothes2 {
    String color;
    char size;
    Clothes2(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Clothes2[] c1 = {new Clothes2("red", 'L'), new Clothes2("blue", 'M')};
        Clothes2[] c2 = new Clothes2[c1.length]; 
        for(int i = 0; i < c1.length; i++) {
            Clothes2 c = new Clothes2(c1[i].color, c1[i].size); //重新new一個新的類別，只是用的值來自原始陣列
            c2[i] = c; //再將mew完的類別指定給矩陣，以此便完成陣列複製
        }
        c1[0].color = "yellow"; //改變原始陣列的值
        System.out.println(c2[0].color); //印出複製陣列的值，發現並未受到改變
    }
}
