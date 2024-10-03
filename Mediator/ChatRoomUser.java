package Mediator;

import java.util.Objects;

public class ChatRoomUser {
    ChatRoom chatRoom;
    String name;
    public ChatRoomUser(String name) {
        this.name = name;
    }

    public void receiveMsg(final String msg) {
        System.out.printf("I'm %s and i got this msg: %s\n".formatted(name, msg));
    }

    public void sendMsg(final String msg) {
        if (Objects.nonNull(chatRoom)) {
            chatRoom.notifyAllUsers(msg);
        }
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
        this.chatRoom.registerChatUser(this);
    }

    public void leaveChatRoom() {
        this.chatRoom.unregisterChatUser(this);
        this.chatRoom = null;
    }

}
