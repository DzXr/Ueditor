package com.fl.sqlbase;

import com.fl.bean.Ueditor;

import java.util.List;

/**
 * Created by chenfeilong on 2017/10/18.
 */
public interface SqlInterface {
    void add(Ueditor ueditor);
    void delete(String id);
    void update(Ueditor ueditor);
    Ueditor find(String id);
    List<Ueditor> pageList();
}
