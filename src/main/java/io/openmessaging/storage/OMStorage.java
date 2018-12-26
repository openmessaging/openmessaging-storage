package io.openmessaging.storage;

import java.util.concurrent.CompletableFuture;

public interface OMStorage {

    OMAppendResult append(OMEntry entry);

    CompletableFuture<OMAppendResult> append(OMEntry entry, OMAppendHook hook);

    OMEntry get(long index);

    long minIndex();

    long maxIndex();


    OMBufferHolder slice(long startPos, int size);

    long minPos();

    long maxPos();

}
