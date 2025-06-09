//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        Hero h1 = new Hero("ミナト");

        Hero h2 = new Hero("アサカ");

        Hero h3 = new Hero();

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;

        h1.showStatus();
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
        h2.showStatus();
        h3.showStatus();
    }
}