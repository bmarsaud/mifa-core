package fr.mifa.core.models;

public class TextMessage extends Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextMessage(String roomName, String text) {
        super(roomName);
        this.text = text;
    }
}
