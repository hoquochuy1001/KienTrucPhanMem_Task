import jdepend.xmlui.JDepend;
public class Main {
    public static void main(String[] args) throws Exception {
        JDepend depend = new JDepend();
        // path directory
        String prjDir = "src/main/java";
        depend.addDirectory(prjDir);
        // analyze
        depend.analyze();
    }
}