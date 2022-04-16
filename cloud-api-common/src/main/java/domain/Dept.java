package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept {
    private Integer deptno;
    private String dname;
    private String db_source;
    private Date date;
}
