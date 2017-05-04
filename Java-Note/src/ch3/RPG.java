package ch3;

public class RPG {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
    	//記得先實例出來
        SwordsMan swordsMan = new SwordsMan();
        /*
         * 以下可以發現，雖然有些方法沒有寫在SwordsMan中
         * 卻可以使用且呼叫，原因來自於SwordsMan繼承自Role
         * 而Role內原本就有定義的方法，因此SwordsMan可以使用
         * */
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        System.out.printf("劍士：(%s, %d, %d)%n", swordsMan.getName(), 
                swordsMan.getLevel(), swordsMan.getBlood());
    }

    static void demoMagician() {
        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.printf("魔法師：(%s, %d, %d)%n", magician.getName(), 
                magician.getLevel(), magician.getBlood());
    }
}