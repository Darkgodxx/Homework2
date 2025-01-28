
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
        car.setSounds("Туту");
        Assert.assertEquals(car.getSounds(), sounds);
    }

    @Test
    public void test2() {
        int numberSeaats = 13;
        Car car = new Car(13, 14, 15, "Зимняя", "Электро", "Красный", "Метал");
        car.setNuberseats(13);
        Assert.assertEquals(car.getNuberseats(), numberSeaats);
    }
}
