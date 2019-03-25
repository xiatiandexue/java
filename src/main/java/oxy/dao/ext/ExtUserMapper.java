package oxy.dao.ext;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ExtUserMapper {
	List<Map<String, String>> listUser(@Param("no")String delete, @Param("ad")String admin);
}
