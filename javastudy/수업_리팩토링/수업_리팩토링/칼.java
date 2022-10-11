package 수업_리팩토링;

public class 칼 {
    private String 이름;
    private int 진화 = 0;
    private int 강화 = 0;
    private int 공격력=1;
    private int 가격;
    public 칼(String 이름, int 가격){
        this.이름 = 이름;
        this.가격 = 가격;
    }

    public int get진화() {
        return 진화;
    }

    public void set진화(int 진화) {
        this.진화 = 진화;
    }

    public int get강화() {
        return 강화;
    }

    public void set강화(int 강화) {
        this.강화 = 강화;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public int get공격력() {
        return 공격력;
    }

    public void set공격력(int 공격력) {
        this.공격력 = 공격력;
    }

    public int get가격() {
        return 가격;
    }

    public void set가격(int 가격) {
        this.가격 = 가격;
    }
    @Override
    public String toString() {
        return "----------------\n"
                + "이  름 : " + 이름
                + "\n진 화 : " + 진화
                + "\n강 화 : " + 강화
                + "\n공격력 : " + 공격력
                + "\n가 격 : " + 가격;

    }
}
