import java.util.Collection;

public interface IFilterer {

    Collection<Message> filter(Collection<Message> conversation);

}
