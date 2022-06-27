package jsoncoreprograms;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDAO {
    Integer studId;

    String studName;
    Integer studRoll;
    Long studMobile;

    public StudentDAO(Integer studId, String studName, Integer studRoll, Long studMobile) {
        this.studId = studId;
        this.studName = studName;
        this.studRoll = studRoll;
        this.studMobile = studMobile;
    }

    @Override
    public String toString() {
        return "StudentDAO" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studRoll=" + studRoll +
                ", studMobile=" + studMobile +
                '}';
    }

}
