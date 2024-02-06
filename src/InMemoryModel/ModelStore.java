package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models = new ArrayList<>();
    public List<Scene> Scenes = new ArrayList<>();
    public List<Flash> Flashes = new ArrayList<>();
    public List<Camera> Cameras = new ArrayList<>();
    private List<IModelChangedObserver> changedObserver;

    public ModelStore(List<IModelChangedObserver> changedObserver) {
        this.changedObserver = changedObserver;
        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(1, Models, Flashes, Cameras));
    }

    public Scene GetScene(int id) {
        return Scenes.stream()
                .filter(x -> x.id == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void NotifyCange(IModelChanger sender) {

    }
}
