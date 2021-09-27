package com.qingcheng.pojo.goods;

import java.io.Serializable;
import java.util.List;

public class Goods implements Serializable {
    private Spu spu;
    private List<Sku> list;

    public Spu getSpu() {
        return spu;
    }

    public void setSpu(Spu spu) {
        this.spu = spu;
    }

    public List<Sku> getList() {
        return list;
    }

    public void setList(List<Sku> list) {
        this.list = list;
    }
}
