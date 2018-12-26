package io.openmessaging.storage;

public interface OMStorage {

    OMAppendResult append(OMEntry entry);

    OMEntry get(long index);

    long minIndex();

    long maxIndex();


    OMBufferHolder slice(long startPos, int size);

    long minPos();

    long maxPos();

}
