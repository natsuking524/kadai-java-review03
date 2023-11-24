package jp.co.baseball;

public class BaseBallTeam {
    public String name;
    public int win;
    public int lose;
    public int draw;

    public BaseBallTeam() {

    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        double sum;
        sum = this.win + this.lose;
        double rate;
        rate = this.win / sum;
        return rate;
    }

    public void report() {
    System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は"+ getRate()+"です。");


    }

}
