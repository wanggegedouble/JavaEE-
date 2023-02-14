import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int num;
    private String code;

    public static void main(String[] args) {

    }
    public Student(){
        System.out.println("无参");
    }
}