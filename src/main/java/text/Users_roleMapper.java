package text;

public interface Users_roleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users_role record);

    int insertSelective(Users_role record);

    Users_role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users_role record);

    int updateByPrimaryKey(Users_role record);
}