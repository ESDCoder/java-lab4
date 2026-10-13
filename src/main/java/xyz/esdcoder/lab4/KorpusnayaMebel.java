package xyz.esdcoder.lab4;

/**
 * Derived class for cabinet furniture.
 */
public class KorpusnayaMebel extends Mebel {
    private boolean nuzhnaSborka;
    private double stoimostFurnitury;
    private int garantiyaMesyacev;

    /**
     * Constructor for KorpusnayaMebel.
     *
     * @param tip Type of furniture.
     * @param material Material of the furniture.
     * @param cenaZaKub Price per cubic meter.
     * @param gabarity Dimensions in cubic meters.
     * @param nuzhnaSborka Whether assembly is required.
     * @param stoimostFurnitury Cost of fittings.
     * @param garantiyaMesyacev Warranty months.
     */
    public KorpusnayaMebel(String tip, String material, double cenaZaKub, double gabarity,
                          boolean nuzhnaSborka, double stoimostFurnitury, int garantiyaMesyacev) {
        super(tip, material, cenaZaKub, gabarity);
        this.nuzhnaSborka = nuzhnaSborka;
        this.stoimostFurnitury = stoimostFurnitury;
        this.garantiyaMesyacev = garantiyaMesyacev;
    }

    /**
     * Calculates total cost for cabinet furniture.
     *
     * @return Total cost.
     */
    @Override
    public double rasschitatStoimost() {
        double bazovayaStoimost = getBazovayaStoimost();
        double itog = bazovayaStoimost + stoimostFurnitury;

        if (nuzhnaSborka) {
            itog += bazovayaStoimost * 0.20;
        }

        double koefGarantiya = 1.0;
        if (garantiyaMesyacev == 6) {
            koefGarantiya = 1.1;
        } else if (garantiyaMesyacev == 12) {
            koefGarantiya = 1.4;
        }

        return itog * koefGarantiya;
    }

    /**
     * Prints cabinet furniture information to the console.
     */
    @Override
    public void vivodInfo() {
        super.vivodInfo();
        System.out.println("Нужна сборка: " + (nuzhnaSborka ? "Да" : "Нет"));
        System.out.println("Стоимость фурнитуры: " + stoimostFurnitury + " руб.");
        System.out.println("Гарантия: " + garantiyaMesyacev + " мес.");
        System.out.println("Итоговая стоимость корпусной мебели: " + rasschitatStoimost() + " руб.");
    }
}