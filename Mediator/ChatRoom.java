package Mediator;

import java.util.ArrayList;

public class ChatRoom {
    private final String chatRoomName;

    final ArrayList<ChatRoomUser> users = new ArrayList<>();

    public ChatRoom(final String chatRoomName) {
        this.chatRoomName = chatRoomName;
    }

    public String getChatRoomName() {
        return chatRoomName;
    }

    public void registerChatUser(ChatRoomUser user) {
        users.add(user);
    }

    public void unregisterChatUser(ChatRoomUser user) {
        users.remove(user);
    }

    public void notifyAllUsers(final String msg) {
        users.forEach(u -> u.receiveMsg(msg));
    }
}
