package com.wpz.ar.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 01:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    private int code;
    private T data;
    private String msg;

    public static <V> R<V> ok(V data) {
        return new R<>(200, data, "");
    }

    public static R<Object> fail(String msg) {
        return new R<Object>(-1, null, msg);
    }
}
