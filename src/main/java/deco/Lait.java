package deco;

import produits.Boisson;

public class Lait extends DecoratorBoisson{
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au lait";
    }

    @Override
    public double cout() {
        return 2+boisson.cout();
    }
}
