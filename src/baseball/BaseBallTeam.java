package baseball;
//設計図クラス
public class BaseBallTeam {

    //フィールド、変数定義（属性）
    public String name;
    public int win;
    public int lose;
    public int draw;

    //コンストラクタ
    //コンストラクタ名はクラス名と等しく、void含む戻り値型を記述しない。
    //Constructor1: 引数なし（念の為）
    public BaseBallTeam() {
    }

    //Constructor2: 引数あり
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //メソッド（操作）

    public double getRate() {
        double rate = ((double)win / ((double)win + (double)lose));
        return rate;
    }

    public void report () {
        System.out.println(name + "の2022年の成績は、" + win + "勝 " + lose + "負 " + draw + "分、勝率は"
        + getRate() + "です。");
    }





}