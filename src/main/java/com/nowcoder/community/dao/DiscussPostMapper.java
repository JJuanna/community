package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    // 考虑分页,offset指的是起始行行号,limit指的是每页显示多少
    List<DiscussPost> selectDiscussPosts (int userId, int offset, int limit);

    // 查询一共有多少条数据,用注解给参数起一个别名
    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id, int commentCount);

    // 修改帖子的状态，包括置顶，加精和删除
    int updateType(int id, int type);

    int updateStatus(int id, int status);

    int updateScore(int id, double score);

}
