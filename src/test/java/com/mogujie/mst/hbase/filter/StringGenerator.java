package com.mogujie.mst.hbase.filter;

/**
 * Created by fenqi on 16/6/30.
 */
public interface StringGenerator {
    String get(String... seeds);
}
