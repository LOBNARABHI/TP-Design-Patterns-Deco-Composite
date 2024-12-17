import deco.DecoratorBoisson;
import deco.Lait;
import produits.Boisson;
import produits.Deca;
import produits.Espresso;

public class Application {

    public static void main(String[] args){
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());


        boisson = new Deca();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Lait(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
