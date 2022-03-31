package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemNotice;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemNoticeMapper {
    List<SystemNotice> getAll();
}
