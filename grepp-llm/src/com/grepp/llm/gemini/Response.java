package com.grepp.llm.gemini;

import java.util.List;
import java.util.Map;

public interface Response {
    List<Map<String, Object>> response();
}