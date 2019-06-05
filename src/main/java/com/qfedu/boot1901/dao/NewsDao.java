package com.qfedu.boot1901.dao;

import com.qfedu.boot1901.entity.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NewsDao {
    @Insert("insert into news(title,content,ctime) values(#{title},#{content},now())")
    int insert(News news);

    @Select("select id,title,content,ctime from news order by ctime desc ")
    List<News> queryAll();

}
