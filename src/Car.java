/* В цьому завданні треба зробити метод compareTo в представленому класі
 В цьому методі необхідно реалізувати порівняння двох об'єктів за такими параметрами та в такому порядку:
 швидкість, ціна, модель, колір.
 Тобто, якщо у двох машин однакова швидкість, то метод не має повертати результат, що ці об'єкти рівні,
 а має перейти до порівняння наступних параметрів.
 Якщо ж усі параметри автомобілів однакові, тоді цей метод має повернути результат, що машини рівні
*/

public class Car implements Comparable<Car> {
    private final int speed;
    private final int price;
    private final String model;
    private final String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public int compareTo(Car other) {
        if (this.speed != other.speed) {
            return Integer.compare(this.speed, other.speed);
        } else if (this.price != other.price) {
            return Integer.compare(this.price, other.price);
        } else if (!this.model.equals(other.model)) {
            return this.model.compareTo(other.model);
        } else {
            return this.color.compareTo(other.color);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class NewCar {
    public static void main(String[] args) {
        Car car1 = new Car(220, 1234, "BMW", "Black");
        Car car2 = new Car(220, 1234, "BMW", "Black");
        int result = car1.compareTo(car2);
        if (result == 0) {
            System.out.println("Машини однакові");
        } else if (result > 0) {
            System.out.println("Перша машина краща за другу");
        } else {
            System.out.println("Друга машина краща за першу");
        }
    }
}