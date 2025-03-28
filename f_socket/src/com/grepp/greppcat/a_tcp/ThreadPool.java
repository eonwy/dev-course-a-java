package com.grepp.greppcat.a_tcp;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {

    private final List<Thread> threads = new ArrayList<Thread>();
    private final LinkedBlockingQueue<Socket> taskQueue = new LinkedBlockingQueue<Socket>();


    private static ThreadPool instance;

    private ThreadPool(int threadCnt) {

    }

    public static ThreadPool init(int threadCnt) {
        if (instance == null) {
            instance = new ThreadPool(threadCnt);
        }

        return instance;
    }

    public void addTask(Socket socket) {
        taskQueue.add(socket);
    }
}
