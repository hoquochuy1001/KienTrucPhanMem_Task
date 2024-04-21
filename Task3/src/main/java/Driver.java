import java.io.File;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws Exception {
        LCOM4Cal calculation = new LCOM4Cal();
        File file = new File(
                "C:\\Users\\HP\\Desktop\\web\\KienTrucPhanMemTuan3\\demo\\demo\\src\\main\\java\\org\\example\\CBOMetric.java");
        List<Group> lst = calculation.loadGroups(file);
        lst.forEach(System.out::println);
        int lcom4 = calculation.loadGroups(file).size();
        System.out.printf("LCOM4 of class %s is %d\n", file.getName(), lcom4);
    }
}