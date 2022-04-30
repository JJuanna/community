package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

//    考虑分页,offset指的是起始行行号,limit指的是每页显示多少
    List<DiscussPost> selectDiscussPosts (int userId, int offset, int limit);

//     查询一共有多少条数据,用注解给参数起一个别名
//    如果这个方法只有一个参数，并且在<if>里使用，必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);


}