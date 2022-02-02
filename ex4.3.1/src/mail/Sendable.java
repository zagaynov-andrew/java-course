package mail;

/**
 * An entity interface that can be sent by mail.
 * From such an entity, you can get a letter from whom and to whom.
 */
public interface Sendable {
    String getFrom();
    String getTo();
}
