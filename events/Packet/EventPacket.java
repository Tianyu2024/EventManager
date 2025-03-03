package cn.tianyu.client.event.events.Packet;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;

/**
 * @Author: CN_tianyu
 */

@Getter
@Setter
public class EventPacket{
    private final EventState eventType;
    public Packet packet;
    private final INetHandler netHandler;

    public EventPacket(EventState eventType, Packet packet, INetHandler netHandler) {
        this.eventType = eventType;
        this.packet = packet;
        this.netHandler = netHandler;
    }

    public enum EventState {
        SEND,
        RECEIVE
    }
}
