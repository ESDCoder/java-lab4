package xyz.esdcoder.lab4;

/**
 * Derived class for soft furniture.
 */
public class MyagkayaMebel extends Mebel {
    private double k1;
    private double k2;
    private double k3;

    /**
     * Constructor for MyagkayaMebel.
     *
     * @param tip Type of furniture.
     * @param material Material of the furniture.
     * @param cenaZaKub Price per cubic meter.
     * @param gabarity Dimensions in cubic meters.
     * @param k1 Fabric coefficient.
     * @param k2 Filler coefficient.
     * @param k3 Mechanism coefficient.
     */
    public MyagkayaMebel(String tip, String material, double cenaZaKub, double gabarity,
                         double k1, double k2, double k3) {
        super(tip, material, cenaZaKub, gabarity);
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
    }

    /**
     * Calculates total cost for soft furniture.
     *
     * @return Total cost.
     */
    @Override
    public double rasschitatStoimost() {
        double bazovayaStoimost = getBazovayaStoimost();
        return bazovayaStoimost + (bazovayaStoimost * k1) + (bazovayaStoimost * k2) + (bazovayaStoimost * k3);
    }

    /**
     * Prints soft furniture information to the console.
     */
    @Override
    public void vivodInfo() {
        super.vivodInfo();
        System.out.println("Коэффициент ткани (k1): " + k1);
        System.out.println("Коэффициент наполнителя (k2): " + k2);
        System.out.println("Коэффициент механизма (k3): " + k3);
        System.out.println("Итоговая стоимость мягкой мебели: " + rasschitatStoimost() + " руб.");
    }
}