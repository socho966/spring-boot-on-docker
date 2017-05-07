package uniform.sierra.hellospringboot.domain.model;

import java.time.LocalDateTime;

public class HelloHistory {
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
