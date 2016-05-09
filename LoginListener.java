/**
 *This listener will be listening for a button 
 *press in the login screen and the controller.
 *
 * @author ShawnWilliams
 */

package SAIN_Report;

import java.util.EventListener;

/**
 * The listener interface for receiving login events.
 * The class that is interested in processing a login
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addLoginListener<code> method. When
 * the login event occurs, that object's appropriate
 * method is invoked.
 *
 * @see LoginEvent
 */
public interface LoginListener extends EventListener{
  
  /**
   * Button clicked.
   *
   * @param le the le
   */
  public void buttonClicked(LoginEvent le);
}