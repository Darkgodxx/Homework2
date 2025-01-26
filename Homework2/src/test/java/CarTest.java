
import org.test.Car;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CarTest {
    @Test
    public void test() {
        String frame = "Метал-Лак";
        Car car = new Car(13, 14, 15, "Зимняя", "Электро", "Красный", "Метал");
        Assert.assertEquals(car.getFrame(), frame);
    }

    @Test
    public void test1() {
        String sounds = "Туту";
        Car car = new Car(13, 14, 15, "Зимняя", "Электро", "Красный", "Метал");
        Assert.assertEquals(car.getSounds("Туту"), sounds);
    }

    @Test
    public void test2() {
        int numberSeaats = 2;
        Car car = new Car(13, 14, 15, "Зимняя", "Электро", "Красный", "Метал");
        Assert.assertEquals(car.getNuberseats(2), numberSeaats);
    }
}
