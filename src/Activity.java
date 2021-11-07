import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Activity {
    public Activity(Bird bird, int action_code){
        perform_action(bird, action_code);

    }
    private void perform_action(Bird bird, int action_code){
        switch (action_code){
            case 1:
                System.out.println(bird.getBird_actions_map().get("crying"));
                break;
            case 2:
                System.out.println(bird.getBird_actions_map().get("eating"));
                break;
            case 3:
                System.out.println(bird.getBird_actions_map().get("flying"));
                break;
            case 4:
                System.out.println(bird.getBird_actions_map().get("running"));
                break;
            case 5:
                System.out.println(bird.getBird_actions_map().get("swimming"));
                break;
            default:
                break;
        }
    }
}
