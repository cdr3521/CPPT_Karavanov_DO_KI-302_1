from Monitor import Monitor


class TouchScreen(Monitor):
    """
    Клас TouchScreen розширює функціональність базового монітора, додаючи сенсорні можливості.
    """

    def __init__(self, brand, size, resolution, touch_points):
        """
        Ініціалізує сенсорний екран.

        :param brand: Бренд монітора.
        :param size: Розмір екрана.
        :param resolution: Роздільна здатність монітора.
        :param touch_points: Кількість сенсорних точок.
        """
        super().__init__(brand, size, resolution)
        self.touch_points = touch_points
        self.gestures = ["зум", "прокрутка", "перетягування"]

    def set_touch_points(self, count):
        """
        Встановлює кількість сенсорних точок.

        :param count: Нова кількість точок.
        """
        self.touch_points = count
        print(f"Кількість сенсорних точок встановлено на {count}.")

    def get_touch_points(self):
        """
        Повертає кількість сенсорних точок.
        """
        return self.touch_points

    def use_gesture(self, gesture):
        """
        Використовує жест, якщо він доступний.

        :param gesture: Назва жесту.
        """
        if gesture in self.gestures:
            print(f"Жест '{gesture}' виконано.")
        else:
            print(f"Жест '{gesture}' не підтримується.")

    def add_gesture(self, gesture):
        """
        Додає новий жест.

        :param gesture: Назва нового жесту.
        """
        if gesture not in self.gestures:
            self.gestures.append(gesture)
            print(f"Жест '{gesture}' додано.")
        else:
            print(f"Жест '{gesture}' вже існує.")
