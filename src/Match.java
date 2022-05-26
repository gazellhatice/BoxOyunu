public class Match {
    Competant Cmp1, Cmp2;
    int minW, maxW;



    Match(Competant f1, Competant f2, int w1, int w2) {
        this.Cmp1=f1;
        this.Cmp2=f2;
        this.minW=w1;
        this.maxW=w2;
    }



    public void BeginFightOp1First() {
        int round=1;
        if(BeginCheck()) {
            while (this.Cmp1.Hp>0 && this.Cmp2.Hp>0) {
                System.out.printf("======== %d. ROUND ========\n",round);
                this.Cmp2.Hp=this.Cmp1.Attack(this.Cmp2);
                if (WinCheck())
                    break;
                this.Cmp1.Hp=this.Cmp2.Attack(this.Cmp1);
                if(WinCheck())
                    break;
                System.out.println(this.Cmp1.Name+" kalan saglik: "+this.Cmp1.Hp);
                System.out.println(this.Cmp2.Name+" kalan saglik: "+this.Cmp2.Hp);
                round+=1;
            }
        } else
            System.out.println("Sporcularin sikletleri uymuyor.");
    }



    public void BeginFightOp2First() {
        int round=1;
        if(BeginCheck()) {
            while (this.Cmp1.Hp>0 && this.Cmp2.Hp>0) {
                System.out.printf("======== %d. ROUND ========\n",round);
                this.Cmp1.Hp=this.Cmp2.Attack(this.Cmp1);
                if (WinCheck())
                    break;
                this.Cmp2.Hp=this.Cmp1.Attack(this.Cmp2);
                if(WinCheck())
                    break;
                System.out.println(this.Cmp1.Name+" kalan saglik: "+this.Cmp1.Hp);
                System.out.println(this.Cmp2.Name+" kalan saglik: "+this.Cmp2.Hp);
                round+=1;
            }
        } else
            System.out.println("Sporcularin sikletleri uymuyor.");
    }


    public boolean BeginCheck() {
        return (this.Cmp1.Weight>=minW && this.Cmp1.Weight<=maxW) && (this.Cmp2.Weight>=minW && this.Cmp2.Weight<=maxW);
    }


    public boolean WinCheck() {
        if(this.Cmp1.Hp==0) {
            System.out.println("Kazanan yarismaci: "+this.Cmp2.Name);
            return true;
        }

        if(this.Cmp2.Hp==0) {
            System.out.println("Kazanan yarismaci: "+this.Cmp1.Name);
            return true;
        }
        return false;
    }
}
