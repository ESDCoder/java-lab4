package xyz.esdcoder.lab4;

/**
 * Base class for furniture.
 */
public abstract class Mebel {
    protected String tip;
    protected String material;
    protected double cenaZaKub;
    protected double gabarity;

    /**
     * Constructor for Mebel.
     *
     * @param tip Type of furniture.
     * @param material Material of the furniture.
     * @param cenaZaKub Price per cubic meter.
     * @param gabarity Dimensions in cubic meters.
     */
    public Mebel(String tip, String material, double cenaZaKub, double gabarity) {
        this.tip = tip;
        this.material = material;
        this.cenaZaKub = cenaZaKub;
        this.gabarity = gabarity;
    }

    /**
     * Calculates the base cost.
     *
     * @return Base cost.
     */
    protected double getBazovayaStoimost() {
        return cenaZaKub * gabarity;
    }

    /**
     * Calculates the total cost.
     *
     * @return Total cost.
     */
    public abstract double rasschitatStoimost();

    /**
     * Prints furniture information to the console.
     */
    public void vivodInfo() {
        System.out.println("Тип мебели: " + tip);
        System.out.println("Материал: " + material);
        System.out.println("Цена за 1 м³: " + cenaZaKub + " руб.");
        System.out.println("Габариты: " + gabarity + " м³");
        System.out.println("Базовая стоимость: " + getBazovayaStoimost() + " руб.");
    }
}