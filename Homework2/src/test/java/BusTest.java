import org.test.Car;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BusTest {
    @Test
    public void test() {
        Car car = new Car(16, 18, 12, "Летняя", "Мех", "Зеленый", "Алюминий");
        Assert.assertNotNull(car, "Обьект не создан");
    }
    @Test
    public void test1() {
        Car car = new Car(13, 14, 15, "Летняя", "Мех", "Зеленый", "Алюминий");
        Assert.assertTrue(0 < car.getNuberseats(-2), "Колличество мест не может быть отрицательным");
    }
    @Test
    public void test2() {
        Car car = new Car(13, 14, 15, "Летняя", "Мех", "Зеленый", "Алюминий");
        Assert.assertNotEquals(car, new Car(12,13,14,"Летняя", "Мех", "Зеленый", "Алюминий"));
    }
}
