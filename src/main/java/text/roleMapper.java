package text;

import com.model.pojo.role;

public interface roleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(role record);

    int insertSelective(role record);

    role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(role record);

    int updateByPrimaryKey(role record);
}