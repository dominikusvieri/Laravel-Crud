public class HeroStrength extends Hero {
    // kosong

    //attribute
    int defencePower;

    // overriding -> membaca dari child class
    public void display(){
        System.out.println("\nHero Strength");
        System.out.println("Heros Name : "+this.name);
        System.out.println("Defence Power : "+this.defencePower);
    }
}
