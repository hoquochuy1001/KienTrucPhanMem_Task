import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.List;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class Main extends VoidVisitorAdapter<Void>{

    private static final String FILE_PATH = "src/main/java/Infomation.java";

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
        VoidVisitor<Void> methodNameVisitor = new Main();
        methodNameVisitor.visit(cu, null);
        List<Comment> comments = cu.getAllContainedComments();
        System.out.println(comments);
    }

}
