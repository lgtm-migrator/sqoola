package com.wildbeeslabs.sensiblemetrics.sqoola.common.producer;

public interface TransactionObserver<T> {

    void onComplete(final T transaction);
}