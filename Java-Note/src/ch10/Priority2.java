package ch10;

import static java.lang.String.format;

public enum Priority2 {
	//將原先的Priority改寫
	//並用特定值類別本體（Value-Specific Class Bodies）語法
	
    MAX(10) {
        public String toString() {
            return format("(%2d) - 最大權限", value);
        }
    }, 
    NORM(5) {
        public String toString() {
            return format("(%2d) - 普通權限", value);
        }
    }, 
    MIN(1) {
        public String toString() {
            return format("(%2d) - 最小權限", value);
        }
    };
	protected int value;

    private Priority2(int value) {
        this.value = value;
    }
    public int value() {
        return value;
    }
    
    public static void main(String[] args) {
        for(Priority2 priority : Priority2.values()) {
            System.out.println(priority);
        }
    }
}