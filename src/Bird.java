import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bird {
    private List<String> bird_type = new ArrayList<>();
    private Bird_type type;
    public Map<String, String> bird_actions_map = new HashMap<>();

    Bird(String bird_type) {
        type = new Bird_type(bird_type);
        fillBirdActions(type, bird_actions_map);
    }
    public Map<String, String> getBird_actions_map() {
        return bird_actions_map;
    }

    private void fillBirdActions(Bird_type bird_type, Map<String, String> map) {
        switch (bird_type.getBird_type()) {
            case "bat":
                map.put("crying", "pipipip");
                map.put("eating", "bat is eating " + bird_type.getFood_list().get((int) Math.random() * bird_type.getFood_list().size()));
                map.put("flying", "bats flies great");
                break;
            case "duck":
                map.put("eating", "duck is eating " + bird_type.getFood_list().get((int) Math.random() * bird_type.getFood_list().size()));
                map.put("crying", "quack quack");
                map.put("swimming", "duck swim in wetlands, marshes, ponds, rivers, lakes and oceans");
                map.put("running", "Duck is running");
                break;
            case "eagle":
                map.put("eating", "eagle is eating " + bird_type.getFood_list().get((int) Math.random() * bird_type.getFood_list().size()));
                map.put("flying", "Eagle is flying");
                map.put("crying", "kwit-kwit-kwit-kwit-kee-kee-kee-kee-ker");
                break;
            case "kiwi":
                map.put("eating", "kiwi is eating " + bird_type.getFood_list().get((int) Math.random() * bird_type.getFood_list().size()));
                map.put("running", "Kiwi is running");
                map.put("crying", "ki-ki-ki-ki-ki-ki-ker");
                break;
            case "ostrich":
                map.put("running", "Ostrich is running in savannas and woodlands of Africa");
                map.put("eating", "ostrich is eating " + bird_type.getFood_list().get((int) Math.random() * bird_type.getFood_list().size()));
                map.put("crying", "Ostrich is crying");
                break;
            case "penguin":
                map.put("running", "Penguin is rolling on the belly");
                map.put("crying", "peep peep");
                map.put("eating", "Penguin is eating " + bird_type.getFood_list().get((int) Math.random() * bird_type.getFood_list().size()));
                break;
            case "swallow":
                map.put("flying", "Swallow fly very fast");
                map.put("crying", "cirrrririri");
                map.put("eating", "Swallow is eating " + bird_type.getFood_list().get((int) Math.random() * bird_type.getFood_list().size()));
                break;
            default:
                break;
        }
    }
}

