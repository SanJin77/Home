import com.alibaba.druid.support.json.JSONUtils;

public class akk {
    public static void main(String[] args) {
        String json = "{\"name\":\"zhangsan\",\"age\":20}";
        System.out.println(JSONUtils.toJSONString(json));
        System.out.println("nihao");
    }
}
