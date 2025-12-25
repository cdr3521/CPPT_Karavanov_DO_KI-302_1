package lab6;

/**
 * Клас-драйвер для тестування функціональності торгового центру ShoppingMall.
 * Створює приклади магазинів та ресторанів, додає їх до торгового центру, знаходить заклади з максимальними показниками,
 * демонструє видалення закладів та виведення списку наявних.
 */
public class ShoppingMallDriver {
    public static void main(String[] args) {
        // Створюємо торговий центр для магазинів одягу
        ShoppingMall<ClothingStore> clothingMall = new ShoppingMall<>();

        // Додаємо магазини одягу
        clothingMall.addStore(new ClothingStore("Zara", 500.0, 50000));
        clothingMall.addStore(new ClothingStore("H&M", 450.0, 45000));
        clothingMall.addStore(new ClothingStore("Uniqlo", 600.0, 55000));

        // Знаходимо та виводимо магазин з максимальним доходом
        System.out.println("Список магазинів одягу: " + clothingMall);
        System.out.println("Магазин одягу з максимальним доходом: " + clothingMall.findMaxStore());

        // Видаляємо магазин та виводимо його
        ClothingStore storeToRemove = new ClothingStore("Zara", 500.0, 50000);
        clothingMall.removeStore(storeToRemove);
        System.out.println("Видалений магазин: " + storeToRemove);

        // Створюємо торговий центр для ресторанів
        ShoppingMall<Restaurant> foodMall = new ShoppingMall<>();

        // Додаємо ресторани
        foodMall.addStore(new Restaurant("Італійський", 50, 25.0));
        foodMall.addStore(new Restaurant("Суші бар", 30, 35.0));
        foodMall.addStore(new Restaurant("Стейк хаус", 40, 45.0));

        // Виводимо список ресторанів
        System.out.println("Список ресторанів: " + foodMall);

        // Знаходимо та виводимо ресторан з максимальним середнім чеком
        System.out.println("Ресторан з максимальним середнім чеком: " + foodMall.findMaxStore());

        // Видаляємо ресторан та виводимо всі, що залишились
        Restaurant restaurantToRemove = foodMall.getAllStores().get(0);
        foodMall.removeStore(restaurantToRemove);
        System.out.println("\nВсі ресторани що залишились:");
        foodMall.getAllStores().forEach(System.out::println);
    }
}
