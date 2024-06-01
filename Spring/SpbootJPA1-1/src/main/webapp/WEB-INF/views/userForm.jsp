<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>User Form</title>
  </head>
  <body>
    <h1>User Form</h1>
    <form action="/user" method="post">
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" required /><br />

      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required /><br />

      <input type="submit" value="Submit" />
    </form>
    <h2>${message}</h2>
  </body>
</html>
