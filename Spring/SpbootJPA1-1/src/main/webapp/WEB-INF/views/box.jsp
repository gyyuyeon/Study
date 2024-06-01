<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Box Page</title>
    <style>
      body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
      }

      table {
        border-collapse: collapse;
        width: 50%;
        margin: auto;
      }

      th,
      td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: center;
      }

      th {
        background-color: #f2f2f2;
      }
    </style>
  </head>
  <body>
    <table>
      <tr>
        <th>Header 1</th>
        <th>Header 2</th>
      </tr>
      <tr>
        <td>Data 1</td>
        <td>Data 2</td>
      </tr>
      <tr>
        <td>Data 3</td>
        <td>Data 4</td>
      </tr>
      <tr>
        <td>Data 5</td>
        <td>Data 6</td>
      </tr>
      <tr>
        <td>Data 7</td>
        <td>Data 8</td>
      </tr>
    </table>
  </body>
</html>
