class LRUCache:
    # @param capacity, an integer
    def __init__(self, capacity):
        self.cache = {}
        self.capacity = capacity
        self.queue = []
        

    # @return an integer
    def get(self, key):
        if key in self.cache:
            self.updateQueue(key)
            return self.cache[key]
        else:
            return -1
        

    # @param key, an integer
    # @param value, an integer
    # @return nothing
    def set(self, key, value):
        if key in self.cache:
            self.cache[key] = value
            self.updateQueue(key)
        else:
            if len(self.queue) == self.capacity:
                del self.cache[self.queue.pop(0)]
            self.cache[key] = value
            self.queue.append(key)
        
    def updateQueue(self, key):
        self.queue.remove(key)
        self.queue.append(key)