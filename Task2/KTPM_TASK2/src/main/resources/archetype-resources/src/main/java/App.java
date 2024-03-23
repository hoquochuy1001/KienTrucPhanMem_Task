package $com.iuh.huy;

/**
 * Hello world!
 *
 */
public class extends VoidVisitorAdapter<Void>{

private static final String FILE_PATH = "D:\\z_nam_4\\hk2\\KienTrucPhanMem\\KTPM_TASK2\\src\\main\\resources\\archetype-resources\\src\\main\\java\\Attribute\\Information.java";

@Override
public void visit(MethodDeclaration n, Void arg) {
        // TODO Auto-generated method stub
        super.visit(n, arg);
        System.out.println(n.getName());
        }
public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        CompilationUnit cu = StaticJavaParser
        .parse(Files.newInputStream(Paths.get(FILE_PATH)));
        VoidVisitor<Void> methodNameVisitor = new TestAST();
        methodNameVisitor.visit(cu, null);
        List<Comment> comments = cu.getAllContainedComments();
        System.out.println(comments);
        }

        }
