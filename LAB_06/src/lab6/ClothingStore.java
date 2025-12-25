package lab6;

/**
 * Клас, що представляє Магазин Одягу в торговому центрі
 */
public class ClothingStore implements Comparable<ClothingStore> {
    private String name;
    private double area;
    private int monthlyRevenue;

    /**
     * Конструктор для створення Магазину Одягу
     * @param name Назва магазину
     * @param area Площа магазину в квадратних метрах
     * @param monthlyRevenue Щомісячний дохід в грошових одиницях
     */
    public ClothingStore(String name, double area, int monthlyRevenue) {
        this.name = name;
        this.area = area;
        this.monthlyRevenue = monthlyRevenue;
    }

    /**
     * Отримати назву магазину
     * @return Назва магазину
     */
    public String getName() { return name; }

    /**
     * Отримати площу магазину
     * @return Площа магазину в квадратних метрах
     */
    public double getArea() { return area; }

    /**
     * Отримати щомісячний дохід
     * @return Щомісячний дохід в грошових одиницях
     */
    public int getMonthlyRevenue() { return monthlyRevenue; }

    /**
     * Порівнює магазини за щомісячним доходом
     * @param other Інший магазин для порівняння
     * @return від'ємне число, якщо цей магазин має менший дохід,
     *         додатне число, якщо більший, 0 якщо доходи рівні
     */
    @Override
    public int compareTo(ClothingStore other) {
        return Integer.compare(this.monthlyRevenue, other.monthlyRevenue);
    }

    @Override
    public String toString() {
        return "Магазин одягу{назва='" + name + "', площа=" + area +
                ", щомісячний дохід=" + monthlyRevenue + "}";
    }
}
