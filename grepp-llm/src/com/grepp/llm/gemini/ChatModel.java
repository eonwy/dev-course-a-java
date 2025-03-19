package com.grepp.llm.gemini;

public interface ChatModel {
    Response invoke(Request request);
}