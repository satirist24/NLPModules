package satirist24.nlp.core;

/**
 * Created on 14.03.15.
 */
public interface Token<E> {
    
    E getValue();
    
    E getNormalized();
    
}
