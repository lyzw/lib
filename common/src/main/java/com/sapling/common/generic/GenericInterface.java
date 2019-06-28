package com.sapling.common.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * description: 泛型基础的接口，提供了泛型相关的接口的一些基础实现
 *
 * @author wei.zhou
 * @date 2019/6/28 16:04
 */
public interface GenericInterface {

    default Type getActualType() {
        return ((ParameterizedType) this.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
    }
}
