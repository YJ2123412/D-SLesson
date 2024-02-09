package jdbc.Project2_SS.VO;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode

public class TBL_CustomerVo {
    private String id;
    private String name;
    private int age;
    private String phone;
   
    public TBL_CustomerVo(String id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "id=" + id + ", 이름: " + name + ", age=" + age + ", phone=" + phone + "]";
    } 

 

}
