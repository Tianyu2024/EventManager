package cn.tianyu.client.event.events.game;

/**
 * @Author: CN_tianyu
 */
public class EventTick {
    private final long tickTime;

    public EventTick(long tickTime) {
        this.tickTime = tickTime;
    }

    public long getTickTime() {
        return tickTime;
    }
}
