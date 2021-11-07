import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bird_type {
    private String bird_type;
    private List<String> food_list;

    public Bird_type(String bird_type) {
        this.bird_type = bird_type;
        food_list = setFoodList(bird_type);
    }

    public String getBird_type() {
        return bird_type;
    }

    public List<String> getFood_list() {
        return food_list;
    }

    private List<String> setFoodList(String bird_type) {
        List<String> food_list = new ArrayList<>();
        if (bird_type.equals(bird_type = "bat")) {
            food_list.add("insects");
            food_list.add("fruits");
            food_list.add("nectar");
            food_list.add("pollen");
            return food_list;
        } else if (bird_type == "duck") {
            food_list.add("sweetcorn");
            food_list.add("lettuce");
            food_list.add("peas");
            food_list.add("oats");
            food_list.add("seeds");
            food_list.add("rice");
            return food_list;
        } else if (bird_type == "eagle") {
            food_list.add("fish");
            food_list.add("small birds");
            food_list.add("reptiles");
            food_list.add("rabbits");
            food_list.add("ground squirrels");
            food_list.add("bighorn sheep");
            return food_list;
        } else if (bird_type.equals(bird_type == "kiwi")) {
            food_list.add("woodlice");
            food_list.add("centipedes");
            food_list.add("centipedes");
            food_list.add("slugs");
            food_list.add("snails");
            food_list.add("spiders");
            food_list.add("insects");
            food_list.add("seeds");
            food_list.add("berries");
            food_list.add("plant material");
            return food_list;
        } else if (bird_type == "ostrich") {
            food_list.add("green grasses");
            food_list.add("wild leaves and bushes");
            food_list.add("shrubs");
            food_list.add("plant roots");
            food_list.add("plant seeds");
            food_list.add("sprouts");
            food_list.add("berries");
            food_list.add("nuts");
            food_list.add("succulents");
            food_list.add("mice");
            food_list.add("rats");
            food_list.add("snakes");
            food_list.add("lizards");
            food_list.add("frogs");
            food_list.add("grasshoppers");
            food_list.add("locusts");
            food_list.add("crickets");
            food_list.add("moths");
            return food_list;
        } else if (bird_type.equals(bird_type == "penguin")) {
            food_list.add("fish");
            food_list.add("krill");
            food_list.add("squids");
            return food_list;
        } else if (bird_type.equals(bird_type == "swallow")) {
            food_list.add("flies");
            food_list.add("grasshoppers");
            food_list.add("crickets");
            food_list.add("dragonflies");
            food_list.add("beetles");
            return food_list;
        }
        return Collections.EMPTY_LIST;
    }
}
