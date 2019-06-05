package com.qfedu.boot1901.entity;

import lombok.Data;

@Data//自动生成geter和seter方法
public class News {
    private int id;
    private String title;
    private String content;
    private String ctime;

}
