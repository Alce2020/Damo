package test5;

import java.io.Serializable;

/**
 * @title: User
 * @Author lijing
 * @Date: 2022/3/25 16:22
 * @Version 1.0
 * @description:
 */
public class User implements Serializable {
    private static final long serialVersionUID = 823374762080737966L;
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
