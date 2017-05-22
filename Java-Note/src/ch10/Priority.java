package ch10;

public enum Priority {
	
	//�����b�C�|������[�W�A���A�N�O���w�N���O�ݭn���޼�
    MAX(10), NORM(5), MIN(1); 
    
	//�ѩ�Enum��ordinal�Q�ŧi��final�A���୫�s�w�q
	//�ҥH�۩w�q�Fvalue�A�óz�L�۩w�q��value��k�^��int��
    private int value;
    
    //enum�i�H�ۦ�q�۫غc���A���󦡥�����private
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