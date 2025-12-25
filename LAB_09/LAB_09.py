from TouchScreen import TouchScreen

if __name__ == "__main__":
    # Створюємо сенсорний екран
    screen = TouchScreen("Samsung", "27 дюймів", "1920x1080", 10)

    # Початковий статус
    print("\n1. Початковий стан монітора:")
    print(screen.get_status())

    # Увімкнення монітора
    print("\n2. Увімкнення монітора:")
    screen.turn_on()
    print(screen.get_status())

    # Зміна яскравості
    print("\n3. Змінюємо яскравість:")
    screen.set_brightness(70)
    print(f"Поточна яскравість: {screen.get_brightness()}%")

    # Включення режиму енергозбереження
    print("\n4. Увімкнення енергозбереження:")
    screen.enable_power_saving_mode()
    print(screen.get_status())

    # Відключення енергозбереження
    print("\n5. Вимкнення енергозбереження:")
    screen.disable_power_saving_mode()
    print(screen.get_status())

    # Зміна кількості дотиків, які обробляє екран
    print("\n6. Змінюємо кількість сенсорних точок:")
    screen.set_touch_points(5)
    print(f"Кількість сенсорних точок: {screen.get_touch_points()}")

    # Використання жестів
    print("\n7. Використовуємо жест:")
    screen.use_gesture("зум")
    screen.use_gesture("прокрутка")

    # Додавання нового жесту
    print("\n8. Додаємо новий жест:")
    screen.add_gesture("двійний тап")
    screen.use_gesture("двійний тап")

    # Вимикаємо монітор
    print("\n9. Вимикаємо монітор:")
    screen.turn_off()
    print(screen.get_status())

    # Скидаємо налаштування
    print("\n10. Скидаємо налаштування:")
    screen.reset_settings()
    print(screen.get_status())
