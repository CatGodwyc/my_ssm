package text;

public interface Response2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Response2 record);

    int insertSelective(Response2 record);

    Response2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Response2 record);

    int updateByPrimaryKey(Response2 record);
}