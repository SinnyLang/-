package com.ershoujiaoyi.servlet;

import com.ershoujiaoyi.service.MangerOrder;
import com.ershoujiaoyi.service.impl.MangerOrderImpl;

public interface MangerOrderService {
    MangerOrder mangerOrder = new MangerOrderImpl();
}
