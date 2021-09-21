package top.jiangyixihn.wiki.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/4/17
 */
public class CopyUtil {

    /**
     * 单对象复制
     *
     * @param source 来源
     * @param clazz  目标类对象
     * @param <T>    泛型类对象
     * @return 目标对象实例
     */
    public static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        T obj = null;
        try {
            obj = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        BeanUtils.copyProperties(source, obj);
        return obj;
    }

    /**
     * 列表复制
     *
     * @param source 来源
     * @param clazz  目标类对象
     * @param <T>    泛型类对象
     * @return 目标对象列表
     */
    public static <T> List<T> copyList(List<?> source, Class<T> clazz) {
        List<T> target = new ArrayList<>();
        if (!CollectionUtils.isEmpty(source)) {
            for (Object item : source) {
                T obj = copy(item, clazz);
                target.add(obj);
            }
        }
        return target;
    }
}
