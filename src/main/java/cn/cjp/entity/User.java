package cn.cjp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Integer id;
    private String  username;
    private String  password;
    private String salt;
    private String CredentialsSalt;

    public String getCredentialsSalt(){
        return username + salt;
    }
}
