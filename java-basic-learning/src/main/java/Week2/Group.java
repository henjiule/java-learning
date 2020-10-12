package Week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Group
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private String groupName;
    private Student[] students;
}
