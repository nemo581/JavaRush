package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticManager {
    private final StatisticStorage statisticStorage = new StatisticStorage();
    private static StatisticManager instance;
    public void register(EventDataRow edr) {

    }

    public static StatisticManager getInstance() {
        if (instance ==null) {
            instance = new StatisticManager();
        }
        return instance;
    }

    private StatisticManager() {
    }

    private static class StatisticStorage {
        Map<EventType, List<EventDataRow>> storage;

        public StatisticStorage() {
            storage = new HashMap<>();
            for (int i = 0; i < EventType.values().length; i++) {
                storage.put(EventType.values()[i], new ArrayList<EventDataRow>());
            }
        }
    }
}
