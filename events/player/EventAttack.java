package cn.tianyu.client.event.events.player;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.entity.Entity;

/**
 * @Author: CN_tianyu
 */
@Getter
public class EventAttack {
    private final boolean pre;
    @Setter
    private Entity target;

    public EventAttack(Entity entity, boolean pre) {
        this.target = entity;
        this.pre = pre;
    }

    public boolean isPost() {
        return !pre;
    }
}
