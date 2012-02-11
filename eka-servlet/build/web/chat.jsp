<%-- 
    Document   : chat
    Created on : Jan 17, 2012, 8:30:10 PM
    Author     : vkesola
--%>

<html>

<head>
	<title>Let's Chat by Servlet</title>
	<meta name="version"
		content="$Id: chat.jsp,v 1.2 2004/02/09 03:34:01 ian Exp $" />
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

</head>

<body>
<h1>Let's Chat by Servlet... </h1>
<form action="ChatServlet" method="post">
<p>
<!-- Set rows to 10 but only print 10, needed on some browsers -->
<textarea name="chat" rows="10" cols="60">
<%
	// Set the content of the textArea to the history.
	wad.ChatState chat = (wad.ChatState)application.getAttribute(wad.ChatConstants.APP_STATE);
	// assert(chat != null);

	int start = Math.max(chat.first, chat.last-10);
	for (int i=start; i<chat.last; i++) {
		out.println(i + ": " + chat.chat.get(i));
	}
 %>
</textarea>
<br/>
I say: <input type="text" name="iSay" size="60"/>
<br/>
<input type="submit" name="do_it" value="Talk/Refresh"/>
</p>
</form>
test
</body>
</html>
