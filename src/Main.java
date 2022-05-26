import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        float CoinFlip=(float) Math.random()*100;
        Competant cp1 = new Competant("Rocky",85,12,90,65);
        Competant cp2 = new Competant("The Lord",94,15,98,76);

        Match mt1 = new Match(cp1,cp2,80,98);

        System.out.println("Kimin ilk baslayacagini belirlemek icin yazi tura atiliyor...");
        if(CoinFlip>50) {
            System.out.println("Ilk hamleyi "+cp1.Name+" yapacak...");
            mt1.BeginFightOp1First();
        } else {
            System.out.println("Ilk hamleyi "+cp2.Name+" yapacak...");
            mt1.BeginFightOp2First();
        }
    }
}