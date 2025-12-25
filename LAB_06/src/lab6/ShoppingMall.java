package lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Узагальнений клас, що представляє Торговий Центр, який може містити різні типи магазинів
 * @param <T> тип магазинів, якими керує торговий центр (повинен реалізовувати Comparable)
 */
public class ShoppingMall<T extends Comparable<T>> {
    private List<T> stores;

    /**
     * Конструктор для створення Торгового Центру
     */
    public ShoppingMall() {
        this.stores = new ArrayList<>();
    }

    /**
     * Додає магазин до торгового центру
     * @param store Магазин, який потрібно додати
     */
    public void addStore(T store) {
        stores.add(store);
    }

    /**
     * Видаляє магазин з торгового центру
     * @param store Магазин, який потрібно видалити
     * @return true якщо магазин було успішно видалено
     */
    public boolean removeStore(T store) {
        return stores.remove(store);
    }

    /**
     * Знаходить магазин з максимальним значенням
     * @return Магазин з максимальним значенням або null якщо торговий центр порожній
     */
    public T findMaxStore() {
        if (stores.isEmpty()) {
            return null;
        }

        T max = stores.get(0);
        for (T store : stores) {
            if (store.compareTo(max) > 0) {
                max = store;
            }
        }
        return max;
    }

    /**
     * Отримує список всіх магазинів
     * @return Список всіх магазинів у торговому центрі
     */
    public List<T> getAllStores() {
        return new ArrayList<>(stores);
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "stores=" + stores +
                '}';
    }
}
