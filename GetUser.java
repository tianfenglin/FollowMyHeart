package come.pass.time.dao;

import org.springframework.stereotype.Repository;

import come.pass.time.model.UserInfo;


//@MapperScan 可以用
@Repository
public interface GetUser {

	public UserInfo selectUserById();
}
