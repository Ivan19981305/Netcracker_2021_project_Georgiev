import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkTest {
    //Объект(объекты) класса Network
    Network network;
    //Список классов RouteProvider (hardCode/Reflection)
    List<Class> classList;
    //команда с консоли


    public NetworkTest(Network network) {
        this.network = network;
        this.classList = new ArrayList<Class>(Arrays.asList(RouteProvider.class.getClasses()));
    }
}
