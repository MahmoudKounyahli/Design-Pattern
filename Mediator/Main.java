package Mediator;

public class Main {
    public static void main(String[] args) {
        final var chatRoom = new ChatRoom("random name");
        final var user1 = new ChatRoomUser("user1");
        final var user2 = new ChatRoomUser("user2");
        final var user3 = new ChatRoomUser("user3");

        user1.setChatRoom(chatRoom);
        user2.setChatRoom(chatRoom);
        user3.setChatRoom(chatRoom);

        user1.sendMsg("Hello everybody!");

        user3.leaveChatRoom();

        user2.sendMsg("Hello user1!");
    }
}