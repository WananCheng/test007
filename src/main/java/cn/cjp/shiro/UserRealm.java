package cn.cjp.shiro;

import cn.cjp.entity.User;
import cn.cjp.entity.Users;
import cn.cjp.service.UserService;
import cn.cjp.service.UsersService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UsersService usersService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        Users users = usersService.selectUsersByName(username);
        if(users == null)
            throw new UnknownAccountException();

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                users.getUsername(),
                users.getPassword(),
                ByteSource.Util.bytes(users.getCredentialsSal()),
                getName()
        );
        return authenticationInfo;

    }
}
