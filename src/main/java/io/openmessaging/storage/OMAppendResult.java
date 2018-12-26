package io.openmessaging.storage;

public interface OMAppendResult {
    long getCode();

    long getTerm();

    long getIndex();

    long getPos();

    int getSize();
}
