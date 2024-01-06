import com.heroes.devkasatkin.Hero;
import com.heroes.devkasatkin.HeroControl;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(100, 10, 10, "John");
        HeroControl heroControl = new HeroControl(hero);
        System.out.println(hero);
        System.out.println(heroControl.getHero().getHealth());
        heroControl.getDamage(10);
        System.out.println(heroControl.getHero().getHealth());
    }
}
