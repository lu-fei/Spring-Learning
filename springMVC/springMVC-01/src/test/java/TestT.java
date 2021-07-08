import java.util.ArrayList;

/**
 * 测试泛型
 * */
public class TestT {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ArrayList<String> res = convert(list);
        for(String s : res){
            System.out.print(s + "\t");
        }

    }

    public static ArrayList<String> convert(ArrayList<Integer> list){
        ArrayList<String> res = new ArrayList<>();
        for(Integer x : list){
            res.add(x + "");
        }
        return res;
    }

}

