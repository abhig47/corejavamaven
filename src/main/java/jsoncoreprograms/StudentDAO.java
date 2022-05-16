package jsoncoreprograms;

import org.omg.PortableInterceptor.INACTIVE;

public class StudentDAO {
    Integer studId;

    String name;
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

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public Integer getStudRoll() {
        return studRoll;
    }

    public void setStudRoll(Integer studRoll) {
        this.studRoll = studRoll;
    }

    public Long getStudMobile() {
        return studMobile;
    }

    public void setStudMobile(Long studMobile) {
        this.studMobile = studMobile;
    }
}
