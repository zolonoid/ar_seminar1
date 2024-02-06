package ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        if (models.isEmpty() || cameras.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.id = id;
        Models = models;
        Flashes = flashes;
        Cameras = cameras;
    }

    public Type method1(Type param) {
        return null;
    }

    public Type method2(Type param1, Type param2) {
        return null;
    }
}
