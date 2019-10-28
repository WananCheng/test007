package cn.cjp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    private Integer id;
    private String username;
    private String password;
    private String salt;
    private Integer rold_id;

    public String  getCredentialsSal(){
        return username + salt;
    }
}
