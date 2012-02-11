/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad;

import java.util.*;

public class ChatState {
	/** The list of messages */
	public List chat;
	/** The list of users */
	public List users;
	/** The lower bound of current messages */
	public int first;
	/** The upper bound of current messages */
	public int last;

	public ChatState() {
		chat = new ArrayList();
		users = new ArrayList();
		first = last = 0;
	}
}
