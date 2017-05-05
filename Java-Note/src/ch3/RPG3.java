package ch3;

public class RPG3 {
	//新加入drawFight的方法
	public static void main(String[] args) {
        SwordsMan2 swordsMan = new SwordsMan2();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        Magician2 magician = new Magician2();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        
        showBlood(swordsMan);
        showBlood(magician);
        
        drawFight(swordsMan);
        drawFight(magician);
    }

    static void showBlood(Role2 role) {
        System.out.printf("%s 血量 %d%n",
                role.getName(), role.getBlood());
    }
    
    static void drawFight(Role2 role) {
    	//此方法使用到fight方法
    	//因為原本的Role.java沒有定義fight，因此role.fight()這一行會編一錯誤
    	//即便繼承的SwordsMan與Magician都有定義fight
    	//所以這邊重新寫一個Role2.java，內含fight方法
        System.out.print(role.getName());
        role.fight();
    }
}
