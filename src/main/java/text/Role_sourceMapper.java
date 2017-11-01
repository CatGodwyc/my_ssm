package text;

public interface Role_sourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role_source record);

    int insertSelective(Role_source record);

    Role_source selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role_source record);

    int updateByPrimaryKey(Role_source record);
}