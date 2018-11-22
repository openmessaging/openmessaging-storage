# openmessaging-storage

A dead-simple unified ordered storage, act as the persistent layer of messaging and streaming system.



### append
    /**
     * Append data to the end of leger, and it should be assigned an index in numerical order strictly 0,1,2,3...
     * @param data
     * @return 0 means success, others means failure
     */
    int append(byte[] data);
### get
    /**
     * Get data according to the index
     * @param index
     * @return
     */
    byte[] get(long index);