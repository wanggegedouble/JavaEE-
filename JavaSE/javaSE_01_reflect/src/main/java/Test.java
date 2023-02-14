import static javax.print.attribute.standard.MediaSizeName.A;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlTree.A;

public class Test {
    public static void main(String[] args) {
        Test_interface testInterface = new Test_interface(){
            @Override
            public void sing() {
                System.out.println("hello");
            }
            @Override
            public void jump() {
                System.out.println("word");
            }
        };
        testInterface.jump();
    }
}
