package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        team01.getRate();
        team01.report();
        BaseBallTeam team02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        team02.getRate();
        team02.report();
        BaseBallTeam team03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        team03.getRate();
        team03.report();
        BaseBallTeam team04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        team04.getRate();
        team04.report();
        BaseBallTeam team05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        team05.getRate();
        team05.report();
        BaseBallTeam team06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        team06.getRate();
        team06.report();
        }
}
