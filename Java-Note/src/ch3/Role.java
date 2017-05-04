package ch3;

public class Role {
	//將腳色的屬性值放進父類別
	//原因是這些東西都是每個角色會重複定義到的東西
	//如果我們芳父類別，既可以透過繼承來使用
	//也可以避免修改時所花費的時間
    private String name;
    private int level;
    private int blood;
    
    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
