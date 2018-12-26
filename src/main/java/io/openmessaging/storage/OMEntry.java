package io.openmessaging.storage;

public interface OMEntry {

    long getTerm();

    long getIndex();

    long getPos();

    long getSize();
}
