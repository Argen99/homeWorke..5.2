package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700,50,"Защита");
        System.out.println("Boss" + " " + boss.getHealth()
                + " " + boss.getDamage()+ " " + boss.getDefence());

        createHeroes();
        Hero[] heroes1 = createHeroes();
        for (int i = 0; i < heroes1.length; i++) {
            if (heroes1[i].getSuperDamage() == null)
                System.out.println(heroes1[i].getHealth() + " " + heroes1[i].getDamage());
            else
                System.out.println(heroes1[i].getHealth() + " " + heroes1[i].getDamage() + " " + heroes1[i].getSuperDamage());


        }
    }
    public static Hero[] createHeroes() {
        Hero Jax = new Hero(250, 25);
        Hero Sonya = new Hero(200, 30);
        Hero Kano = new Hero(300, 20, "Стреляет из пистолета");
        Hero[] heroes = {Jax, Sonya, Kano};
        return heroes;
    }
}
