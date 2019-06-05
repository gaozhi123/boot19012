package com.qfedu.boot1901.service;

import com.qfedu.boot1901.entity.News;
import com.qfedu.boot1901.vo.R;

public interface NewsService {
    R save(News news);
    R queryAll();
}
