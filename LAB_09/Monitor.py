class Monitor:
    """
    Клас Monitor представляє базові характеристики монітора.
    """

    def __init__(self, brand, size, resolution):
        """
        Ініціалізує монітор.

        :param brand: Бренд монітора.
        :param size: Розмір екрана.
        :param resolution: Роздільна здатність монітора.
        """
        self.brand = brand
        self.size = size
        self.resolution = resolution
        self.is_on = False
        self.brightness = 50  # За замовчуванням 50%
        self.power_saving_mode = False

    def turn_on(self):
        """
        Увімкнення монітора.
        """
        self.is_on = True
        print("Монітор увімкнено.")

    def turn_off(self):
        """
        Вимикання монітора.
        """
        self.is_on = False
        print("Монітор вимкнено.")

    def set_brightness(self, value):
        """
        Встановлює рівень яскравості.

        :param value: Яскравість (0-100).
        """
        if 0 <= value <= 100:
            self.brightness = value
            print(f"Яскравість встановлена на {value}%.")
        else:
            print("Некоректне значення яскравості!")

    def get_brightness(self):
        """
        Повертає поточний рівень яскравості.
        """
        return self.brightness

    def enable_power_saving_mode(self):
        """
        Увімкнення режиму енергозбереження.
        """
        self.power_saving_mode = True
        print("Режим енергозбереження увімкнено.")

    def disable_power_saving_mode(self):
        """
        Вимкнення режиму енергозбереження.
        """
        self.power_saving_mode = False
        print("Режим енергозбереження вимкнено.")

    def reset_settings(self):
        """
        Скидає налаштування монітора.
        """
        self.brightness = 50
        self.power_saving_mode = False
        print("Налаштування монітора скинуто до стандартних.")

    def get_status(self):
        """
        Повертає статус монітора.
        """
        power_status = "увімкнено" if self.is_on else "вимкнено"
        saving_status = "увімкнено" if self.power_saving_mode else "вимкнено"
        return (
            f"Монітор {self.brand}, розмір: {self.size}, роздільна здатність: {self.resolution}.\n"
            f"Статус: {power_status}, яскравість: {self.brightness}%, режим енергозбереження: {saving_status}."
        )

