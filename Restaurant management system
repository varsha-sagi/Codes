class MenuItem:
    def __init__(self, name, price):
        self.name = name
        self.price = price

class Restaurant:
    def __init__(self):
        self.menu = {}

    def add_item_to_menu(self, name, price):
        self.menu[name] = price

    def display_menu(self):
        print("      BON APPETITE    ")
        print("Menu:")
        for item, price in self.menu.items():
            print(f"{item}: ${price:.2f}")

    def take_order(self):
        order_items = {}
        print("Enter your order (item, quantity), press 'q' to finish:")
        while True:
            item = input("Item: ").strip()
            if item.lower() == 'q':
                break
            quantity = int(input("Quantity: "))
            order_items[item] = order_items.get(item, 0) + quantity

        total = 0
        print("Order Summary:")
        for item, quantity in order_items.items():
            if item in self.menu:
                price = self.menu[item]
                print(f"{item} x {quantity} = ${price * quantity:.2f}")
                total += price * quantity
            else:
                print(f"{item} not found in the menu!")

        print(f"Total: ${total:.2f}")


if __name__ == "__main__":
    restaurant = Restaurant()
    restaurant.add_item_to_menu("Burger", 9.99)
    restaurant.add_item_to_menu("Pizza", 12.99)
    restaurant.add_item_to_menu("Salad", 7.99)
    restaurant.add_item_to_menu("Nacho",8.00)
    restaurant.add_item_to_menu("Mojito",7.56)
    restaurant.add_item_to_menu("Spaghetti",11.90)
    restaurant.add_item_to_menu("Pasta",10.60)
    restaurant.add_item_to_menu("Garlic knots",7.00)
    restaurant.add_item_to_menu("Tiramisu",9.70)
    restaurant.add_item_to_menu("lasagna",8.45)

    restaurant.display_menu()
    restaurant.take_order()

