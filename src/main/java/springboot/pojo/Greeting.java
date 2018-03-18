package springboot.pojo;

import java.util.UUID;

public class Greeting {
    private final long id;
    private final String content;
    private final String uuid;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.uuid = UUID.randomUUID().toString();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public String getUuid() {
    	return uuid;
    }
}
