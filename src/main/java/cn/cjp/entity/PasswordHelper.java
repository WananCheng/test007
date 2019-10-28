package cn.cjp.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;

@Data
@Accessors(chain = true)
@Component
public class PasswordHelper {

    //实例化RandomNumberGenerator对象，用于生成一个随机数
    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    //散列算法名称
    private String algoitName = "md5";

    //散列迭代次数
    private Integer hashInterations = 2;

    //加密算法
    public void encryptPassword(Users users){
        if (users.getPassword() != null){
            //对User对象设置盐值，盐值是生成的随机数
            users.setSalt(randomNumberGenerator.nextBytes().toHex());

            //调用SimpleHash指定散列算法参数
            String newPassword = new SimpleHash(
                    algoitName,
                    users.getPassword(),
                    ByteSource.Util.bytes(users.getCredentialsSal()),
                    hashInterations).toHex();
                users.setPassword(newPassword);

        }
    }

}
