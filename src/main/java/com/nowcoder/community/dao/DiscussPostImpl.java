package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;

import java.util.List;

public class DiscussPostImpl implements DiscussPostMapper {
    @Override
    public List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit) {
        return null;
    }

    @Override
    public int selectDiscussPostRows(int userId) {
        return 0;
    }
}
