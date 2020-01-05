@Controller
public class MainController {

    /* 前后端调用 */
    @PostMapping("/url-name")
    @ResponseBody
    public Map<String, Object> FrontBackInteract(@RequestBody Map<String,Object> front_map){
        //获取前端数据
        String front_data = front_map.get("front_data").toString();

        //TODO 业务逻辑

        //向前端传递数据
        Map<String, Object> back_map = new HashMap<>();
        back_map.put("back_data", "this is a back-end data");
        return back_map;
    }
}