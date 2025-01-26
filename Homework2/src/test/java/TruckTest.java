import org.test.Car;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TruckTest {
    @Test
    public void test() {
        String frame = "Лак";
        Car car = new Car(13, 14, 15, "Зимняя", "Электро", "Красный", "Метал");
        Assert.assertEquals(car.getFrame(), frame);
    }

    @Test
    public void test1() {
        Car car = new Car(13, 14, 15, "Зимняя", "Электро", "Красный", "Метал");
        Assert.assertEquals(car, new Car(12, 15, 17, "Зимняя", "Электро", "Красный", "Метал"), "Не верные параметры обьекта");
    }

    @Test
    public void test2() {
        int numberSeaats = 2;
        Car car = new Car(13, 14, 15, "Зимняя", "Электро", "Красный", "Метал");
        Assert.assertEquals(car.getNuberseats(2), numberSeaats);
    }
}

