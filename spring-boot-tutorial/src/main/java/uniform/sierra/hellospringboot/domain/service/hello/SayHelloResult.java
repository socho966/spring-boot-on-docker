package uniform.sierra.hellospringboot.domain.service.hello;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SayHelloResult implements Serializable {
    private static final long serialVersionUID = 0L;

    private String name;
    private long num;
    private LocalDateTime lastVisited;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public LocalDateTime getLastVisited() {
        return lastVisited;
    }

    public void setLastVisited(LocalDateTime lastVisited) {
        this.lastVisited = lastVisited;
    }
}
