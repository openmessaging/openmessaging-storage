package io.openmessaging.storage;

public interface OMAppendResult {
    long getTerm();

    long getIndex();

    long getPos();

    int getSize();
}
