package jp.co.baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam();
        team01.name = "東京ヤクルトスワローズ";
        team01.win = 80;
        team01.lose = 59;
        team01.draw = 4;
        team01.report();

        BaseBallTeam team02 = new BaseBallTeam();
        team02.name = "横浜DeNAベイスターズ";
        team02.win = 73;
        team02.lose = 68;
        team02.draw = 2;
        team02.report();

        BaseBallTeam team03 = new BaseBallTeam();
        team03.name = "阪神タイガース";
        team03.win = 68;
        team03.lose = 71;
        team03.draw = 4;
        team03.report();

        BaseBallTeam team04 =new BaseBallTeam();
        team04.name ="読売ジャイアンツ";
        team04.win =68;
        team04.lose = 72;
        team04.draw = 3;
        team04.report();

        BaseBallTeam team05 = new BaseBallTeam();
        team05.name ="広島東洋カープ";
        team05.win = 66;
        team05.lose = 74;
        team05.draw = 3;
        team05.report();

        BaseBallTeam team06 = new BaseBallTeam();
        team06.name ="中日ドラゴンズ";
        team06.win = 66;
        team06.lose = 75;
        team06.draw = 2;
        team06.report();

    }

}
