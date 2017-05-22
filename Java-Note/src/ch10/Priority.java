package ch10;

public enum Priority {
	
	//直接在列舉成員後加上括號，就是指定就夠是需要的引數
    MAX(10), NORM(5), MIN(1); 
    
	//由於Enum的ordinal被宣告為final，不能重新定義
	//所以自定義了value，並透過自定義的value方法回傳int值
    private int value;
    
    //enum可以自行訂自建構式，條件式必須為private
    private Priority(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
    
    public static void main(String[] args) {
        for(Priority priority : Priority.values()) {
            System.out.printf("Priority(%s, %d)%n",
                  priority, priority.value());
        }
    }
}