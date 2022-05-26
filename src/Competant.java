public class Competant {
    String Name;
    int Hp, Dmg, Weight, dodge;

    Competant(String name, int hp, int dmg, int weight, int dod) {
        this.Name=name;
        this.Hp=hp;
        this.Dmg=dmg;
        this.Weight=weight;
        this.dodge=dod;
    }

    int Attack(Competant opp) {
        System.out.println(this.Name+", "+opp.Name+" oyuncusuna "+this.Dmg+" hasar verdi.");
        if(opp.DodgeCheck()) {
            System.out.println(opp.Name+" gelen hasari savusturdu!");
            return opp.Hp;
        }

        if(opp.Hp-this.Dmg<0)
            return 0;
        return (opp.Hp)-(this.Dmg);
    }

    boolean DodgeCheck() {
        float rand = (float) Math.random()*100;
        return rand<this.dodge;
    }

}
