package lab6;

/**
 * Клас, що представляє Ресторан в торговому центрі
 */
public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int seatingCapacity;
    private double averageCheck;

    /**
     * Конструктор для створення Ресторану
     * @param name Назва ресторану
     * @param seatingCapacity Кількість посадкових місць
     * @param averageCheck Середній чек
     */
    public Restaurant(String name, int seatingCapacity, double averageCheck) {
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.averageCheck = averageCheck;
    }

    /**
     * Отримати назву ресторану
     * @return Назва ресторану
     */
    public String getName() { return name; }

    /**
     * Отримати кількість посадкових місць
     * @return Кількість посадкових місць
     */
    public int getSeatingCapacity() { return seatingCapacity; }

    /**
     * Отримати середній чек
     * @return Середній чек в грошових одиницях
     */
    public double getAverageCheck() { return averageCheck; }

    /**
     * Порівнює ресторани за середнім чеком
     * @param other Інший ресторан для порівняння
     * @return від'ємне число, якщо цей ресторан має менший середній чек,
     *         додатне число, якщо більший, 0 якщо чеки рівні
     */
    @Override
    public int compareTo(Restaurant other) {
        return Double.compare(this.averageCheck, other.averageCheck);
    }

    @Override
    public String toString() {
        return "Ресторан{назва='" + name + "', місць=" + seatingCapacity +
                ", середній чек=" + averageCheck + "}";
    }
}
