# openmessaging-storage

An append only storage with infinite capacity.  
The minimal storage unit is called entry.  
And assign each entry with a logic number, which called entry index.  
So in summary, it contains two parts, entry index and entry data.  
#### Entry Index
The logic number of the entry.  
0, 1, 2, 3, 4, ..., k, k + 1, ..., increase progressively one by one.

#### Entry Data
Map to the index with the original content.  

#### Pos
Although openmessaging storage could be implemented by any underlying storage, such as file, db, memory, etc.  
But the data model is instinctively to be viewed as a single continuous file or memory with infinite capacity.  
So providing some native api to access the original content in a buffered way  will improve much performance, especially during the co-operational transferring.   
In terms of this, the pos means a virtual position of the continuous file or memory. It is a little similar to the virtual memory mechanism in linux operation system.   

## Minimal API
OMAppendResult append(OMEntry entry);

OMEntry get(long index);

long minIndex();

long maxIndex();
    
## Optional API

CompletableFuture<OMAppendResult> append(OMEntry entry, OMAppendHook hook);

OMBufferHolder slice(long startPos, int size);
 
long minPos();
 
long maxPos();





