package com.wildbeeslabs.sensiblemetrics.sqoola.producer.impl;

import com.wildbeeslabs.sensiblemetrics.sqoola.producer.EventProducer;
import com.wildbeeslabs.sensiblemetrics.sqoola.producer.OperationEventProducer;

public abstract class OperationEventProducerImpl<E> implements OperationEventProducer<E> {

    @Override
    public void notify(final E event) {
        getEventProducer().emit(event);
    }

    protected abstract EventProducer<E> getEventProducer();
}
