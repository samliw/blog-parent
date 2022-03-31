package com.blog.component.mapper.content;

import com.blog.component.entity.content.CarouselMap;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface CarouselMapMapper {
    List<CarouselMap> getAll();
}
