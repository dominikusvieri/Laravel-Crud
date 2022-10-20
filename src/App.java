public class App {
    static double maxNumber(double a, double b){
        if(a<b){
            return a;
        } else{
            return b;
        }
    }

    static int maxNumber(int a, int b){
        if(a<b){
            return a;
        } else{
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero();
        hero1.name = "Yosi";
        // System.out.println("Hero 1 : "+hero1.name);
        hero1.display();

        Hero hero2 = new HeroStrength();
        hero2.name = "Cute";
        // System.out.println("Hero 2 : "+hero2.name);
        hero2.display();

        Hero hero3 = new HeroStrength();
        hero3.name = "Ucok";
        // System.out.println("Hero 2 : "+hero2.name);
        hero2.display();

        System.out.println("----------------overloading------------");
        System.out.println(maxNumber(5.5, 4.5));
        System.out.println(maxNumber(5, 4));

        System.out.println("----------------overriding------------");
        Hewan kucing = new kucing();
        kucing.munculSuara();

        Hewan burung = new burung();
        burung.munculSuara();
    }
}

abstract class Hewan{
    protected abstract void munculSuara();
}

class kucing extends Hewan{
    @Override
    protected void munculSuara(){
        System.out.println("Suara Kucing : meong");
    }
}

class burung extends Hewan{
    @Override
    protected void munculSuara(){
        System.out.println("Suara burung : cik");
    }
}
