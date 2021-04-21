import java.util.List;

public interface RouteProvider {
    List<PathElement> getRoute(Integer firstID, Integer secondID, Network net);// throws RouteNotFoundException;
    String getDescription();
}
