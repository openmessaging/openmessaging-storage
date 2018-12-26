package io.openmessaging.storage;

import java.nio.ByteBuffer;

public interface OMBufferHolder {

    long  getStartPos();

    int getSize();

    ByteBuffer getByteBuffer();

    void release();
}
