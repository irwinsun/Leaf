package com.tencent.devops.leaf;

import com.tencent.devops.leaf.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
