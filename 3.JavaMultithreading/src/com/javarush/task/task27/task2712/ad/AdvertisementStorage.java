package com.javarush.task.task27.task2712.ad;

public class AdvertisementStorage {     //  хранилище рекламных роликов
    private static class AdvertisementStorageHolder {
        private static final AdvertisementStorage ADVERTISEMENT_STORAGE_HOLDER = new AdvertisementStorage();
    }

    public static AdvertisementStorage getInstance() {
        return AdvertisementStorageHolder.ADVERTISEMENT_STORAGE_HOLDER;
    }

    private AdvertisementStorage() {
    }
}